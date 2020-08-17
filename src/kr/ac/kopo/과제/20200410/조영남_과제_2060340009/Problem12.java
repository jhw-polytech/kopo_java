package kr.ac.yeongnam.day03.homework;


/*
 	12. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능) 
 
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

/*
	for(int i = 1; i <= 9; i++) {}
	로 코드를 구성하면 또 다른 과제가 되는거 같거든요...
	다시금 해주시면 감사하겠습니다.

	===> 네 교수님, 말씀하신 방법대로 새롭게 구현해봤습니다.
	===> if 문의 조건에 '||' 연산자를 활용해서 쉽게 구현할 수 있었습니다. 감사합니다^^
*/

public class Problem12 {

	public static void main(String[] args) {
		
		// 피드백 받은 후, 수정한 코드
		for(int i = 1; i <= 9; i++) {
			if(i < 5) { // 1 ~ 4행 규칙
				for(int j = 1; j <= 10; j++) {
					if(i >= j || (10-i) <= j) {
						System.out.print("*");						
					} else {
						System.out.print("_");
					}
				}
				System.out.println();
				
			} else { // 5 ~ 9행 규칙
				for(int j = 1; j <= 10; j++) {
					if((10-i) >= j || i <= j) {
						System.out.print("*");						
					} else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
		}	

		/* 피드백 받기 전 코드
		for(int i = 1; i <= 5; i++) { // 1행부터 5행까지 반복
			for(int j = 1; j <= 9; j++) {
				if(j < 5) { // 1열부터 4열까지의 규칙
					if(i >= j) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}
				} else { // 5열부터 9열까지의 규칙
					if(10-i <= j) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}					
				} 
			}
			System.out.println("");
		}
		
		for(int i = 1; i <= 4; i++) { // 6행부터 9행까지 반복
			for(int j = 1; j <= 9; j++) {
				if(j < 5) { // 1열부터 4열까지의 규칙
					if(6-j <= i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				} else { // 5부터 9열까지의 규칙
					if(i >= j-4) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}					
				}
			}
			System.out.println("");			
		}
		*/
	}
}
