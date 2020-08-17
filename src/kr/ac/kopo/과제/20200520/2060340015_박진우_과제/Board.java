package kr.ac.kopo.day15.homework;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class Board {

	private List<Data> list = new ArrayList<>();
	
	Board() {
		readBoard();
	}
	
	// 날짜 생성 메소드
	public String makeDate() {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date()); 
		
		return date;
	}
	
	public void readBoard() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("iohomework/boardList.txt");
			ois = new ObjectInputStream(fis);

			try {
				while (true) {
					list = (List<Data>)ois.readObject();
				}
			} catch (EOFException e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis, ois);
		}
	}
	
	public void refreshBoard() {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("iohomework/boardList.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos, oos);
		}
	}
	
	public int getBoardCnt() {
		
		return list.size();
	}

	// 조회 시 있으면 데이터 반환. 없으면 null 반환
	public Data select(int num) {
		
		Data retData = null;
		
		if(num <= list.size())
			retData = list.get(num-1);
		
		return retData;
	}
	
	// 데이터 삽입 메소드. 삽입하면 true, 게시판 꽉 차있으면 false 반환
	public boolean insert(String title, String writer) {
		
		boolean ret = true;
		
		if(ret) {
			
			// 날짜
			String date = makeDate();
			
			Data data = new Data(list.size() + 1, title, writer, date);
			
			list.add(data);
		}
		
		refreshBoard();
		
		return ret;	
	}
	
	// 게시물 수정 메소드. 입력받은 번호의 게시물을 입력받은 Data로 수정
	public boolean update(int num, String title, String writer) {
		
		boolean ret = true;
	
		if(num > list.size())
			ret = false;
		
		if(ret) {
			
			Data data = list.get(num-1);
			data.setTitle(title);
			data.setWriter(writer);
			
			list.set(num-1, data);
		}
		
		refreshBoard();
		
		return ret;
	}
	
	// 게시물 삭제 메소드. 입력받은 번호의 게시물을 입력받은 Data로 수정
	public boolean delete(int num) {
			
		boolean ret = true;
		
		if(num > list.size())
			ret = false;
			
		if(ret) {
			
			list.remove(num-1);
			for(int i = num-1; i < list.size(); i++) {
				list.get(i).setNum(i+1);
			}
		}
		
		refreshBoard();
		
		return ret;
	}
	
}