package kr.ac.yeongnam.day03.homework;

/*
 	9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
 	      반복문은 최대 3개만 사용합니다.      
 	   2 * 1 = 2    3 * 1 = 3    4 * 1 = 4
 	   2 * 2 = 4    3 * 2 = 6    4 * 2 = 8      
 	   ...      
 	   5 * 1 = 5    6             7      
 	   ...      
 	   8            9          
 	   
 	   for(int dan = 2; dan <= 9; ) {      
 	   }   
 */

 /*
	제가 말을 잘못해서리... 10단나오면 안되는거였는데.. ㅜㅜ
	코드가 달라지시겠죠? 다시금 해주세요....

	===> 교수님, 9단까지 출력하고 10단은 나오지 않도록 수정했습니다!
 */

public class Problem09 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9;) {			
			for(int num = 1; num <= 9; num++) {
				if(dan == 8) { // 8단, 9단 (10단은 나오지 않도록 구성)
					System.out.printf("%d * %d = %d\t", dan, num, dan * num);
					System.out.printf("%d * %d = %d\n", dan+1, num, (dan+1) * num);				
				} else { // 2단부터 7단
					System.out.printf("%d * %d = %d\t", dan, num, dan * num);	
					System.out.printf("%d * %d = %d\t", dan+1, num, (dan+1) * num);				
					System.out.printf("%d * %d = %d\n", dan+2, num, (dan+2) * num);					
				}
			}	
			System.out.println("");
			dan += 3;
		}
		
		
		/* 방법2
		for(int dan = 2; dan <= 8; dan+=3) {
			
			for(int num = 1; num <= 9; num++) {
				if(dan == 8) {
					System.out.printf("%d * %d = %d\n", dan, num, dan * num);	
				} else {
					System.out.printf("%d * %d = %d\t", dan, num, dan * num);	
					System.out.printf("%d * %d = %d\t", dan+1, num, (dan+1) * num);				
					System.out.printf("%d * %d = %d\n", dan+2, num, (dan+2) * num);					
				}
			}			
			System.out.println("");
		}		
		*/
	}
}

