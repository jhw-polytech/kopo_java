package kr.ac.jinwoo.day12.homework.BoardHomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class DB implements SQL, Storable {

	private int maxCnt = 100;

	private FileReader userFileReader;
	private FileWriter userFileWriter;
	private BufferedReader bufReader;
	private BufferedWriter bufWriter;
	private PrintWriter printWriter;

	boolean bOpenReadBuf = false;
	boolean bOpenWriteBuf = false;

	String filePath;

	protected Data[] dataArr = new Data[100];
	private int dataCnt = 0;

	DB(String path) {
		this.filePath = path;
		open();
	}

	public int getMaxCnt() {
		return maxCnt;
	}

	public int getDataCnt() {
		return dataCnt;
	}

	public abstract boolean insertDataToDB(Data data);

	public abstract boolean deleteDataToDB(Data data);

	public String makeDBFormat(String str) {
		return "," + str;
	}

	@Override
	public abstract void getDataToDB();

	public boolean chkServerCapacity() {

		return dataCnt < 100 ? true : false;
	}

	@Override
	public boolean open() {

		boolean ret = false;

		ret = openReadBuf();

		if (ret) {
			String line = "";
			try {
				while ((line = bufReader.readLine()) != null) {
					dataArr[dataCnt] = new Data();
					dataArr[dataCnt].setDataLine(line);
					dataCnt++;
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("Data : " + dataCnt);
		}
		closeReadBuf();

		return ret;
	}

	@Override
	public boolean insert(Data data) {

		boolean ret = true;

		if (!chkServerCapacity()) {
			ret = false;
		}

		if (ret) {
			// 이어쓰기.
			ret = openWriteBuf(false);

			if (ret) {
				String arr[] = data.getDataLine().split(",", 2);

				data.setNum(dataCnt + 1);
				data.setDataLine(Integer.toString(dataCnt + 1) + "," + arr[1]);

				printWriter.write(Integer.toString(dataCnt + 1) + "," + arr[1]);
				printWriter.write(System.lineSeparator());

				dataArr[dataCnt] = data;
				dataCnt++;
			}
			closeWriteBuf(false);
		}
		

		return ret;
	}

	@Override
	public String select(Data data) {

		String ret = null;

		for (int i = 0; i < dataCnt; i++) {

			String arr[] = dataArr[i].getDataLine().split(",", 2);
			String str = arr[1];

			String arr2[] = data.getDataLine().split(",", 2);
			String str2 = arr2[1];

			if (str2.equals(str)) {

				str = arr[0] + "," + arr[1];
				ret = str;
				break;
			}
		}

		return ret;
	}

	public String[] select(Data data, int numberOfDataTypes, int extractArgNum) {

		String[] ret = new String[selectCnt(data, numberOfDataTypes, extractArgNum)];

		int idx = 0;
		String dataLine = data.getDataLine();
		String[] arr = dataLine.split(",", numberOfDataTypes);

		for (int i = 0; i < dataCnt; i++) {

			String[] tmp = dataArr[i].getDataLine().split(",", numberOfDataTypes);

			if (arr[extractArgNum].equals(tmp[extractArgNum])) {
				ret[idx] = dataArr[i].getDataLine();
				idx++;
			}
		}

		return ret;
	}

	public int selectCnt(Data data, int numberOfDataTypes, int extractArgNum) {

		int cnt = 0;

		String dataLine = data.getDataLine();
		String[] arr = dataLine.split(",", numberOfDataTypes);

		for (int i = 0; i < dataCnt; i++) {

			String[] tmp = dataArr[i].getDataLine().split(",", numberOfDataTypes);

			if (arr[extractArgNum].equals(tmp[extractArgNum]))
				cnt++;

		}

		return cnt;
	}

	public Data[] selectAll() {

		Data retArr[] = new Data[dataCnt];

		for (int i = 0; i < retArr.length; i++) {
			retArr[i] = dataArr[i];
		}

		return retArr;
	}

	@Override
	public boolean delete(Data data) {

		boolean ret = false;

		String line = "";
		String dummy = "";

		String str = null;

		str = select(data);

		// 유저가 맞는지 확인
		if (str != null) {

			for (int i = 0; i < dataCnt; i++) {

				String dataLine = dataArr[i].getDataLine();

//				if (data.getDataLine().equals(dataLine)) {
				if (str.equals(dataLine)) {
					
					ret = openReadBuf();
					ret = openWriteBuf(true);
					
					// dummy에 유저 전까지 정보를 저장
					for (int j = 0; j < i; j++) {

						line = dataArr[j].getDataLine();
						dummy += (line + System.lineSeparator());
					}
					// dummy에 유저 뒤의 정보를 이어서 저장
					for (int j = i; j < dataCnt; j++) {
						if (j == dataCnt - 1) {
							dataArr[j] = null;
						} else {

							dataArr[j] = dataArr[j + 1];

							String arr[] = dataArr[j].getDataLine().split(",", 2);
							dataArr[j].setNum(Integer.parseInt(arr[0]) - 1);

							line = Integer.toString(Integer.parseInt(arr[0]) - 1) + "," + arr[1];
							dataArr[j].setDataLine(line);

							dummy += (line + System.lineSeparator());
						}
					}
					dataCnt--;

					try {
						userFileWriter.write(dummy);
					} catch (IOException e) {
						e.printStackTrace();
					}

					ret = true;
					
					closeReadBuf();
					closeWriteBuf(true);
					
					break;
				}
			}
		}



		return ret;
	}

	@Override
	public boolean update(Data origin, Data change) {

		boolean ret = false;

		String line = "";
		String dummy = "";
		
		// 유저가 맞는지 확인
		for (int i = 0; i < dataCnt; i++) {

			String dataLine = dataArr[i].getDataLine();

			if (origin.getDataLine().equals(dataLine)) {

				ret = openReadBuf();
				ret = openWriteBuf(true);
				// dummy에 유저 전까지 정보를 저장
				for (int j = 0; j < i; j++) {

					line = dataArr[j].getDataLine();
					dummy += (line + System.lineSeparator());
				}

				// update
				String update[] = change.getDataLine().split(",", 2);
				dataArr[i].setNum(Integer.parseInt(update[0]));
				
				line = Integer.toString(Integer.parseInt(update[0])) + "," + update[1];
				dataArr[i].setDataLine(line);
				dummy += (line + System.lineSeparator());

				// dummy에 유저 뒤의 정보를 이어서 저장
				for (int j = i+1; j <= dataCnt; j++) {
					if (j > dataCnt - 1) {
						dataArr[j] = null;
					} else {

						String arr[] = dataArr[j].getDataLine().split(",", 2);
						dataArr[j].setNum(Integer.parseInt(arr[0]));
						line = Integer.toString(Integer.parseInt(arr[0])) + "," + arr[1];

						dummy += (line + System.lineSeparator());
					}

				}

				try {
					userFileWriter.write(dummy);
				} catch (IOException e) {
					e.printStackTrace();
				}
				ret = true;
				closeReadBuf();
				closeWriteBuf(true);
				break;
			}
		}
		
		return ret;
	}


	@Override
	public boolean openReadBuf() {

		boolean ret = true;

		try {
			userFileReader = new FileReader(filePath);
			bufReader = new BufferedReader(userFileReader);
			bOpenReadBuf = true;
		} catch (FileNotFoundException e) {
			ret = false;
		}
		return ret;
	}

	@Override
	public boolean closeReadBuf() {

		boolean ret = false;

		if (bOpenReadBuf) {
			try {
				userFileReader.close();
				bufReader.close();
				ret = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	@Override
	public boolean openWriteBuf(boolean coverWrite) {

		boolean ret = true;

		try {
			if (!coverWrite)
				userFileWriter = new FileWriter(filePath, true);
			else
				userFileWriter = new FileWriter(filePath, false);

			bufWriter = new BufferedWriter(userFileWriter);
			bOpenWriteBuf = true;

			// 이어쓰기의 경우
			if (!coverWrite) {
				printWriter = new PrintWriter(bufWriter, true);
			}
		} catch (IOException e) {
			e.printStackTrace();
			ret = false;
		}

		return ret;
	}

	@Override
	public boolean closeWriteBuf(boolean coverWrite) {

		boolean ret = false;

		if (bOpenWriteBuf) {
			try {
				bufWriter.close();
				userFileWriter.close();

				// 이어쓰기의 경우
				if (!coverWrite)
					printWriter.close();

				ret = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

}
