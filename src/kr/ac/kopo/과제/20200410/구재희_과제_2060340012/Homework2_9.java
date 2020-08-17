package jaeheehomework;

public class Homework2_9 {
	public static void main(String[] args) {
		
		System.out.println("\n9번\n");
		
		// 행은 (2단 3단 4단) (5단 6단 7단) (8단 9단  )으로 이뤄짐
		// 행을 k = 1일때 (3*k-1 =2, 3*k = 3, 3*k+1 = 4)로 구성
		for(int k = 1; 3*k -1 <= 9; k++) {
			
			// 열은 곱하기 9를 제외한 1~8로 구성  
			for(int i = 1; i <= 8; i++) {
				
				//한 행이 3*k-1, 3*k, 3*k+1 일때, 연속된 3개의 구구단이 나오도록 변수 l을 설정
				for(int l = 0; l <= 2; l++) {
					
					//열 설정에 의해, k=3 일때, 8단 9단 10단이 나오므로, if 절로 9단까지만 출력 되도록 함.
					if( (3*k -1) + l <= 9) {
						
						// 가지런히 정리하기 위해  \t%s를 추가
						System.out.printf("%d * %d = %d \t%s", (3*k-1) + l, i, ((3*k-1)+l)*i, " ");
					}
				
				}
				
				System.out.println("\n");
				 
			}
		
			System.out.println("\n");
		}
	}

}
