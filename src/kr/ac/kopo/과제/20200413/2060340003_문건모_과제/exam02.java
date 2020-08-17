package test0414;

/*
 5개의 짝수를 입력받아 출력하는 코드를 작성
 1's 정수 : 12
 2's 정수 : 5
 2's 정수 : 20
 3's 정수 : 10
 4's 정수 : 26
 5's 정수 : 5
 5's 정수 : 11
 5's 정수 : 4

 < 5개의 정수 출력 >
 12 20 10 26 4
 * 
 * 
 */

import java.util.Scanner;

// 짝수의 개수가 만약 5개 정확히 입력받는 것이 아닌 적거나 많을 때는? 이라는 상황을 고려해서 만들어봤습니다
/*
	흐흐흐 건모씨 코드가 재미있네요~~ ^^
	int[] br = new int[1]; 
	이렇게 1개만 필요한 경우에는 배열보다는 그냥 int br; 변수가 더 좋은거랍니다~~ 
	과제하시느라 수고하셨습니다!!!
*/
public class exam02 {
	
	public static void main(String[] args) {
		
		System.out.println("5개의 짝수를 입력받아 출력하는 코드를 작성");
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[10];
		int[] br = new int[1];
		
		
		for(int i = 0;i<ar.length;i++) {
			
			ar[i] = sc.nextInt();
						
		}
		
		int cnt = 1;
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i]%2 == 0) {
				
				++cnt; // 짝수일 때는 's 의 카운트를 늘려준다
				System.out.println( cnt - 1 + "'s 정수 :" + ar[i]);
				
								
			}else {
				
				cnt += 0; // 홀수일 때는 's 의 카운트를 유지시켜준다
				System.out.println( cnt + "'s 정수 :" + ar[i]);
				
			}
			
			br[0] = cnt - 1; // 짝수의 개수를 측정하기 위해 cnt를 새로운 배열 br에 할당
			
		}
		
		if(br[0]<5) {
			
			System.out.println("짝수의 개수가 부족합니다");
		}else if(br[0]>5 ) {
			
			System.out.println("짝수의 개수가 많습니다");
		}else {
			
			System.out.println("알맞은 개수입니다");
		}
		
		
		System.out.println("<5개의 정수 출력>");
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i]%2 == 0) {
				
				System.out.printf("%-5d", ar[i]);
			}
		}
			
		
			
		
		
		
		
	}

}
