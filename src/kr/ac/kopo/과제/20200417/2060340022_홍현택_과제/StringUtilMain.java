package kr.co.hana.homework05;

import java.util.Scanner;

public class StringUtilMain {
	public static void main(String[] args) {
		StringUtil strUtil = new StringUtil();
		Scanner sc = new Scanner(System.in);

		// Exam01
		System.out.println("대문자 판별 : ");
		char ch01 = sc.next().charAt(0);
		boolean result01 = strUtil.isUpperChar(ch01);
		System.out.printf("%c는 대문자인가요? : %b\n", ch01, result01);

		// Exam02
		System.out.println("소문자 판별 : ");
		char ch02 = sc.next().charAt(0);
		boolean result02 = strUtil.isLowerChar(ch02);
		System.out.printf("%c는 소문자인가요? : %b", ch02, result02);

		// Exam03
		System.out.println("대소 비교(숫자 두개 입력) : ");
		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		int result03 = strUtil.max(num01, num02);
		System.out.println(num01 + "과 " + num02 + "중 큰 숫자는? : " + result03);

		// Exam04
		System.out.println("대소 비교(숫자 두개 입력) : ");
		int num03 = sc.nextInt();
		int num04 = sc.nextInt();
		int result04 = strUtil.min(num03, num04);
		System.out.println(num03 + "과 " + num04 + "중 작은 숫자는? : " + result04);

		// Exam05
		System.out.println("거꾸로 변경할 문자열을 입력하세요. : ");
		String str01 = sc.nextLine();
		String result05 = strUtil.reverseString(str01);
		System.out.println(result05);

		// Exam06
		System.out.println("대문자로 변경할 문자열을 입력하세요. : ");
		String str02 = sc.nextLine();
		String result06 = strUtil.toUpperString(str02);
		System.out.println(result06);

		// Exam07
		System.out.println("소문자로 변경할 문자열을 입력하세요. : ");
		String str03 = sc.nextLine();
		String result07 = strUtil.toLowerString(str03);
		System.out.println(result07);

		sc.close();
	}
}
