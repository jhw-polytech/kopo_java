package kr.ac.kopo.day3.assignment;

public class Exam07 {

	public static void main(String[] args) {
	//구구단을 출력하기
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("*** "+i+"단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.print('\n');
			}
			System.out.print('\n');
		}
		
			
	}
}
