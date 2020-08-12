package kr.ac.kopo.day14.note;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.imageio.IIOException;

// iotest/Koala.jpg (input) --> iotest/Koala2.jpg 복사 (output)

/*
	< 작업순서 >
	1. Stream open (Ram하고 File 간에 통로를 만드는 것)
	2. 작업 수행(read, write)
	3. Stream close
*/

public class FileIOMain02Noted {

	public static void main(String[] args) {

		
		// 생명주기 때문에 변수선언은 try문 밖에서 해줘야 한다.
		FileInputStream fis = null; // null로 초기화해주는 게 안전하다.
		FileOutputStream fos = null; // 이렇게 해두면 fis, fos를 찍으면 null이 반환되지만, 초기화가 안된 상태면 에러남
		
		
		try {
			// 1단계 : stream open
				fis = new FileInputStream("iotest/시바견/shiba1.jpg"); // 반드시 try~catch문으로 묶어줘야 함
				fos = new FileOutputStream("iotest/시바견/shiba2.jpg"); // -> 왜 복사해도 용량이 0kb가 되는겨?

			// 2단계 : 작업수행(Read, Write)
			while (true) {
				int c = fis.read();
				if (c == -1) break;
				fos.write(c);
			}
			System.out.println("파일 복사가 완료되었습니다.");
			System.out.println("소요시간: "+ (end - start) / 1000. + "초");
			
			
		} catch (Exception e) { // 그냥 Exception e로 받아도 됨.
//		} catch (FileNotFoundException | IIOException e) {  그냥 Exception e로 받아도 됨.
			e.printStackTrace();
		
		} final { // 문제가 있던 없던 끊어줄 수 있기 위해
			//3단계 : stream close
			
//			fis.close(); ---> 에러나는 이유: try문에서 만든 변수의 생명주기가 끝나서 final에서 이용할 수 없기 때문에
			// checked exception인데, 하나씩 각자 예외처리 해줘야 함
			
			try {
				
				// close는 현재 fis를 가리키는 객체가 있을 때만 해야지
				if(fis != null ) {
					fis.close();					
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(fos != null) {
					fos.close(); 					
				}						
				
			} catch (Exception e) {
				e.printStackTrace();
			}		
			
			
		}
		
		
	}

}
