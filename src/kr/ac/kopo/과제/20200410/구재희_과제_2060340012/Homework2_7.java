package jaeheehomework;

public class Homework2_7 {
	
	public static void main(String[] args) {
		
		//7. 구구단을 출력하세요.
				System.out.println("7번\n");
				
				for(int i = 2; i <= 9; i++) {
					for(int k = 1; k <= 9; k++) {
						System.out.printf("\n***%d단***\n", i);
						
						System.out.printf("%d * %d = %d", i, k, i*k);
					}
				}
	}

}
