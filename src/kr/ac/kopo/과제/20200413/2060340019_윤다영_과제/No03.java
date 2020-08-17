package kr.ac.kopo.assignment.day04;

import java.util.Scanner;

public class No03 {
	
	/*
	 다음 결과를 보이는 코드를 작성하시오
	 1번째 정수 : 10
	 2번째 정수 : 5
	 	10보다 큰수가 와야합니다.
	 2번째 정수 : 
	 
	 < PRINT >
	 10 12 36 40 67
	 < REVERSE >
	 76 4 63 21 1
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		//정수 입력받기
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 정수 : ");
			num[i] = sc.nextInt();
			
			//입력 받은 정수가 앞 정수보다 큰 수인지 확인
			while(i > 0 && num[i] <= num[i-1]) {
				
				// " ,"를 표현하기 위해 두개로 나눔 - 출력값 : "정수1, 정수2, "			
				if(i > 1) {
					for(int j = 0 ; j < i-1 ; j++) {
						System.out.print(num[j] + " ,");						
					}
				}
				//"마지막정수n보다 커야합니다"	
				System.out.println(num[i-1] + "보다 큰 수가 와야합니다.");
				
				//다시 입력받기			
				System.out.print((i+1) + "번째 정수 : ");
				num[i] = sc.nextInt();
			}
		}
		
		//PRINT 값 출력하기
		System.out.println("< PRINT >");
		for(int a : num) {
			System.out.print(a + " " );		
		}
		System.out.println();
		
		
		//REVERSE 값 출력하기
		/*
			다영씨 3일때 30으로 나오게 수정해주세요~~ ^^
		*/
		System.out.println("< REVERSE >");
		
		for(int i = 5; i > 0; i--) {
			int result = 0;
			//숫자 뒤집기 ex)1234 - 4321
			while(num[i-1] != 0) {
				result = result * 10 + num[i-1] % 10;
				num[i-1] /= 10;
			}
			num[i-1] = result;
			
			System.out.print(num[i-1] + " ");
		}
	} 

}
