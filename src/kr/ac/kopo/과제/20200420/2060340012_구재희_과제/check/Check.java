package jaeheehomework;

import java.util.Scanner;

/*
	재희씨... checkChar() 메소드가 static이자나요.... 그쵸???
	그럼 객체를 만들지 않아도 이미 생성이 되어있고 이러다 보니 
	Check클래스내에 String stData;가 무슨 의미가 있을까 생각을 해봐야할거 같아요....
*/

public class Check {

	private static String strData; // private을 통해 멤버 변수를 보호합니다.
	private static char ch; // static 선언을 통해, static메소드에서 사용 가능하도록 합니다
	private static int cnt; // 같은 캐릭터가 나올때마다 카운트 해줄 변수를 만듭니다
	Scanner sc;
	
	
	// 생성자
	// 입력 메소드를 부를때마다 인스턴스 객체를 만듭니다
	public Check() {
		
		sc = new Scanner(System.in);
	}
	
	
	// 개수를 세는 메소드를 부를때마다 각 변수를 초기화합니다
	public Check(String strData, char ch) {
		Check.strData = strData;
		Check.ch = ch;
		Check.cnt = 0;
	}

	
	// cnt 세는 메소드
	public static int checkChar(String strData, char ch) {
		
		
		for (int i = 0; i < strData.length(); i++) {
			
			// strData의 각 캐릭터 원소를 ch와 비교합니다. 비교하는 것들이 모두 캐릭터 이므로 == 을 이용했습니다
			if (Check.strData.charAt(i) == Check.ch) {
				Check.cnt++;
			}
		}
		return Check.cnt;
	}
	
	
	// Main에서 간편하게 출력하기 위한 메소드. 
	public void check() {
		strData = this.getStr("입력 스트링 : strData = ");
		ch = this.getChar("ch = ");
		
		System.out.println("=> " + Check.checkChar(strData, ch));
	}
	
	// 입력 메소드
	public String getStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	public char getChar(String msg) {
		System.out.print(msg);
		char ch = sc.next().charAt(0);
		return ch;
	}
	
}
