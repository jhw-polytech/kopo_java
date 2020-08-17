package Homework_0413;

import java.util.Scanner;

// 3) 정수를 입력받고 (전에 입력한 수보다 더 큰 수 입력받기) 출력 및 Reverse 출력

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 정수 : ");
			num[i] = sc.nextInt();

			if (i > 0) {	// 처음에 숫자를 입력할 때 오류가 발생하지 않게 하기 위함
				if (num[i - 1] > num[i]) {	// 후에 입력한 숫자가 더 작으면
					System.out.println("\t" + num[i - 1] + "보다 큰수가 와야합니다");	// 더 큰 수를 입력하라는 문구 출력
					num[--i] = num[i];
				} else {
					// else 없어도 돌아갑니다!!!!
					continue;
				}
			}
		}

		System.out.println();
		System.out.println("< PRINT >");
		for (int i = 0; i < 5; i++)
			System.out.print(num[i] + " ");	// 그대로 출력
		System.out.println();

		int[] result = new int[5];	// 역을 출력하는 결과물을 저장할 배열 생성

		for (int i = 0; i < 5; i++) {	// 역을 출력하는 알고리즘
			while (num[i] != 0) {
				result[i] = result[i] * 10 + num[i] % 10;
				num[i] /= 10;
			}
		}
		
		System.out.println();
		System.out.println("< REVERSE >");
		for (int i = 4; i >= 0; i--)	// 뒤에서부터 차례대로 출력
			System.out.print(result[i] + " ");
	}
}