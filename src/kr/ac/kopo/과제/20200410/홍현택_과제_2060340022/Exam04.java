package kr.co.hana.homework02;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1-100 사이의 정수를 입력 : ");
		int 정수1 = sc.nextInt();
		System.out.println("2-10 사이의 정수를 입력 : ");
		int 정수2 = sc.nextInt();

		System.out.printf("<1 ~ %d사이의 %d의 배수를 제외한 정수 출력>\n", 정수1, 정수2);

		for (int i = 1; i <= 정수1; i++) {
			if (i % 정수2 != 0) {
				System.out.printf("%d%s", i, " ");
			} else {
				System.out.printf("%s", "");

			}
		}

		System.out.printf("\n<1 ~ %d사이의 %d의 배수를 제외한 정수 5개씩 출력>\n", 정수1, 정수2);

		int count = 1;
		for (int i = 1; i <= 정수1; i++) {
			if (i % 정수2 != 0) {
				if (count % 5 != 0) {
					System.out.printf("%d%s", i, " ");
					count++;
				} else {
					System.out.printf("%d\n", i);
					count++;
				}
			}
			sc.close();
		}

	}
}
