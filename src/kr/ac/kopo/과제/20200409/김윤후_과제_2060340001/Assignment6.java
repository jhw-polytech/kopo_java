package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
	
		/*
			윤후씨~~ 6번 과제는 소문자, 대문자 통합 알파벳의 개수를 구하는 문제였습니다
			다시한번 해주십시요 
			수고하셨습니다
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오");
		String inputStr = sc.nextLine( );
		int length = inputStr.length();
		System.out.println("문자: "+inputStr);
		System.out.println("문자의 길이 : "+ length);
		
	}
	
}
//Length함수를 사용하여 입력받은 문자의 개수를 파악함.