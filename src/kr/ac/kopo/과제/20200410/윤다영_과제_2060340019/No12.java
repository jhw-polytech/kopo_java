package kr.ac.kopo.assignment.day03;

public class No12 {
	/*
	 다음의 결과를 보이는 코드를 작성하시오
	 *_______*	(1-7-1)
	 **_____** 	(2-5-2)
	 ***___***	(3-3-3)
	 ****_****	(4-1-4)
	 *********	(9)
	 ****_****	(4-1-4)
	 ***___***	(3-3-3)
	 **_____**	(2-5-2)
	 *_______*	(1-7-1)
	 
	 */
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			if(i < 5) {
				for(int j = 1; j < 10; j++) {
					if(j <= i || j >= (10-i)) {
						System.out.print("*");
					}else if(j > i && j < (10-i)) {
						System.out.print("_");
					}
				}
				
			} else{
				for(int j = 1; j < 10; j++) {
					if( j <= 10-i || j >= i) {
						System.out.print("*");
					}else if(j > 10-i || j < i) {
						System.out.print("_");
					}
				}
			}
			
			System.out.println();
		}
	}
	

}
