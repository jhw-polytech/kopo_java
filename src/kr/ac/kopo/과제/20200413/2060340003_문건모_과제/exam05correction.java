package test0414;

/*
 * 소수 구하기
 * 2 ~ 100 까지 숫자배열
 * 2 3 4 5 6 7 8 9 10, ... ,98 99 100
 * 처음 숫자부터 자기 자신 사이에 숫자가아무것도 없으면 소수
 */

import java.util.Arrays;

public class exam05correction {
	
	public static void main(String[] args) {
		
		int[] ar = new int[99];
		for(int i = 0;i<ar.length;i++) {
			
			ar[i] = i + 2;
		}
		
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i] != 0) {  //ar[i] 가 0이면 나눌수 없으므로 조건을 설정
			for(int j = i+1;j<ar.length;j++) {
				
				if(ar[j] % ar[i] == 0) {
					
					ar[j] = 0;
				}
				
			 }
			
			}
		}
		
		System.out.println(Arrays.toString(ar));
		
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i] != 0) {
				
				System.out.print(ar[i] + "  ");
			}
			
		}
		
	}

}
