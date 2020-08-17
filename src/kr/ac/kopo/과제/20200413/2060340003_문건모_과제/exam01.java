package test0414;

/*
 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오. 
 1's num : 12
 2's num : 5
 3's num : 8
 4's num : 30
 5's num : 22
 6's num : 87
 7's num : 9
 8's num : 4
 9's num : 15
 10's num : 22

 < 짝수 >
 12 8 30 22 4 22
 짝수의 총합 : XXX

 < 홀수 >
 5 87 9 15
 홀수의 총합 : XXX
  

 */

import java.util.Scanner;

public class exam01 {
	
	public static void main(String[] args) {
		
		System.out.println("10개의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[10]; //length가 10인 배열 생성
		
		
		for(int i = 0;i<ar.length;i++) { // 배열에 입력값을 할당
			
			ar[i] = sc.nextInt();
			
		}
		for(int i = 0;i<ar.length;i++) { // 위에서 나온 문장 출력
			
			System.out.println(i+1 + "'s num :" + ar[i]);
		}
		
		System.out.println("<짞수>");
		
		int even_sum =0;
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i]%2 == 0) {  // 배열에 할당된 수가 짝수일 때
				
				System.out.printf("%-3d",ar[i]);
				
				even_sum += ar[i];   // 짝수의 합을 표현
			
			}
				
		}
				
		System.out.println();
		System.out.println("짝수의 총합 :" + even_sum);
			
		
		
		
	    System.out.println("<홀수>");
	    
	    int odd_sum = 0;
		for(int i = 0;i<ar.length;i++) {
			
			if(ar[i]%2 == 1) { //배열에 할당된 수가 홀수일 때
				
				System.out.printf("%-3d",ar[i]);
				odd_sum += ar[i]; // 홀수의 합을 표현
				
			}
		}
		
		System.out.println();
		System.out.println("홀수의 총합 :" + odd_sum);
	}

}
