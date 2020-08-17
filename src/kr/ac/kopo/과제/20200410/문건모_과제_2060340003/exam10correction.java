package test0411;

/*
 * 다음의 결과를 보이는 코드를 작성하시오. (단, 출력메소드에 하나의 문자만 가능)
 * 반복문 5개, 조건문 1개 이용가능
 * 반복문 3개, 조건문 3개
 * 반복문 3개, 조건문 1개
 * 반복문 2개, 조건문 2개
 * 
 * *****
 * _****
 * __***
 * ___**
 * ____*
 * ___**
 * __***
 * _****
 * *****
 */

// 다른 방식으로 하는 것도 찾아보겠습니다.
public class exam10correction {
	
	public static void main(String[] args) {
		
		for(int i = 1;i<=9 ;i++) {
			
			if(i<=5) {
				
				for(int j = 1;j<i ;j++) {
					
					System.out.print("_");
				}
				
				for(int j = i ;j<=5;j++ ) {
					
					System.out.print("*");
				}
				System.out.print('\n');
				
			}else {
				
				for(int j=1;j<=9-i;j++) {
					
					System.out.print("_");
				}
				
				for(int j = 10 -i ;j<=5;j++ ) {
					
					System.out.print("*");
				}
				
				System.out.print('\n');
				
			}
			
			
		}
	
		
		
	}

}
