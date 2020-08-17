package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

/*
 1. 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오. 
 
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
   12  8  30  22  4  22    
   짝수의 총합 : XXX        
   
   < 홀수 >    
   5  87  9  15      
   홀수의 총합 : XXX
 */

public class Problem01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 정수 타입의 배열 생성
		int[] intArr = new int[10];		
		for(int i = 0; i <= 9; i++) {
			System.out.print((i+1) + "'s num : ");
			intArr[i] = sc.nextInt();
		}
				
		String strEven = ""; // 짝수 정수를 나타내는 문자열
		String strOdd = ""; // 홀수 정수를 나타내는 문자열
		
		int sumEven = 0; // 짝수의 합
		int sumOdd = 0; // 홀수의 합
		
		for(int num : intArr) {
			if(num % 2 == 0) { // 해당 요소가 짝수일 때
				sumEven = sumEven + num;
				strEven = strEven + Integer.toString(num) + " ";
			} else { // 해당 요소가 홀수일 때
				sumOdd = sumOdd + num;
				strOdd = strOdd + Integer.toString(num) + " ";
			}
		}
		
		System.out.println("< 짝수 >");
		System.out.println(strEven);
		System.out.printf("짝수의 총합 : %d", sumEven);
		System.out.println();		
		System.out.println("< 홀수 >");
		System.out.println(strOdd);
		System.out.printf("홀수의 총합 : %d", sumOdd);			
	}
}
