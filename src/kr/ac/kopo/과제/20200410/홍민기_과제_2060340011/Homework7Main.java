package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 7. 구구단을 출력하세요
 * *** 2단 ***
 * 2 * 1 = 2
 * ...
 * 2 * 9 = 18
 *
 * *** 3단 ***
 * ...
 * 9 * 9 = 81
 * 
 */
public class Homework7Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 출력하세요");

		// 2중 for문을 이용하여 곱하기에서의 왼쪽인수는 i, 오른쪽 인수는 j로 지정하여 곱하기를 나타낼 수 있다.
		
		for(int i=2;i<=9;i++) {
			System.out.println("*** "+i+"단 ***");
			for(int j=1;j<=9;j++) { 
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
