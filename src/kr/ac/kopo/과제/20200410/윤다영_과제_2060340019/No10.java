package kr.ac.kopo.assignment.day03;

public class No10 {
	
	/*
	 *****
	 _****
	 __***
	 ___**
	 ____*
	 ___**
	 __***
	 _****
	 *****
	 출력하기
	 */
	public static void main(String[] args) {
			
			for(int i = 1; i <= 9; i++) {
				
				if(i < 5) {
					for(int j = 1; j <= 5; j++) {
						if(i<=j) {
							System.out.print("*");
						}else {
							System.out.print("_");
						}
					}
					
				}
				
				else {
					for(int j = 9; j > 4 ; j--) {
						if(j <= i) {
							System.out.print("*");
						}else {
							System.out.print("_");
						}
					}
				}
				
								
				System.out.println(" ");
			}
	
		}

}
