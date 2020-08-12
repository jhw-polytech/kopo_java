package kr.ac.kopo.day15.note;

/*
 파일의 복사본을 만드는 클래스 
 
 iotest/FileIOMain03.java --> iotest/FileIOMain03.java.txt 복사
*/
import java.io.FileReader;
import java.io.FileWriter;
import kr.ac.kopo.util.FileClose;

public class FileIOMain05MoreExplain {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			
			// 실제 프로그램에서는, 어떤 파일 이름이 오든 사용할 수 있게 해야 한다.
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = fr.read();
				if(c == -1) break;
				fw.write(c);
			}
			fw.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("복사가 완료되었습니다");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fr);
			FileClose.close(fw);
			
			/*
			if(fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			*/
		}
		
	}
}






