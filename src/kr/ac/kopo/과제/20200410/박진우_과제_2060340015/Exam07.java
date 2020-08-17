package kr.ac.jinwoo.day03.homework;

/*
 * 구구단을 전부 출력하는 코드를 작성하시오.
 * 
 */

public class Exam07 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
	}
}
