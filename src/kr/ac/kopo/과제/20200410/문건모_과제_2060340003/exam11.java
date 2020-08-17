package test0411;

/*
 *  다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 *  
 *  *********
 *  _*******
 *  __*****
 *  ___***
 *  ____*
 */


public class exam11 {
	
	public static void main(String[] args) {
		
		
		for(int i = 1;i<=5 ;i++) { //5행을 나타냄
			
			for(int j = 1;j<=9;j++) { //9열을 나타냄
				
				if(i>j) {
					
					System.out.print("_");  // "_"가 나오는 조건문
				
				}else if(i<=j && i + j< 11) { // "*"가 나오는 조건문
					
					System.out.print("*");
				
				}else {
					
					System.out.print(" ");
				}
				
				
				
				
			}
			
			System.out.println(); //한 행을 마치고 다음 행을 표시하기 위한 줄넘김
		}
		
 }
}