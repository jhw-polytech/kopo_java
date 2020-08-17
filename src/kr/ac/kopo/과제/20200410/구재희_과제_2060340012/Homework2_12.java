package jaeheehomework;

public class Homework2_12 {
	public static void main(String[] args) {
		System.out.println("12번\n");
		
		/* 출력
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
		
		// 행의 인덱스를 a, 열의 인덱스를 b라 하면,
		// 5행 까지는, a >= b, a+b >= 10 인 경우에 *를 출력
		// 이후에는, a > b 이고 a+b >= 11 인 경우에 -를 출력 
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				
				if(i <= 5) {
				
					if(i >= j || i + j >= 10) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}
				} else {
					if(i > j && i + j >= 11) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
		}
		
	}
}
