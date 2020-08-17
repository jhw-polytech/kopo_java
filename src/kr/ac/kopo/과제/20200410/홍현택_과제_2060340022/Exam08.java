package kr.co.hana.homework02;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("시작단을 입력 : ");
		int start = sc.nextInt();

		System.out.println("종료단을 입력 : ");
		int end = sc.nextInt();

		if (start < end) {
			for (int i = start; i <= end; i++) { // i 변수말고 start 바로 사용은 못하는지 찾아보기
				System.out.printf("\n*** %d단 ***\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		} else {
			for (int i = end; i <= start; i++) {
				System.out.printf("\n*** %d단 ***\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		}

		sc.close();
	}

}
