package Assignment05;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		StringUtil util = new StringUtil();
//		//1번 문제: 대문자를 확인하기위한 메소드
//		System.out.println("대문자를 입력 : ");
//		char upper =util.inputChar();
//		util.isUpperChar(upper);
//		
//		//2번 문제: 소문자를 확인하기위한 메소드
//		System.out.println("소문자를 입력 : ");
//		char lower =util.inputChar();
//		util.isLowerChar(lower);
		
//		//3번 문제:두개의 숫자 중 큰수 반환 메소드
//		System.out.println("숫자 2개 입력(큰 값)");
//		util.max();
//		System.out.println();
//		
//		//4번 문제
//		System.out.println("숫자 2개 입력(작은 값)");
//		util.min();
//		System.out.println();
		
		//5번 문제 
//		System.out.println("문자열 입력하시오(Reverse)");
//		String str=sc.nextLine();
//		util.reverseString(str);
		
		//6번 문제
		System.out.println("문자열을 입력하시오:");
		String str1=sc.nextLine();
		util.toUpperString(str1);
		
		//7번 문제
		System.out.println("문자열을 입력하시오:");
		String str2=sc.nextLine();
		util.toLowerString(str2);
	}
}
