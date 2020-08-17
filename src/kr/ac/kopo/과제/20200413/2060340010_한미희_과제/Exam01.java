package kr.ac.kopo.day4.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {
	
	public static void main(String[] args) {
	/*10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오. 
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
		
		//10개의 정수를 담을 배열 선언
		int[] intArr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		//각 배열의 원소에 입력받은 정수 대입
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d's num : ", i+1);
			intArr[i] = sc.nextInt();
		}
		
		
		//짝수 출력
		System.out.println("<짝수>");
		int evenSum = 0;				//짝수의 총합을 담을 변수 선언
		for (int i = 0; i < 10; i++) {		//각 배열의 원소에 대해서 
			if (intArr[i] % 2 == 0) {			//2로 나눠떨어지면 출력 & 짝수의 총합을 나타내는 변수에 더함
				System.out.print(intArr[i]);
				System.out.print("  ");
				evenSum += intArr[i];
			}
		}
		//짝수의 총합 출력
		System.out.print('\n');
		System.out.printf("짝수의 총합 : %d", evenSum);	
		System.out.print('\n');
		System.out.print('\n');
		
		
		//홀수 출력
		System.out.println("<홀수>");
		int oddSum = 0;					//홀수의 총합을 담을 변수 선언
		for (int i = 0; i < 10; i++) {		//각 배열의 원소에 대해서 
			if (intArr[i] % 2 != 0) {			//2로 나눠떨어지지 않으면 출력 & 홀수의 총합을 나타내는 변수에 더함
				System.out.print(intArr[i]);
				System.out.print("  ");
				oddSum += intArr[i];
			}
		}
		//홀수의 총합 출력
		System.out.print('\n');
		System.out.printf("홀수의 총합 : %d", oddSum);	

		
	}
}
