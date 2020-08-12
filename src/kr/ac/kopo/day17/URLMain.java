package kr.ac.kopo.day17;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		
		
		try {
//			URL urlObj = new URL("https://www.naver.com");
			URL urlObj = new URL("https://docs.oracle.com/javase/8/docs/api/");
			
			System.out.println("프로토콜 : " + urlObj.getProtocol());
			System.out.println("호스트 이름 : " + urlObj.getHost());
			System.out.println("포트 : " + urlObj.getPort()); // 포트가 지정되어 있지 않으면 -1 반환
			// 기본적으로 웹 port는 80으로 디폴트(안써도 80으로 감) but 명시해줘도 틀린 게 아님
			System.out.println("경로 : " + urlObj.getPath());
			System.out.println("쿼리 : " + urlObj.getQuery());
			
			
			System.out.println("-----------------------------------------------------");
			
			InputStream is = urlObj.openStream(); // 이 상태에서는 한글이 다 깨진다(bytestream)
			InputStreamReader isr = new InputStreamReader(is, "euc-kr");			
			// InputStreamReader를 써도 한글이 깨질 수도 있다. (UTF-8이 아닌 경우)
			// EUC-KR은 한글을 2byte로 만들어주는 형식인데, MS949 형식이다.
			// 그러나 요즘엔(URF-8) 하나의 한글을 3byte로 취하는 방식을 쓰기 때문
			// 그럴 땐 InputStreamReader isr = new InputStreamReader(is, "euc-kr"); 이렇게 글자형식을 지정해주면 된다.
			
			while(true) {
//				int c = is.read();
				int c = isr.read();
				if( c == -1) break;
				System.out.println((char)c);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}
