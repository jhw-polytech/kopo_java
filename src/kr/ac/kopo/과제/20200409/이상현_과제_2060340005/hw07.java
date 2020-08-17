package shlee1993.day02.homework;

import java.util.Scanner;

/*
7. 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램
ex)알파벳 ) : a, 변경된 값 : A
*/

//charAt(0)를 이용해 첫번째 문자를 저장하고, 영문자의 대소문자의 아스키코드 값의 차이인 +-32를 이용해 대소문자로 변환


public class hw07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		String inputStr = sc.nextLine();
		
		char c = inputStr.charAt(0);
		
		if('A' <= c && c <= 'Z') {	//대문자일 경우
			c += 32;	//대문자와 소문자의 아스키코드 값 차이 32만큼을 더해줌
			System.out.println("변경된 값 : " + c);
		}
		else if('a' <= c && c <= 'z') {	//소문자일 경우
			c -= 32;	//대문자와 소문자의 아스키코드 값 차이 32만큼을 빼줌
			System.out.println("변경된 값 : " + c);
		}
		else
			System.out.println("error!!");	//첫글자가 알파벳이 아닐경우 오류 출력		
	}
}
