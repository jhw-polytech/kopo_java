package kr.ac.kopo.assignment.day06;

import java.util.Scanner;

public class StringUtilMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringUtil strU = new StringUtil();
		
		
		//1번, 2번	isUpperChar, isLowerChar 메소드 		
		System.out.print("문자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		sc.nextLine();
		boolean b = strU.isUpperChar(c);
		boolean b2 = strU.isLowerChar(c); //실행하기 위해서 메소드에 static을 붙여야 함!
		System.out.println("대문자인가? " + b);
		System.out.println("소문자인가? " + b2);
		
		
		//3번, 4번	max, min 메소드
		System.out.print("두개의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.nextLine();
		int maxNum = strU.max(i, j);
		int minNum = strU.min(i, j);
		System.out.println("두 숫자 중 큰 수는 : " + maxNum);
		System.out.println("두 숫자 중 작은 수는 : " + minNum);
		
		
		//5번, 6번, 7번	reverseString, toUpperString, toLowerString 메소드 
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		String reverse = strU.reverseString(str);
		String upper = strU.toUpperString(str);
		String lower = strU.toLowerString(str);
		System.out.println("문자열을 거꾸로 하면 : " + reverse);
		System.out.println("문자열을 대문자로 변경 : " + upper);
		System.out.println("문자열을 소문자로 변경 : " + lower);

	}

}
