package test0410;

/*
 영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오.
 */

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		
		System.out.println("영문자 모음을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		char 모음 = sc.nextLine().charAt(0);
		int 아스키코드 = (int)모음;
		
		System.out.println(아스키코드);
		
	}
}
