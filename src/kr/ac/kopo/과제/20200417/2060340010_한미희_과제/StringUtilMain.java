package kr.ac.kopo.day6.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtilMain {

	public  static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringUtil su = new StringUtil();

		//1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar(char c) 메소드
		System.out.println("하나의 문자를 입력하세요 : ");
		char c = sc.next().charAt(0);		//자바에서는 문자열을 입력받는 메소드가 없음 
		sc.nextLine();						//=>문자열을 입력받아 첫번째 문자를 반환
		boolean result1 = su.isUpperChar(c);
		System.out.println("\"" + c + "는 대문자이다\" => " + result1);
		
		//2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드
		System.out.println("하나의 문자를 입력하세요 : ");
		char d = sc.next().charAt(0);
		sc.nextLine();
		boolean result2 = su.isLowerChar(d);
		System.out.println("\"" + d + "는 소문자이다\" => " + result2);
		
		//3. 두개의 숫자를 입력받아 큰수를 반환하는 max(int i, int j) 메소드
		System.out.println("두개의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		int result3 = su.max(num1, num2);
		System.out.println(num1 + "과 " + num2 + " 중에서 더 큰 수 : " + result3);
	
		//4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드
		System.out.println("두개의 숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		sc.nextLine();
		int result4 = su.min(num3, num4);
		System.out.println(num3 + "과 " + num4 + " 중에서 더 작은 수 : " + result4);
		
		//5. 문자열을 입력받아 거꾸로 변경하는 reverseString(String str) 메소드
		System.out.println("문자열을 입력하세요 : ");
		String str1 = sc.nextLine();
		String result5 = su.reverseString(str1);
		System.out.println(str1 + " => " + result5);
		
		//6. 문자열을 입력받아 대문자로 변경하는 toUpperString(String str) 메소드
		System.out.println("문자열을 입력하세요 : ");
		String str2 = sc.nextLine();
		String result6 = su.toUpperString(str2);
		System.out.println(str2 + " => " + result6);
		
		//7. 문자열을 입력받아 소문자로 변경하는 toLowerString(String str) 메소드
		System.out.println("문자열을 입력하세요 : ");
		String str3 = sc.nextLine();
		String result7 = su.toLowerString(str3);
		System.out.println(str3 + " => " + result7);
		
		
	}
}
