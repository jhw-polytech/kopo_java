package kr.ac.kopo.day14.note;

import java.io.InputStreamReader;

/*
	키보드로 데이터를 입력받아 출력하는 클래스
	- 문자 단위로 출력하게 하여 한글도 사용할 수 있도록 함
*/
public class FileMain011 {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(is);
		
		
		 try {
			 while(true) 	{
				 int c = isr.read();
				 if( c == -1) break;
				 System.out.println((char)c);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
