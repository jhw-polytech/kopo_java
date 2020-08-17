package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringUtil su = new StringUtil();

		// 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar( char c ) 메소드를 작성하시오 
		System.out.print("1. 문자를 입력하세요 : ");
		char chkUpper =sc.nextLine().charAt(0);
		System.out.println(su.isUpperChar(chkUpper));

		// 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드를 작성하시오
		System.out.print("2. 문자를 입력하세요 : ");
		char chkLower =sc.nextLine().charAt(0);
		System.out.println(su.isLowerChar(chkLower));

		// 3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
		System.out.print("3. 두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num1+"과 "+num2+"중 더 큰 수는 "+su.max(num1, num2)+"입니다.");

		// 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
		System.out.print("4. 두 수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num1+"과 "+num2+"중 더 작은 수는 "+su.min(num1, num2)+"입니다.");

		// 5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
		System.out.print("5. 문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println(str+"문자열을 거꾸로 하면 "+su.reverseString(str)+"입니다.");

		// 6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
		System.out.print("6. 문자열을 입력하세요 : ");
		str = sc.nextLine();
		System.out.println(str+"를 대문자로 변경하면 "+su.toUpperString(str)+"입니다.");

		// 7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
		System.out.print("7. 문자열을 입력하세요 : ");
		str = sc.nextLine();
		System.out.println(str+"를 소문자로 변경하면 "+su.toLowerString(str)+"입니다.");
	}

}
