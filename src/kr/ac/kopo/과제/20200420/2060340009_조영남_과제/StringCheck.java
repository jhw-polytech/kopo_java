package kr.ac.yeongnam.day07.homework;

import java.util.Scanner;

public class StringCheck {

	private static int checkNumCnt; // static 변수 선언
	
	/**
	 * 문자열을 입력 받는 메소드
	 * @return
	 */
	public String getStr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 스트링 : String strData = ");
		String strData = sc.nextLine();
		
		sc.close();
		
		return strData;
	}	
	
	/**
	 * 같은 문자열을 비교하기 위한 메소드
	 * @param strData
	 * @param ch
	 * @return
	 */
	public static int checkChar(String strData, char ch) {
		int searchIdx = -1;
		StringCheck.checkNumCnt = 0;
		while((searchIdx = strData.indexOf(ch, searchIdx+1)) != -1) {
			StringCheck.checkNumCnt++;
		}
		return StringCheck.checkNumCnt;		
	}
	
	/**
	 * 결과를 보여주는 메소드
	 * @param c
	 * @param checkNumCnt
	 */
	public void print(char c, int checkNumCnt) {
		System.out.println("ch = \'" + c + "\' 인 경우 => " + checkNumCnt + "리턴" );
	}	
	
}
