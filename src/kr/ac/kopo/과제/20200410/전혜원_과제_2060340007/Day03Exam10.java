package kr.ac.kopo.day03.exam;

/*
10. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
반복문 5개, 조건문 1개 이용가능
반복문 3개, 조건문 3개
반복문 3개, 조건문 1개
반복문 2개, 조건문 2개
	*****
	-****
	--***
	---**
	----*
	---**
	--***
	-****
	*****
*/

public class Day03Exam10 {

	public static void main(String[] args) {

		// 9행 출력
		for (int i = 0; i < 9; i++) {

			//1~5줄 - 증가, * 감소
			if (i < 5) {

				// 한 개씩 증가하는 - 문자
				for (int k = 0; k < i; k++) {
					System.out.print("-");
				}

				// 한 개씩 감소하는 * 문자
				for (int l = 0; l < 5-i; l++) {
					System.out.print("*");
				}

			//6~9줄 - 감소, * 증가
			} else {
				
				// 한 개씩 감소하는 - 문자
				for (int k = 0; k < 8-i; k++) {
					System.out.print("-");
				}			


				// 한 개씩 증가하는 * 문자
				for (int l = 0; l < i-3; l++) {
					System.out.print("*");
				}

			}

			// 줄바꿈
			System.out.println();

		}

	}
}