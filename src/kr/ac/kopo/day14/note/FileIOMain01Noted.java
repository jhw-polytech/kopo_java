package kr.ac.kopo.day14.note;

import java.io.InputStream;

/*
	키보드로 한 줄을 입력받아 출력하는 클래스
	- 1 byte 단위로 출력
*/
public class FileIOMain01Noted {

	public static void main(String[] args) {
		System.out.println("입력하세요. 종료는 ctrl + z입니다."); // 일반적으로 ctrl + z는 interrupt라는 뜻이다.(모든 컴퓨터 프로그램상 암묵적 합의임)

		InputStream is = System.in;
		// System.in 이란? ---> 키보드 입력장치
		// in --> InputStream 타입의 변수이다. public static 임.

		
		
		try {
			while (true) {
				int c = is.read(); // ascii로 1byte씩 가져올것임
				
				/*
				 오류가 뜨는 이유? 외부장치에서 받아오는거라서, 문제 생기면 어떡할거야! 문제생길 요소가 너무 많음
				 그래서 read()는 무조건 예외처리를 해줘야 하는데(checked Exception), 무조건 IOException에 대해서 ---> ?				
				 그리고 read()는 반환형이 int여서 원래 문자도 ascii로 전달하는데, ascii는 0보다 큰 정수임. 그래서 -1은 정상값이 아니라 오류로 인식 가능
				*/
				
				if( c == -1) break; // -1의 의미는, read()는 end of Stream에 도달했을 때 -1 반환
				//  참고* If no byte is available because the end of the stream has been reached, the value -1 is returned.
				
				System.out.print((char)c);
				
				
				//System.out.print(c); 라고 실행하면 12345 입력하고 엔터 > 49505152531310 이런식으로 한꺼번에 우르르 나온다. buffer로 받아주었기 때문.
				// 윈도우에서는 엔터가 \r\n임 -> 1310으로 나옴
				
				// 1byte씩 잘라서 가져오기 때문에, 한글을 입력하게 되면 요상한 게 나온다. (ex. 안녕하세요 -> ìëíì¸ì )
				// inputStreamReader byte로 들어온 데이터를 문자 형태로 넘겨주는 것. 들어온 데이터를 1+1 byte로 묶어서 내보내는 원리.
				// inputStreamReader(InputStream in)	생성자가 기본생성자는 존재하지 않음.
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
