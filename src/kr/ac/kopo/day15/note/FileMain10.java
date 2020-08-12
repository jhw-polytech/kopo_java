package kr.ac.kopo.day15.note;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FileMain10 {

	
	public static void write() {
		// userVO 형태로 파일들이 저장되어 있는데, 이것을 불러오기 하는 것
		
		List<UserVO> list = new ArrayList<>();
		
		list.add(new UserVO("홍길동", 25, "010-1111-1889", "서울시 서초구"));
		list.add(new UserVO("홍길동", 30, "010-2222-1889", "서울시 동작구"));
		list.add(new UserVO("홍길동", 29, "010-3333-1889", "경기도 광명시"));
		list.add(new UserVO("홍길동", 41, "010-4444-1889", "경기도 성남시 분당구"));
		                                                 
	}
	
	
	
	public static void read()  {
		
		FileInputStream fis = null;
		ObjectInputStream oop = null;

		try {
			fis = new FileInputStream("iotest/object_user.txt");
			oos = new ObjectInputStream(in);
		} catch (Exception e) {
			// TODO: handle exception
		}
				
	}
	
	
	
	public static void main(String[] args) {
		write();
		read();
	}
	
}
