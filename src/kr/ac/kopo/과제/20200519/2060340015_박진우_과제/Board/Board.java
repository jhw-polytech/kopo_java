package kr.ac.kopo.day14.homework2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Board {

//	private Data[] dataArr = new Data[100];
	private List<Data> list = new ArrayList<>();
//	private int boardCnt = 0;
	
	// 날짜 생성 메소드
	public String makeDate() {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		
		return date;
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
		
		return ret;
	}
	
	// 게시물 삭제 메소드. 입력받은 번호의 게시물을 입력받은 Data로 수정
	public boolean delete(int num) {
			
		boolean ret = true;
		
		if(num > list.size())
			ret = false;
			
		if(ret) {
			
			list.remove(num-1);
		}
			
		return ret;
	}
	
}