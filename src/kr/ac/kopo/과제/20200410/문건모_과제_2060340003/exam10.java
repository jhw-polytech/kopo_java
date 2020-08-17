package test0411;

/*
 * 다음의 결과를 보이는 코드를 작성하시오. (단, 출력메소드에 하나의 문자만 가능)
 * 반복문 5개, 조건문 1개 이용가능
 * 반복문 3개, 조건문 3개
 * 반복문 3개, 조건문 1개
 * 반복문 2개, 조건문 2개
 */

/*
	건모씨 총 9줄이니깐 우리는 무조건
	for(int i = 1; i <= 9; i++) {

	}
	로 시작해야합니다!!!!!
	다시 해봅시당
*/

public class exam10 {
	
	public static void main(String[] args) {
		
		for(int i = 1;i<=5;i++) {
			
			for(int j = 1;j<=5;j++) {
				
				if(i>j) {
					
					System.out.print("_");
				}else {
					
					System.out.print("*");
				}
				
			}
		 System.out.println();	
		}
		
		for(int i = 1;i<=4;i++) {
			
			for(int j = 1;j<=5;j++) {
				
				if(i+j<=4) {
					
					System.out.print("_");
				}else {
					
					System.out.print("*");
				}
				
				
			}
			
			System.out.println();
		}
		
	}

}
