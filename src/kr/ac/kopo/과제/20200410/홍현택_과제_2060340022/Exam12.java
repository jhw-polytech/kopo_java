package kr.co.hana.homework02;

public class Exam12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {

			/*
			 * 1. 좌우 대칭인 형태, 반복문으로 *-------* 형태로 찍기는 어려우니 반대로 '-'을 기준으로 생각 2. i <= 5 면 '-'가
			 * 줄어드는 for문 3. i > 5 면 '-'가 증가하는 for문
			 */

			if (i <= 5) {
				for (int j = 1; j < 10; j++) {
					if (j > i && j < 10 - i) {
						System.out.print("-");
					}

					else {
						System.out.print("*");
					}
				}

			}

			else {
				for (int k = 1; k < 10; k++) {
					if (k > 10 - i && k < i) {

						System.out.print("-");
					}

					else {
						System.out.print("*");
					}
				}
			}

			System.out.println("");
		}

	}
}
