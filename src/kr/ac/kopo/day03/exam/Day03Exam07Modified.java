package kr.ac.kopo.day03.exam;

/*
7. 구구단을 출력하세요
	 *** 2단 ***
	 2 * 1 = 2
	 ...
	 2 * 9 = 18
	
	 *** 3단 ***
	 ...
	 9 * 9 = 81
*/

public class Day03Exam07Modified {
	
	
	public static void main(String[] args) {
		
		//단수
		for(int i=2; i<=9; i++) {
			
			System.out.printf("*** %d단 ***", i);
			System.out.println();
			
			//곱하는 수
			for(int j=1; j<=9; j++) {
				
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}
			
			System.out.println();
			
		}
		
		
	}
}
