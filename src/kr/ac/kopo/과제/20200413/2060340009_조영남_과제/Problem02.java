package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

/*
 2. 5개의 짝수를 입력받아 출력하는 코드를 작성    
 1's 정수 : 12    
 2's 정수 : 5       
 2's 정수 : 20    
 3's 정수 : 10    
 4's 정수 : 26    
 5's 정수 : 5    
 5's 정수 : 11    
 5's 정수 : 4        
 
 < 5개의 정수 출력 >    
 12   20   10   26   4   
 */

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] evenArr = new int[5]; // 짝수를 담을 배열
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "'s num : ");
			evenArr[i] = sc.nextInt();								
			
			while(evenArr[i] % 2 != 0) { // 홀수를 입력받으면 계속해서 재입력 요청
				System.out.print((i+1) + "'s num : ");
				evenArr[i] = sc.nextInt();								
			}			
		}
		
		System.out.println();
		System.out.println("< 5개의 정수 출력 >");
		for(int num : evenArr) {
			System.out.printf("%d ", num);
		}
	}
}
