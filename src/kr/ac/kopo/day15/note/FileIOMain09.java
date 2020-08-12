package kr.ac.kopo.day15.note;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileIOMain09 implements Serializable { // 객체직렬화
	
	
	private				String name;
	private				int age;
	private transient 	String addr; // transient
	
	
	

	public static void write(){
		UserInfo user = new UserInfo("홍길동",25,"경기도 광명시");
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		// 원래는 바이트 단위로 저장하는데, 한 번 저장할 때 객체의 크기만큼을 파일에 저장하고 싶은 것( 4byte씩)
		
		oos.writeObject(user); // 묵시적 형변환 일어남, 
		
		try {
			fos = new FileOutputStream("iotest/object_user.txt");
			oos = new ObjectOutputStream(fos);
			//ObjectOutputStream --> 객체들을 한번에 출력하는 클래스
			// 여기 중에서 writeObject()
			

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	
	// VO를 감싸고 있는 ArrayList 또한 객체이다.
	// 객체들을 쓰는 데 필요한 ReadObject를 쓰고싶으면 Serializable을 상속받아야 하는데,
	// ArrayList는 사실 이미 Serializable을 상속받고 있다!!!
	
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fr = new FileInputStream(file);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
//		write();
		read();
	}
	
}
