package jaeheehomework;

import java.util.Scanner;

public class Remove {

	//멤버 변수
	private static String oriStr;
	private static char delChar;
	Scanner sc;
	
	
	// 생성자
	// 입력 메소드를 부를때마다 스캐너의 인스턴스 객체를 만듭니다
	public Remove() {
		
		sc = new Scanner(System.in);
	}
	
	
	// removeChar(String oriStr, char delChar) 메소드를 초기화 할때 사용할 생성자입니다
	public Remove(String strData, char ch) {
		Remove.oriStr = strData;
		Remove.delChar = ch;
	}

	
	// 문자를 제거하는 메소드입니다
	public static String removeChar(String oriStr, char delChar) {
		
		String changeStr = Remove.oriStr.replaceAll(String.valueOf(Remove.delChar), "");  //지우고 싶은 문자를 공백으로 바꿉니다
	
		return changeStr;
	}
	
	
	// Main에서 간편하게 출력하기 위한 메소드
	public void remove() {
		oriStr = this.getStr("입력 스트링 : strData = ");
		delChar = this.getChar("ch = ");
		
		System.out.println("=> " + Remove.removeChar(oriStr, delChar));
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
