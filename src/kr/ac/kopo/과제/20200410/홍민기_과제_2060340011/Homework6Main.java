package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 6. 단을 입력받아 구구단을 출력하세요
 * 2 - 9 단을 입력 : 6
 * 
 * *** 6단 ***
 * 6 * 1 = 6
 * 6 * 2 = 12
 * ...
 * 6 * 9 = 54
 * 
 */
public class Homework6Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력받아 구구단을 출력하세요");
		System.out.print("2 - 9 단을 입력 : ");
		
		int num = sc.nextInt();

		System.out.println("*** "+num+"단 ***");
		for(int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
