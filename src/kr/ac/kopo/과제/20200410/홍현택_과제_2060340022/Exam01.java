package kr.co.hana.homework02;

import java.util.Scanner;

/* 다른 방법 있는지 찾아보기
	scanner 한줄로 표현 가능한지
	비교 연산자도 더 줄일수 있는지
*/

public class Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("3개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// 비교 연산자

		if (num1 > num2 && num2 > num3) {
			if (num2 > num3) {
				System.out.print(num1 + " ");
				System.out.print(num2 + " ");
				System.out.print(num3);
			} else {
				System.out.print(num1 + " ");
				System.out.print(num3 + " ");
				System.out.print(num2);
			}

		}

		if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.print(num2 + " ");
				System.out.print(num1 + " ");
				System.out.print(num3);
			} else {
				System.out.print(num2 + " ");
				System.out.print(num3 + " ");
				System.out.print(num1);
			}
		}

		else {
			if (num1 > num2) {
				System.out.print(num3 + " ");
				System.out.print(num1 + " ");
				System.out.print(num2);
			} else {
				System.out.print(num3 + " ");
				System.out.print(num2 + " ");
				System.out.print(num1);
			}
		}
		sc.close();
	}
}
