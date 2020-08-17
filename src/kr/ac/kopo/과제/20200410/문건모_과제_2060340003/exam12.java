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


/*
	이것도 9줄이니깐요...
	for(int i = 1; i <= 9; i++) {

	}

	로 시작해보아요~~
	과제하느라 고생하셨어요 ^^
*/


public class exam12 {
	
	public static void main(String[] args) {
		
		for(int i = 1;i<=5 ;i++) { // 5행까지의 규칙을 설명하는 for문
			
			for(int j = 1;j<=9;j++) {
				
				if(i>=j) { // 앞 쪽부터 "*"가 나오는 규칙을 설명
					
					System.out.print("*");
					
				}else if(i+j<10) { // 그 다음 "_"가 나오는 규칙을 설명
					
					
					System.out.print("_");
				}else {
					
					System.out.print("*");
				}
								
			}
			
			System.out.println();
		}
		
		for(int i = 1;i<=4;i++) { // 나머지 4행의 규칙을 설명
			
			for(int j = 1;j<=9;j++) { 
				
				
				if(i+j<6) { // 앞에 "*"가 나오는 규칙을 설명
					
					System.out.print("*");
					
				}else if(j-i<=4) { // 그 다음 "_" 가 나오는 규칙을 설명
					
					System.out.print("_");
					
				}else {
					
					System.out.print("*");
				}
				
			}
			
		  System.out.println();	
		}
		
	}

}
