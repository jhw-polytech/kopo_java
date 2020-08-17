package kr.ac.kopo.assignment.day07;

import java.util.Scanner;

public class StringUtil {
	
	//교수님! :) sc가 Scanner 클래스의 객체인데, 여기에다가 static을 붙여도 되는지 잘 모르겠습니다!
	//static을 안 붙이면 아래 inputStr와 inputChar 메소드에서 
	//Unresolved compilation problem : cannot make a static reference to the non-static field sc라고 exception이 나서 일단..붙여놨습니다

	/*
		StringUtil클래에 inputStr()를 넣는것이 올바른건지 생각을 해보면 되지요~~ ^^
	*/
	static Scanner sc = new Scanner(System.in);	

	//문자열 입력 받는 메소드
	public static String inputStr() {		
		
		System.out.print("입력 스트링 : ");
		String str = sc.nextLine();	
		
		return str;
	}
	
	
	//char 입력 받는 메소드 
	public static char inputChar() {
		
		System.out.print("char : ");
		char c = sc.nextLine().charAt(0);
		
		return c;
	}
	
	
	
	// 문자열의 각 내용들을 비교하여 입력받는 char c의 값과 동일한 char의 개수를 리턴하는 메소드.( 대소문자 구별하여 비교한다.)
	public static int checkChar(String strData, char c) {
		
		int cnt = 0;
		
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == c) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
	//문자열의 내용 중 주어진 문자를 삭제하는 메소드. (삭제된 내용으로 문자열 변경)
	public static String removeChar(String oriStr, char delChar) {
		
		String strNew = "";
		for(int i = 0; i < oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				strNew += oriStr.charAt(i);
			}
		}
		
		return strNew;
		
	}

}
