package test0418;

import java.util.Scanner;

public class StringUtilMain {
	
	public static void main(String[] args) {
		
		StringUtil str = new StringUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 문자를 입력해주세요");
		
		char c = sc.nextLine().charAt(0);
		str.printChar(c);
		System.out.println();
		
		System.out.println("두개의 정수를 입력해주세요");
		int i = sc.nextInt();
		sc.nextLine();
		int j = sc.nextInt();
		sc.nextLine();
		
		str.printmaxmin(i, j);
		
		System.out.println("문자열을 입력해주세요");
		String st = sc.nextLine();
		
		str.reverseString(st);
		System.out.println();
		str.toUpperString(st);
		System.out.println();
		str.toLowerString(st);
		
		
	}
	
}
		
		
		
		
		
		
		
		
