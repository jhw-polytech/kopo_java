package Homework_0413;

import java.util.Scanner;

// 1) 10개의 정수 입력받고 짝수, 짝수의 총합, 홀수, 홀수의 총합 출력하기
// 교수님 이 코드는 너무 지저분한 것 같습니다. 어떻게 하면 조건문을 줄일 수 있을까요?

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10]; // 정수를 입력 받을 배열 선언

		for (int i = 0; i < 10; i++) { // 배열 index는 0부터 시작
			System.out.print(i + 1 + "'s num : ");
			num[i] = sc.nextInt();
		}

		int evenSum = 0;	// 짝수의 총합
		int oddSum = 0;		// 홀수의 총합

		for (int i = 0; i < 10; i++) {
			if (num[i] % 2 == 0) {	// 짝수일 때
				evenSum = evenSum + num[i];	// 짝수끼리의 총합을 구한다.
			} else {	// 홀수일 때
				oddSum = oddSum + num[i]; // 홀수끼리 총합을 구한다.
			}

		}
		System.out.println();
		System.out.println("< 짝수 >");

		for (int i = 0; i < 10; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");	// 짝수 출력
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + evenSum);	// 짝수의 총합 출력

		System.out.println();
		System.out.println("< 홀수 >");

		for (int i = 0; i < 10; i++) {
			if (num[i] % 2 != 0) {
				System.out.print(num[i] + " ");	// 홀수 출력

			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + oddSum);	// 홀수의 총합 출력
	}
}