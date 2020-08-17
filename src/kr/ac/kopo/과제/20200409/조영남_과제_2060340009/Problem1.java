package kr.ac.yeongnam.day02.homework;

/*
1. 영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오.     
-----------------------------------     
영문자 모음의 아스키 코드 값     
-----------------------------------     
A = 65     
E = 69     
I = 73     
O = 79     
U = 85 
 */

public class Problem1 {

	public static void main(String[] args) {
		
		// char 타입을 int 타입으로 변환해서 아스키 코드 값을 알아낸다.
		int asciiA = 'A';
		int asciiE = 'E';
		int asciiI = 'I';
		int asciiO = 'O';
		int asciiU = 'U';
		
		// 영문자 모음과 해당하는 아스키 코드 값을 보여준다.
		System.out.println("-----------------------------------");
		System.out.println("영문자 모음의 아스키 코드 값");
		System.out.println("-----------------------------------");
		System.out.println("A = " + asciiA);
		System.out.println("E = " + asciiE);
		System.out.println("I = " + asciiI);
		System.out.println("O = " + asciiO);
		System.out.println("U = " + asciiU);		
	}	
}
