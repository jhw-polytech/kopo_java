package Homework0417;

import java.util.Scanner;

// StringUtil 클래스의 메인

public class StringUtilMain {

	public static void main(String[] args) {
	
		StringUtil str_util = new StringUtil();	// 객체생성
		
		Scanner sc = new Scanner(System.in);
		
		// 1번
		System.out.print("1. 문자를 입력하였을 때 대문자이면 true가 출력됩니다.\n문자를 입력하세요.");
		String str_upp = sc.nextLine();	// 입력
		char c= str_upp.charAt(0);	// 0번지에 입력된 문자가 대문자일경우 true 출력
		System.out.println(str_util.isUpperChar(c));	// 메소드에 접근
		System.out.println();

		// 2번
		System.out.print("2. 문자를 입력하였을 때 소문자이면 true가 출력됩니다.\n문자를 입력하세요.");
		String str_low = sc.nextLine();
		char c2= str_low.charAt(0);
		System.out.println(str_util.isLowerChar(c2));
		System.out.println();
		
		// 3번
		System.out.println("3. 숫자를 2개 입력하세요.");
		int i = Integer.parseInt(sc.nextLine());
		int j = Integer.parseInt(sc.nextLine());
		System.out.print("더 큰 숫자 : " +str_util.max(i, j));
		System.out.println();
		
		// 4번
		System.out.println("4. 숫자를 2개 입력하세요.");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("더 작은 숫자 : " +str_util.min(a, b));
		System.out.println();
		
		// 5번
		System.out.println("5. 거꾸로 출력할 문자열을 입력하세요.");
		System.out.println(str_util.reverseSring(sc.nextLine()));
		System.out.println();
		
		// 6번
		System.out.println("6. 대문자로 변경할 문자열을 입력하세요.");
		System.out.println(str_util.toUpperString(sc.nextLine()));
		System.out.println();
		
		// 7번
		System.out.println("7. 소문자로 변경할 문자열을 입력하세요.");
		System.out.println(str_util.toLowerString(sc.nextLine()));
	}

}
