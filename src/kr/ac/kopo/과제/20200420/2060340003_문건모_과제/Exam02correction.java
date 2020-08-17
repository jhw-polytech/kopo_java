package test0421;

import java.util.Scanner;

/*
 * 문자열 (oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다
 * 삭제된 내용으로 문자열의 내용을 변경한다
 */

public class Exam02correction {
	
	String ortStr;
	char delChar;
	
	public static String removeChar(String oriStr, char delChar) {
		
		String str = oriStr;
		char[] chArr = new char[str.length()];
		
		int loc = 0;
		
		for(int i = 0;i<str.length();i++) {
		if(str.charAt(i) != delChar) {
			chArr[loc++] = str.charAt(i);
		 }
		}
		
		String str2 = String.copyValueOf(chArr);
		
		return str2;
	}
	
   public static void print(char delChar, String str2) {
		
		System.out.println("delChar = " + delChar + " 인 경우");
		System.out.println(str2 + " 리턴");
	}

}
