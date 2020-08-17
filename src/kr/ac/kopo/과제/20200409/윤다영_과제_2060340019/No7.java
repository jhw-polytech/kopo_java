package kr.ac.kopo.assignment.first;

import java.util.Scanner;

public class No7 {
	/*
	 화면에서 알파벳을 입력 받아 대문자는 소문자로, 소문자는 대문자로 출력하는 프로그램 작성
	 */
	
	public static void main(String args[]) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(알파벳) : ");
		String inputStr = sc.nextLine();
		char a = inputStr.charAt(0);
							
		// A = 65 a = 97 Z = 90 z = 122 -> 두 숫자 차이 : 32
				
		if(65 <= a && a <= 97) {
			char lower = (char)(a + 32);
			System.out.println("변경된 값 : " + lower);
		}
		else if(90 <= a && a <= 122) {
			char upper = (char)(a - 32);
			System.out.println("변경된 값 : " + upper);
		}
		else {
			System.out.println("알파벳을 입력하세요.");
		}
		
		
	}

}
