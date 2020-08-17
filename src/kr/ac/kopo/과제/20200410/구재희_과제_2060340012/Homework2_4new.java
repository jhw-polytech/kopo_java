package jaeheehomework;

import java.util.Scanner;

public class Homework2_4 {
	public static void main(String[] args) {
		/*
		 * 4. 1-100 사이의 정수를 입력 : 40 2-10 사이의 정수를 입력 : 5 <1 ~ 40사이의 5의 배수를 제외한 정수 출력> <1
		 * ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
		 */
		System.out.println("4번\n");

		System.out.println("1 - 100 사이의 정수를 입력 : ");

		Scanner sc = new Scanner(System.in);
		int num9 = Integer.parseInt(sc.nextLine());
		System.out.println("2 - 10 사이의 정수를 입력 : ");
		int num10 = Integer.parseInt(sc.nextLine());
		sc.close();

		// 5의 배수 제외하고 출력
		System.out.printf("<1 ~ %d사이의 %d의 배수를 제외한 정수 출력>\n", num9, num10);
		for (int i = 1; i <= num9; i++) {
			if (i % num10 != 0) {
				System.out.print(i + " ");
			}
		}

		// 5열로 출력 -> 5의 배수일때 "\n"
		System.out.printf("\n<1 ~ %d사이의 %d의 배수를 제외한 정수 %d개씩 출력>\n", num9, num10, num10);

		int cnt = 0;
		for (int i = 1; i <= num9; i++) {
			if (i % num10 != 0) {
				System.out.printf("%5d", i);
				// 출력이 될때마다, 출력되는 개수를 세는 cnt변수 만듦
				cnt++;
				if (cnt % 5 == 0) {
					System.out.println();
				}
			}
		}

	}
}

