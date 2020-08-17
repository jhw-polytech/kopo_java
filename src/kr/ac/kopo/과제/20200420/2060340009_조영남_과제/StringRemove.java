package kr.ac.yeongnam.day07.homework;

import java.util.Scanner;

public class StringRemove {
	
	/**
	 * Origin 문자열을 받기 위한 메소드
	 * @return
	 */
	public String getStr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 스트링 : String oriStr = ");
		String strData = sc.nextLine();
		
		sc.close();
		
		return strData;
	}
	
	/**
	 * 해당 문자를 삭제한 문자열을 반환하는 메소드
	 * @param strData
	 * @param c
	 * @return
	 */
	public String removeChar(String strData, char c) {		
		String newStr = strData.replace(String.valueOf(c), "");
		
		print(newStr, c);
		return newStr;
	}
		
	/**
	 * 결과값을 보여주기 위한 메소드
	 * @param result
	 * @param c
	 */	
	public void print(String result, char c) {
		System.out.println("delChar = \'" + c + "\' 인 경우 => " + result + " 리턴");
		
	}

}
