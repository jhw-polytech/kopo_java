package kr.ac.kopo.assignment.day03;

public class No9 {
	/*
	 구구단을 한 라인에 3단씩 출력하는 코드를 작성하세요. 이떄 9단은 나오면 안됩니다.
	 반복문은 최대 3개만 사용합니다.
	 
	 3단으로 나누는 방법을 찾지 못했습니다..ㅜ
	 */

	 /*
	 	이 문제는 조금 어려웠죠??? 원래 보너스 문제였는데 ㅎㅎㅎ
		 수업시간에 한번 작성해볼게요
	 */
	
	public static void main(String[] args) {
		
		int dan = 2;
		
		for(int i = 1 ; i < 9; i++) {
			
				
			for(dan = 2; dan < 10; dan ++) {
				System.out.printf("%d * %d = %d\t", dan, i, dan * i);
				//시도1
				//System.out.printf("%d * %d = %d\t", dan+1, i, (dan+1) * i);
				//System.out.printf("%d * %d = %d\n", dan+2, i, (dan+2) * i);
				
			}
			System.out.println();
			
		}
		
		
		/*
		 * 시도2

		
		for(int i = 1; i < 10; i += 3) {
			for(int j = 1; j < 9; j++) {
				for(int dan = i+1; dan < i+4; dan++) {
					System.out.printf("%d * %d = %d\t", dan, j, dan * j);					
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
			
		
		
	}
		
		
		

}
