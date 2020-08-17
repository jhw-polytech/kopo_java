package kr.ac.kopo.day3.assignment;

public class Exam10 {

	public static void main(String[] args) {
	/*반복문 5개, 조건문 1개 이용가능
	    반복문 3개, 조건문 3개
	    반복문 3개, 조건문 1개
	    반복문 2개, 조건문 2개
	*/
		
		//출력할 행(i) 개수 : 9줄
		for( int i = 1; i <= 9; i++) {
			
			//5번째 행까지 출력할 방법
			if(i <= 5) {
				//출력할 열(j) 개수 : 5개
				for( int j = 1; j <= 5; j++) {
					
					//열의 자리가 행의 자리보다 작다면, "-" 출력
					if(j < i) {
						System.out.print("-");
					//열의 자리가 행의 자리보다 크거나 같다면, "*" 출력
					}else {
						System.out.print("*");
					}
				}
				System.out.print('\n');
				
			//6번째 행부터 출력할 방법
			}else {
				for( int j = 1; j <= 5; j++) {
					
					//열의 자리가 (10-행의 자리)보다 작다면, "-" 출력
					if(j <(10-i)) {
						System.out.print("-");
					//열의 자리가 (10-행의 자리)보다 크거나 같다면, "*" 출력
					}else {
						System.out.print("*");
					}
					
				}
				System.out.print('\n');
			}
		}
		
		
	}
}		
		
		
		
		
		
		
		
/*잘못된 방법
 		int i = 5;
		
		if(i >= 1) {
			for (int j = 0; j <=4 ; j++) {
				for (i; i <= 1; i--) {
					if (j !=0) {
						System.out.print("-");
				}			
			}

		
		}else {
				
		}
 
 
		//for(int i = 0; i <= 4; i++) {
		//	System.out.printt("-")
	
*/
