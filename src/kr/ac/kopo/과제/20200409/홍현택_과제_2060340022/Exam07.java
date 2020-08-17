package kr.co.hana.homework01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		char alpa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요! : ");
		alpa = sc.next().charAt(0);
		
		// 대문자 -> 소문자, 소문자 -> 대문자로 변환, 다른 문자 입력시 오류 메시지 출력
		if (64 < (int)alpa && (int)alpa < 91) {
			int small = (int)alpa + 32;
			System.out.println((char)small );  
		}
		if (96 < (int)alpa && (int)alpa < 113) {
		int cap = (int)alpa - 32;
			System.out.println((char)cap);
		}
		else {
			System.out.println("잘못된 문자가 입력되었습니다.");
		}
		sc.close();
	}
}
