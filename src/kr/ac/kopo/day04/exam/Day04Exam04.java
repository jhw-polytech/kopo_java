package kr.ac.kopo.day04.exam;

import java.util.Scanner;

/*
4. 다음의 결과를 보이는 프로그램을 작성하시오.

	int[] nums = new int[30];

	1 – 100사이의 정수를 입력하시오 : 64
	< 64의 7개 약수 출력 >
	64의 약수의 개수 : 7개
	1 2 4 8 16 32 64

	1 – 100사이의 정수를 입력하시오 : 79
	79의 약수의 개수 : 2개
	< 79의 2개 약수 출력 >
	1 79
*/

public class Day04Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1 - 100 사이의 정수를 입력하시오: ");
		int inputNum = sc.nextInt();

		int[] nums = new int[30];

		int factor = 0;
		int index = 0;

		while (factor < inputNum) {

			factor++;
			if (inputNum % factor == 0) {
				nums[index] = factor;
				index++;
			}
		}

		System.out.printf("< %d의 %d개 약수 출력 > \n", inputNum, index);

		for (int i = 0; i < index; i++) {

			System.out.print(nums[i] + " ");
		}

		sc.close();
	}

}
