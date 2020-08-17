package kr.ac.kopo.assignment.day03;

public class No11 {
	/*
	 다음 결과가 보이는 코드를 작성하시오
	 *********  (0 - 9 - 0)
	 _*******	(1 - 7 - 1)
	 __*****	(2 - 5 - 2)
	 ___***		(3 - 3 - 3)
	 ____*		(4 - 1 - 1)
	 */
	
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 10; j++) {
				if(j < i) {
					System.out.print("_");					
				}else if(j >= i && j <= 10-i) {
					System.out.print("*");
				}else if(j > 10-i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
