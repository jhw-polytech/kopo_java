package kr.ac.kopo.day14.note;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// byteStream이 있으면 한글이 있을 때 문제가 생길것임
// 그래서 자바로 구성된 문서파일들은 대부분 문자 Stream을 씀
// 그러나 이종간에 주고받을 때는 inputStream에 필터클래스를 장착하는 게 일반적

/*
	File 

*/
public class FileIOMain05Noted {

	// iotest/FileIOMain03.java --> iotest/FileIOMain03.java.txt 복사
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("iotest/FileIOMain03Noted.java"); // 여기서 읽어서
			fw = new FileWriter("iotest/FileIOMain03.javaNoted.txt"); // 여기에 저장한다
			
			while(true) {
				// 아래 세 코드가 컴퓨터 내에서 항상 순서가 일정하게 진행된다는 보정이 없다.(딜레이가능)
				int c = fr.read(); // 문자 단위의 2byte씩 읽어옴
				if( c == -1) break;
//				System.out.print((char)c);  // 테스트 주석처리
				fw.write(c);
			}
			
			//write() 해줬으면 마지막에 flush()로 한 번 버퍼를 비워주는 게 국룰!
			fw.flush();
			
			System.out.println("복사가 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			FileClose.close(fr);
			
			
			
/*			
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
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
