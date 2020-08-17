package kr.co.hana.homework05;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator Cal = new Calculator();

		System.out.println("사칙연산을 수행할 정수 2개 입력하세요. :");
		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		Cal.fourcal(num01, num02);

		boolean result01 = Cal.isPrime(num01);
		boolean result02 = Cal.isPrime(num02);
		System.out.printf("\n%d 소수체크 : %b", num01, result01);
		System.out.printf("\n%d 소수체크 : %b", num02, result02);
		sc.close();

	}
}
