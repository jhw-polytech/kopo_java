package shlee1993.day04.homework;

import java.util.Scanner;

/*
1. 1's num : 12
2's num : 5
3's num : 8
4's num : 30
5's num : 22
6's num : 87
7's num : 9
8's num : 4
9's num : 15
10's num : 22
ex)	< 짝수 >
	12 8 30 22 4 22
	짝수의 총합 : XXX
	< 홀수 >
	5 87 9 15
	홀수의 총합 : XXX
*/

//10개의 변수를 입력받고, 2로 나누어 떨어지면 짝수, 아니면 홀수로 구분한 후 작성

public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d's num : ", i + 1);
			num[i] = sc.nextInt(); // 10개의 정수를 입력받음
		}
		sc.close();

		int sumEven = 0, sumOdd = 0; // 홀수, 짝수 합 저장 공간 0으로 초기화

		for (int i = 0; i < 10; i++) {
			if (num[i] % 2 == 0)
				sumEven += num[i]; // 짝수일때 sumEven에 더함
			else
				sumOdd += num[i]; // 나머지(홀수일때) sumOdd에 더함
		}

		System.out.println("< 짝수 >"); // 짝수 출력
		for (int i = 0; i < 10; i++)
			if (num[i] % 2 == 0)
				System.out.print(num[i] + " ");
		System.out.println("짝수의 총합  : " + sumEven);

		System.out.println("< 홀수 >"); // 홀수 출력
		for (int i = 0; i < 10; i++)
			if (num[i] % 2 != 0)
				System.out.print(num[i] + " ");
		System.out.println("홀수의 총합  : " + sumOdd);
	}

}
