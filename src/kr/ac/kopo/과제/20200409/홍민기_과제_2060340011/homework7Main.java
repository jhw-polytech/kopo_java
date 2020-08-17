package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 7. 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오
 * 입력(알파벳) : a
 * 변경된 값 : A
 * 참고> 화면에서 받은 문자열에서 한 문자 가져오기
 * Scanner sc = new Scanner(System.in);
 * String inputStr = sc.nextLine( );
 * char c = inputStr.charAt(0);
 * 
 */
public class homework7Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("입력(알파벳) : ");
		String str = sc.nextLine();

		System.out.print("변경된 값 : ");

		if(Character.isLowerCase(str.charAt(0))){ // 문자가 소문자일 경우
			System.out.print((char)(str.charAt(0)-32)); // 아스키 코드에서 대문자와 소문자의 차이는 32
		}
		else { // 문자가 대문자일 경우
			System.out.print((char)(str.charAt(0)+32));
		}

	}

}
