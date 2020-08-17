package Homework0420;

import java.util.Scanner;

 // 주어진 문자열에서 문자 개수 리턴하기

public class Test01 {
	public static int checkChar(String strData, char ch) {
		
		int cnt = 0;
		int index = -1;

		while ((index = strData.indexOf(ch, index + 1)) != -1) {
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String strData = sc.nextLine();
		
		System.out.print("검색할 문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		int cnt = checkChar(strData, ch);

		System.out.println(strData + "에 " + ch + "(이)가 " + cnt + "개 있습니다.");
	}
}
