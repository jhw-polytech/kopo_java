package test0410;

/*
 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는
 프로그램을 작성하시오
 
 입력(알파벳) : a
 변경된 값 : A
 참고 > 화면에서 받은 문자열에서 한 문자 가져오기
 Scanner sc = new Scanner(System.in);
 String inputStr = sc.nextLine();
 char c= inputStr.charAt(0);
 
 아스키코드에서 A=65, a=97
 */

import java.util.Scanner;

public class exam07 {
	
	public static void main(String[] args) {
		
		System.out.println("영어를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		char c = inputStr.charAt(0);
		
		int num = (int)c;
		
		if(65<=num && num<=90) {
			
			int num1 = num + 32;
			char c1 = (char)num1;
			System.out.println(c1);
		}else {
			
			int num2 = num - 32;
			char c2 = (char)num2;
			System.out.println(c2);
			
		}
			
	}

}
