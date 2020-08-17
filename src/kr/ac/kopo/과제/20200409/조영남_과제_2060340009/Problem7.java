package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/*
7. 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오.
      입력(알파벳) : a 
      변경된 값 : A 
      참고> 화면에서 받은 문자열에서 한 문자 가져오기 
   Scanner sc = new Scanner(System.in);
   String inputStr = sc.nextLine( );
   char c = inputStr.charAt(0); 
 */

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(알파벳) : ");
		String inputStr = sc.nextLine(); // 문자열을 입력받음
		
		String answer = ""; // 변환된 값을 저장하기 위한 변수
		
		
		for(int count = 0; count < inputStr.length(); count++) { // 문자열의 길이만큼 반복문을 수행
			char what = inputStr.charAt(count); // 화면에서 받은 문자열에서, 해당 위치의 한 문자를 가져오기
			boolean whether = Character.isUpperCase(what); // 해당 문자가 대문자인지 검사		
			
			if(whether) { // 해당 문자가 대문자일 경우, +32를 해서 소문자로 변환
				what = (char) (what + 32);	
				answer = answer + what; // 결과 값에 해당 문자를 합침
			} else { // 해당 문자가 소문자일 경우, -32를 해서 대문자로 변환
				what = (char) (what - 32);
				answer = answer + what; // 결과 값에 해당 문자를 합침
			}				
		}		
		System.out.println("변경된 값 : " + answer); // 최종 결과값			
	}
}
