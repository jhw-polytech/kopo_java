package kr.co.hana.homework06;

import java.util.Scanner;

public class checkCharMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" 문자열을 입력하세요 : ");
		String strData = sc.nextLine();

		System.out.println(" 개수를 세고 싶은 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		sc.close();
		
		int cnt = CheckChar.checkChar(strData, ch);
		CheckChar.print(ch, cnt);
	}
}
