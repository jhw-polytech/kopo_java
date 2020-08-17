package Homework_0413;

import java.util.Scanner;

// 2) 5개의 짝수를 입력받아 출력하는 코드를 작성
// 교수님 이렇게 코드를 짜면 처음에 홀수을 입력하면 오류가 발생합니다. 어떻게 해야 오류가 발생하지 않을까요? ㅠㅠ

public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] evenNum = new int[5]; // 짝수를 저장할 배열 선언

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "'s 정수 : ");
			evenNum[i] = sc.nextInt();
			if (evenNum[i] % 2 == 0) { // 짝수일경우
				continue; // 배열에 저장 및 계속 진행
			} else { // 홀수일경우

				/*
					--i때문이에요. i가 -1로 바뀌어서 evenNum[-1] = evenNum[0] 으로 인식하니깐요
					굳이 대입을 할필요 없이 그냥 
					evenNum[--i] = evenNum[i]; 코드를
					--i;
					작성하시면 문제없습니다
				*/

				evenNum[--i] = evenNum[i]; // 전 index에 값을 다시 입력하게 함
			}
		}

		System.out.println();
		System.out.println("< 5개의 정수 출력 >");
		for (int i = 0; i < 5; i++) {
			if (evenNum[i] % 2 == 0) {
				System.out.print(evenNum[i] + " ");
			}
		}
	}
}