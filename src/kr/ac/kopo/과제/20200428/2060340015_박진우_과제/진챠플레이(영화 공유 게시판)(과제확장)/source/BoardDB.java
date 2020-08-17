package kr.ac.jinwoo.day12.homework.BoardHomework;

public class BoardDB extends DB {

	// 게시물 저장소
	private static Board boardArr[] = new Board[100];
	
	BoardDB() {
		super("D:\\Lecture\\javaEE_workspace\\java\\myBoardDB.txt");
		getDataToDB();
	}
	
	@Override
	public void getDataToDB() {
		
		String line = "";
		
		for(int i = 0; i < super.getMaxCnt(); i++) {
			boardArr[i] = null;
		}
		
		for(int i = 0; i < super.getDataCnt(); i++) {
			
			line = super.dataArr[i].getDataLine();
			String[] arr = line.split(",", 5);
			boardArr[i] = new Board(arr[1], arr[2], arr[3], arr[4]);
			boardArr[i].setNum(i+1);
			boardArr[i].setDataLine(line);
		}
		System.out.println("Board : " + super.getDataCnt());
	
	}
	
	@Override
	public boolean insertDataToDB(Data data) {
		
		boolean ret = false;
		
		Board board = (Board)data;
		
		board.setNum(super.getDataCnt() + 1);
		
		String dataLine = board.getTitle() + "," + board.getWriter() + "," + board.getDate() + "," +board.getContents();
		
		board.setDataLine(super.makeDBFormat(dataLine));
		ret = insert(board);
		
		if(ret) {
			getDataToDB();
		}
		
		return ret;
	}
	
	public Board[] selectAllData() {
		
		Board board[] = new Board[super.getDataCnt()];
		
		Data d[] = super.selectAll();
		
		for(int i = 0; i < d.length; i++) {
			
			String arr[] = d[i].getDataLine().split(",", 5);
			
			board[i] = new Board(arr[1], arr[2], arr[3], arr[4]);
			board[i].setNum(Integer.parseInt(arr[0]));
			board[i].setDataLine(d[i].getDataLine());
		}
		
		return board;
	}
	
	public Board selectDataToDB(int num) {
		
		Board ret = null;
		String chkStr = null;
		
		for(int i = 0; i < super.getDataCnt(); i++) {
			
			if(boardArr[i].getNum() == num) {
				String str = Integer.toString(boardArr[i].getNum()) + "," + boardArr[i].getTitle() + "," + boardArr[i].getWriter()
						+ "," + boardArr[i].getDate() + "," + boardArr[i].getContents();
				Data d = new Data();
				d.setDataLine(str);
				chkStr = super.select(d);
				
				if(chkStr != null) {
					
					String arr[] = chkStr.split(",", 5);
					
					ret = new Board(arr[1], arr[2], arr[3], arr[4]);
					ret.setNum(Integer.parseInt(arr[0]));
					ret.setDataLine(chkStr);
					break;
				}
			}
		}
		
		return ret;
	}
	
	public int getUserBoardCnt(String userName) {
		
		Board board = new Board("", userName, "", "");
		board.setDataLine(super.makeDBFormat(board.getDataLine()));
		
		return super.selectCnt(board, 5, 2);
	}

	public Board[] selectUserBoard(String userName) {
		
		Board tmp = new Board("", userName, "", "");
		tmp.setDataLine(super.makeDBFormat(tmp.getDataLine()));
		
		String dataLine[] = super.select(tmp, 5, 2);
		
		Board board[] = null;
		
		if(dataLine.length != 0) {
			board = new Board[dataLine.length];
			for(int i = 0; i < dataLine.length; i++) {
				
				String arr[] = dataLine[i].split(",", 5);
				board[i] = new Board(arr[1], arr[2], arr[3], arr[4]);
				board[i].setNum(Integer.parseInt(arr[0]));
				board[i].setDataLine(dataLine[i]);
			}
		}
		
		return board;
	}
	
	
	
	@Override
	public boolean deleteDataToDB(Data data) {
		
		boolean ret = false;
		
		Board board = (Board)data;
		
		String dataLine = Integer.toString(board.getNum()) + "," + board.getTitle() + "," + board.getWriter() + "," + board.getDate() + "," + board.getContents();
		
		board.setDataLine(dataLine);
		
		ret = super.delete(board);
		
		if(ret) {
			getDataToDB();
			boardArr[super.getDataCnt()] = null;
		}
		
		return false;
	}
	
	public boolean deleteBoard(String userName, int num) {
		
		boolean ret = false;
		
		Board board = new Board("", userName, "", "");
		board.setNum(num);
		
		String tmp = Integer.toString(num) + ", ," + userName + ", ,";
		
		board.setDataLine(tmp);
		
		String str[] = super.select(board, 5, 0);
		
		String arr[] = str[0].split(",", 5);
		
		if(arr[2].equals(userName)) {
			
			board.setDataLine(str[0]);
			board.setNum(Integer.parseInt(arr[0]));
			board.setTitle(arr[1]);
			board.setWriter(arr[2]);
			board.setDate(arr[3]);
			board.setContents(arr[4]);
			
			ret = deleteDataToDB(board);
		
		}
		else
			ret = false;

		return ret;
	}

	public boolean updateUserBoard(int num, String title, String userName, String date, String contents) {
		
		boolean ret = true;
		
		Board origin = boardArr[num-1];
		
		Board change = new Board(title, userName, date, contents);
		change.setNum(num);
		
		change.setDataLine(Integer.toString(num)  + "," + change.getDataLine());
		
		ret = super.update(origin, change);
		
		if(ret) 
			getDataToDB();

		return ret;
	}

}
