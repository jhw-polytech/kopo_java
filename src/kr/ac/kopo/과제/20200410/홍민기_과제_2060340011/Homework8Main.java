package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 8. 시작단과 종료단을 입력받아 구구단을 출력하시오.
 * 시작단을 입력 : 5
 * 종료단을 입력 : 8
 *
 * *** 5단 ***
 * 5 * 1 = 5
 * ...
 * 8 * 9 = 72
 *
 * 이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다
 * 
 */
public class Homework8Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작단을 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("종료단을 입력 : ");
		int num2 = sc.nextInt();

		if(num1>num2) { // 문제1번과 같이 num1 < num2로 만들어 num1이 시작단, num2가 종료단이 되게한다. 
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.println();
		
		for(int i=num1;i<=num2;i++) {
			System.out.println("*** "+i+"단 ***");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
