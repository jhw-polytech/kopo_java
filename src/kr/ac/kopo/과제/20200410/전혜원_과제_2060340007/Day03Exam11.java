package kr.ac.kopo.day03.exam;

/*
 11. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
	*********
	-*******
	--*****
	---***
	----*
*/

public class Day03Exam11 {

	public static void main(String[] args) {

		// 5행
		for (int i = 0; i < 5; i++) {

			// 9열 중 -
			for (int k = 0; k < i; k++) {	
				System.out.print("-");
			}

			// 9열 중 *
			for (int j = 0; j < 9-2*i; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}

	}

}
