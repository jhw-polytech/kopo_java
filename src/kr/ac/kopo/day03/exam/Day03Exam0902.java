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

public class Day03Exam0902 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

		}

		// 각 단(2~8)
		for (int j = 2; j <= 8; j++) {

			System.out.println();

			// 각 단에 곱해질 수와 수식(1~9)
			for (int k = 1; k < 9; k++) {
				System.out.printf("%d * %d = %d %c", j, k, j * k, (k % 3 != 1) ? '\t' : '\n');

			}

//			for문으로 3개 단씩 출력할 수 있는 방법이 있을까?
//				for(int k = 0; k<3; k++) {
//				System.out.println("");
//				}

		}

	}

}
