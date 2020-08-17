package kr.ac.kopo.day03.exam;

/*
12. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
	 *-------*
	 **-----**
	 ***---***
	 ****-****
	 *********
	 ****-****
	 ***---***
	 **-----**
	 *-------*
*/

public class Day03Exam12 {

	public static void main(String[] args) {

		// 9행 출력
		for (int i = 0; i < 9; i++) {

			// 1~5행
			if (i < 5) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}

				for (int k = 2; k < 10-2*i; k++) {
					System.out.print("-");
				}

				for (int l = 0; l < i+1; l++) {
					System.out.print("*");
				}

			// 6~9행
			} else {

				for (int j = 0; j < 9-i; j++) {
					System.out.print("*");
				}

				for (int k = 0; k < 2*i-8; k++) {
					System.out.print("-");
				}

				for (int l = 0; l < 9-i; l++) {
					System.out.print("*");
				}

			}

			// 줄바꿈
			System.out.println();

		}

	}
}
