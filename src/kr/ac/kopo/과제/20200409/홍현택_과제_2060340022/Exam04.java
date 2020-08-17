package kr.co.hana.homework01;

import java.util.Scanner;

public class Exam04 {
	public static void main(String [] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("나눌 수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int share = num1/num2;
		int remainder = num1%num2;
 		
		System.out.println("몫 : " + share);
		System.out.println("나머지 : " + remainder);
		
		sc.close();
		/*
		 1. scanner 정수 2개 입력
		 2. 출력 몫, 나머지 
		 */
	}
}
