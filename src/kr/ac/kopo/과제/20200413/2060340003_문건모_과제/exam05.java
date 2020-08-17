package test0414;

/*
 * 소수 구하기
 * 2 ~ 100 까지 숫자배열
 * 2 3 4 5 6 7 8 9 10, ... ,98 99 100
 * 처음 숫자부터 자기 자신 사이에 숫자가아무것도 없으면 소수
 */

// 처음 할당한 배열에 자기를 제외하고 자기 숫자만큼을 계속 더한 인덱스에 0을 할당하면 소수가 남지 않을까 싶어서 짜보려 했지만 잘 안됐습니다...ㅠㅠ 
/*
	남의 방식을 코드로 구현하는것이 어렵긴 하지만 계속 고민해보셔야 해요
	그래야 본인의 방법을 코드로 적용하는 것이 쉬워질거에요
	이 코드는 중첩된 반복문이 필요합니다.
	수업시간에 다시 해볼게요
*/
import java.util.Arrays;

public class exam05 {
	
	public static void main(String[] args) {
		
		int[] num = new int[99];
		
		
		for(int i = 0;i<num.length;i++) {
			
			num[i] = i + 2;
		}	
								
		for(int i = 2;i<47;i++) {
		
		int cnt = 0;
		while(cnt<99) {
			
			cnt+= i + 2;
			num[cnt] = 0; 
		  }
		 
		
		}
					
		for(int i = 0;i<num.length;i++) { 
			if(num[i] != 0) {
				
				System.out.printf("%-3d",num[i]);
			}
		}
		
	}
	
}
			
				
				
		
			
			
		
		
		


		

		
		
		
			
				

		
		
		
