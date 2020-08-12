


/*
필터클래스 이용해보기 >> 얘네도 다 close 시켜주는 것 잊지 말자

*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// iotest/Koala.jpg  --> iotest/Koala2.jpg 복사

/*
 	작업순서
 	1. Stream open
 	2. 작업 수행(read, write)
 	3. Stream close 
 */
public class FileIOMain03Noted {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			// 1단계 : stream open
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			
			// filterclass 장착: BufferedInputStream, BufferedOutputStream 객체 생성
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
						
			long start = System.currentTimeMillis();
			
			// 2단계 : 작업수행(Read, Write)
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("복사가 완료되었습니다");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 3단계 : stream close
			
			
			/*
				언제나! 반드시! 필터클래스 먼저 닫아주기
			*/
			
			if(bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}











