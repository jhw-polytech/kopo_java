package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
6. 알파벳이 모두 몇 자 인지 화면에 출력하시오
개수 ? 52
*/


public class Exam06 {

	
	public static void main(String[] args) {
		

		
		//인덱스 선언
		int index = 0;
		
		//문자열 받아오기
		Scanner sc = new Scanner(System.in);		
		
		
		System.out.println("영어로 된 문자열을 입력해주세요");
		String inputStr = sc.nextLine( );
		char c = inputStr.charAt(index);
		
		//문자열의 문자 길이
		int lth = inputStr.length();

		while(true) {
			
			if(('A' <= c || c <='Z') && ('a' <= c || c <= 'z')) {
				
				//아스키 문자로 공백이 포함되어 있을 시 길이 차감
				while(index != lth) {

					if ((int)c == 32) {
						lth--;
					}
					index++;
				}
				
			} else {
				System.out.println("영어가 아닌 문자가 섞여 있습니다.");
			}
		
			break;
			
		}
	
		//공백만큼의 수가 차감되지 않고 결과가 나옴
		System.out.printf("입력한 문자열의 알파벳 수는 총  %d개입니다", lth);
		
	}
	
}
