package kr.ac.yeongnam.day03.homework;

/*
 	7. 구구단을 출력하세요      
 	*** 2단 ***      
 	*2 * 1 = 2      
 	...      
 	2 * 9 = 18          
 	
 	*** 3단 ***      
 	...      
 	9 * 9 = 81  
 */

public class Problem07 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) { // 단 정보를 담고있는 i 변수
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <= 9; j++) { // 1 ~ 9 까지 반복하기 위한 j 변수
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println("");
		}		
	}
}
