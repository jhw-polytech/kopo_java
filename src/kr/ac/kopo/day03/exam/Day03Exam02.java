package kr.ac.kopo.day03.exam;

import java.util.Scanner;

/*
 2. 4개의 정수를 입력받아 가장 큰수를 구하는 코드를 작성하시오.
	정수는 각각 입력받아도 상관없습니다.
	정수 4개를 입력하세요 : 89 4 222 6
	89, 4, 222, 6 중 가장 큰수 : 222
*/

public class Day03Exam02 {

	
	public static void main(String[] args) {
		
		int big1;
		int big2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요: ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("세 번째 정수를 입력하세요: ");
		int num3 = sc.nextInt();
		
		System.out.println("네 번째 정수를 입력하세요: ");
		int num4 = sc.nextInt();
		
		
		//num1과 num2를 비교
		if (num1>num2) {
			big1 = num1;
		} else {
			big1 = num2;
		}
		
		
		if (num3>num4) {
			big2 = num3;
		} else {
			big2 = num4;
		}
		
		
		if (big1>big2) {
			System.out.println(big1);
		} else {
			System.out.println(big2);
		}
		
		
		sc.close();		
		
		
	}
	
	
}
