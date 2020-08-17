package kr.ac.kopo.day2.assignment;

import java.util.Scanner;

public class Exam07 {
	
	public static void main(String[] args) {
		// 7. 화면에서 알파벳을 입력받아 대문자는 소문자로, 소문자는 대문자로 출력
		
		//알파벳 입력 받기
		System.out.println("알파벳을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		//입력받은 문자열에서 첫번째 문자 가져오기
		char c = inputStr.charAt(0);
		
		//출력		
		//알파벳을 아스키코드로 변환했을 때 같은 문자의 대/소문자의 차이는 32만큼 난다
		//첫번째 문자가 대문자이면, 소문자로 바꾸기
		if (((int)c <= 65) && ((int)c <= 90)) {  
			System.out.println("변경된 값 : " + (char)((int)c+32) + inputStr.substring(1));
		//첫번째 문자가 소문자라면, 대문자로 바꾸기
		}else {
			System.out.println("변경된 값 : " + (char)((int)c-32) + inputStr.substring(1));
		}
		
		
		//배열과 toUpperCase(), toLowerCase()사용해도 가능
	
	}

}
