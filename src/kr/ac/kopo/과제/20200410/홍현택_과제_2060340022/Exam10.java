package kr.co.hana.homework02;

public class Exam10 {
	public static void main(String[] args) {

		// 반복문 5개 사용

		for (int i = 1; i < 10; i++) {
			if (i >= 5) {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print("-");
				}
				for (int j = 1; j < i - 3; j++) {
					System.out.print("*");
				}
				System.out.println("");

			}

			else {
				for (int j = 1; j <= i - 1; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
