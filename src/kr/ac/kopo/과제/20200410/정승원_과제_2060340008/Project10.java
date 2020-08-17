package kr.ac.kopo.day03.project;

/**
 * 
 * @author tess
다음의 결과를 보이는 클래스 

(단 출력메소드에 하나의 문자만 가능) 반복문 5개, 조건문 1개 이용가능

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
*
 */
public class Project10 {
	
	public static void main(String[] args) {
		
		for (int i=0; i <= 10; i++) {
			
			if (i <= 5) { // i가 5랑 같거나 적을때, 
				for (int j=1; j <= i; j++) { // i가 0인 경우 j가 1로 시작하므로, 반복문에 들어가지 않는다.  
					System.out.print("-");
				} 
				for (int j=(5-i); j >= 0; j--) { // 별 5개를 찍는 경우가 된다. 
					System.out.print("*");
				} 
			} else { // i가 6이상일때,  
				for (int j=1; j <= (10-i); j++) { 
					System.out.print("-");
				} 
				
				for (int j=(10-i); j <= 5; j++) {
					System.out.print("*");
				} 
				
			}
			 
			System.out.println();
		}
		
	}

}
