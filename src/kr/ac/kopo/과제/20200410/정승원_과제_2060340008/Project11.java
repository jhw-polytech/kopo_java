package kr.ac.kopo.day03.project;
/**
 * 
 * @author tess
다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
********* 
-******* 
--***** 
---*** 
----*
 */


public class Project11 {
	
	public static void main(String[] args) {
		
		int x = 9;
		for (int i=0; i <= 10; i++) {
					
			if (i <= 4) { // i가 4랑 같거나 적을때, 
				
				for (int j=1; j <= i; j++) { // i가 0인 경우 j가 1로 시작하므로, 반복문에 들어가지 않는다.  
					System.out.print("-");
				} 
				for (int j=x; j >= 1; j--) { // 별 9개를 찍는 경우가 된다. 
					System.out.print("*");
				} 
				x -= 2; // 별의 개수는 2씩 줄어드는 규칙이 있다. 
			}
			System.out.println();
		}
		
	}
}
