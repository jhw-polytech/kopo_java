package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 1. 영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오
 * -----------------------------------
 * 영문자 모음의 아스키 코드 값
 * -----------------------------------
 * A = 65
 * E = 69
 * I = 73
 * O = 79
 * U = 85
 * 
 */
public class homework1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = "AEIOU";
		
		for(int i=0;i<str.length();i++) {

			System.out.println(str.charAt(i) +" = "+ (int)str.charAt(i)); // 문자열에서 i번째 문자를 가져와 char -> int로 형변환하여 출력
			
		}
	}

}
