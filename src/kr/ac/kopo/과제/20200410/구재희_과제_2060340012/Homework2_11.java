package jaeheehomework;

public class Homework2_11 {
	public static void main(String[] args) {
		System.out.println("11번\n");
		/*
		 출력
		 *********
		 -*******
		 --*****
   		 ---***
		 ----* 
		
		*/
		
		//행은 총 5개이고, 각 행의 결과물 개수는 9,8,7,6,5로 줄어듦
			for(int k = 9; k >= 5; k--) {
				
				int i = 10 - k; //다음 행으로 갈때마다, 1씩 증가하는 변수를 만듦
				
					//하나의 행의 결과물은 k개씩 나옴 
					for(int j = 1; j <= k; j++) {
						
						if(i > j) {
							System.out.print("-");
						} else {
							System.out.print("*");
						}
					}
					System.out.print("\n");
				}
				
		}
}
		



