package kr.ac.yeongnam.day03.homework;

/*
 	10. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 	    반복문 5개, 조건문 1개 이용가능    
 	    반복문 3개, 조건문 3개    
 	    반복문 3개, 조건문 1개    
 	    반복문 2개, 조건문 2개 
 	  
 	  ***** 
 	  -**** 
 	  --*** 
 	  ---** 
 	  ----* 
 	  ---** 
 	  --*** 
 	  -**** 
 	  *****  
 */

public class Problem10 {

	public static void main(String[] args) {
		
		// 해당 이미지를 출력하는 코드(반복문 3 조건문 3)
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) { // 1 ~ 5행
				for(int j = 1; j <= 5; j++) {
					if(i > j) { // 행의 인덱스가 열의 인덱스보다 클 때 '_' 출력
						System.out.print("_");
					} else { // 행의 인덱스가 열의 인덱스보다 작을 때 '*' 출력
						System.out.print("*");
					}
				}
			} else { // 6행 ~ 9행
				for(int j = 1; j <= 5; j++) {
					if(10-j > i) { // 10-j 값이 행의 인덱스보다 클 때 '_' 출력
						System.out.print("_");
					} else { // 10-j 값이 행의 인덱스보다 작을 때 '*' 출력
						System.out.print("*");
					}
				}
			}
			System.out.println("");
		}
		
		
		/* 방법2
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j >= i) {
					System.out.print("*");					
				} else {
					System.out.print("-");					
				}
			}
			System.out.println("");
		}
		
		for(int i = 5; i <= 9; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j <= 9-i) {
					System.out.print("-");					
				} else {
					System.out.print("*");					
				}
			}
			System.out.println("");
		}
		*/
	}
}
