package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
	7. 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오
	
		입력(알파벳) : a
		변경된 값 : A
		
		참고> 화면에서 받은 문자열에서 한 문자 가져오기
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine( );
		char c = inputStr.charAt(0);
*/

public class Exam07 {
	
	
	public static void main(String[] args) {
		
		
		String cvrt = null;
		
		//입력받은 문자열 중 첫번째 문자 받아오기
		Scanner sc = new Scanner(System.in);
		System.out.println("영어로만 된 문자열을 입력해주세요");
		String inputStr = sc.nextLine();

		
		//for문 안의 내용이 실행되지 않는 것 같음. 마지막 결과에 null값이 나옴		
		for(int i=0; i==inputStr.length(); i++) {
			
		//	System.out.println("aa");
			
			char ch = inputStr.charAt(i);

			/*
				 혜원씨... if 과  else if문의 조건을 잘 보세요... 논리 or이므로 둘중에 하나만 참이어도 참일거에요
				 만일 소문자 'a'를 입력했다면 어디 조건에 걸릴지 확인해보십시요
			*/
			
			if ('A' < ch || ch < 'Z') {
				ch = (char) (ch + 32);
			} else if ('a' < ch || ch < 'z' ) {
				ch = (char) (ch - 32);
			} else {
				System.out.println("영어 알파벳만 입력이 가능합니다.");
			}
			
			cvrt += ch;	
			
		}
		
		System.out.println("짜라란~ "+cvrt);
		
		
		
	}

}
