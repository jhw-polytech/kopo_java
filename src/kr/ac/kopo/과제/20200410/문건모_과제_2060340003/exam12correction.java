package test0411;

/*
 * 다음의 결과를 보이는 코드를 작성하시요.(단, 출력메소드에 하나의 문자만 가능)
 * 
 * *_______*
 * **_____**
 * ***___***
 * ****_****
 * *********
 * ****_****
 * ***___***
 * **_____**
 * *_______*
 */

public class exam12correction {
	
	public static void main(String[] args) {
		
		for(int i = 1;i<=9;i++) {
			
			if(i<5) {
				
				for(int j = 1;j<=i ;j++) {
					
					System.out.print("*");
				}
				
				for(int j = i + 1;j<=9-i ;j++) {
					
					System.out.print("_");
				}
				
				for(int j = 10-i ;j<=9 ;j++) {
					
					System.out.print("*");
				}
				
				System.out.print('\n');
				
			}else if(i == 5) {
				
				for(int j =1 ;j<=9 ;j++ ) {
					
					System.out.print("*");
				}
				System.out.print('\n');
				
			}else {
				
				for(int j = 1 ; j<11-i ; j++) {
					
					System.out.print("*");
				}
				
				for(int j = 11-i;j<i ;j++) {
					
					System.out.print("_");
				}
				
				for(int j = i + 1 ;j<=10;j++) {
					
					System.out.print("*");
				}
				System.out.print('\n');
			}
			
			
			
		}
		
	}

}
