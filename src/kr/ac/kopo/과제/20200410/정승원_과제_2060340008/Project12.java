package kr.ac.kopo.day03.project;

/**
 * 
 * @author tess
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
public class Project12 {

	public static void main(String[] args) {
		

		for (int i=1; i <= 9; i++) {
			
			if (i <= 5) { // i가 5랑 같거나 적을때, 
				for (int j=1; j <= i; j++) { // i가 1인 경우 j가 1로 시작하므로, 한번 출력 
					System.out.print("*");
				} 
				for (int j=(4-i); j >= 0; j--) {  
					System.out.print("-");
				} 
				for (int j=(4-i); j >= 0; j--) { 
					System.out.print("-");
				} 
				for (int j=1; j <= i; j++) { // i가 1인 경우 j가 1로 시작하므로, 한번 출력 
					System.out.print("*");
				} 
				
				
			} else { // i가 6이상일때,  
				for (int j=1; j <= (10-i); j++) { // i가 1인 경우 j가 1로 시작하므로, 한번 출력 
					System.out.print("*");
				} 
				
				for (int j=(10-i); j <= 4; j++) {
					System.out.print("-");
				} 
				
				for (int j=(10-i); j <= 4; j++) {
					System.out.print("-");
				} 
				for (int j=1; j <= (10-i); j++) { // i가 1인 경우 j가 1로 시작하므로, 한번 출력 
					System.out.print("*");
				} 
			}
			 
			System.out.println();
		}
		
		// 좀더 깔끔한 방법이 있을텐데, 일단 하드코딩했다. 
	}
}
