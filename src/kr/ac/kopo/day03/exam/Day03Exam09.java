package kr.ac.kopo.day03.exam;

/*
 9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
 반복문은 최대 3개만 사용합니다.
	2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
	2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
	...
	5 * 1 = 5 6 7
	...
	8 9
	
	for(int dan = 2; dan <= 9; ) {
	}
*/

public class Day03Exam09 {

	public static void main(String[] args) {

		// 3개 단씩 끊어 출력되게 하기 위한 변수
		int cnt = 2;

		// 3개 단씩 출력되도록 하는 부분
		for (int i = 1; i <= 3; i++) {

			// 각 단에 곱해질 수와 수식(1~9)
			for (int k = 1; k < 9; k++) {

				// 각 단(2~8)
				for (int j = cnt; j <= cnt + 2; j++) {

					if (j < 9) {
						System.out.printf("%d * %d = %d \t", j, k, j * k);
					}
				}

				System.out.println();
			}

			System.out.println();
			cnt += 3;

		}

	}

}
