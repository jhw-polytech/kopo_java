package kr.ac.kopo.day03.exam;

import java.util.Scanner;

/*
8. 시작단과 종료단을 입력받아 구구단을 출력하시오.
	시작단을 입력 : 5
	종료단을 입력 : 8
	
	*** 5단 ***
	5 * 1 = 5
	...
	8 * 9 = 72
	
	이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다
*/

public class Day03Exam08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("시작단을 입력하세요(1~9): ");
		int num1 = sc.nextInt();
		
		System.out.println("종료단을 입력하세요(1~9): ");
		int num2 = sc.nextInt();
		
		int convert;
		
		//시작단에 종료단보다 더 큰 수를 입력한 경우, 서로 바꿔주기
		if(num1 > num2) {
			convert = num2;
			num2 = num1;
			num1 = convert;					
		}
		
		// 시작단과 종료단의 차이만큼 반복되는 for문
		for(int i =0; i < (num2-num1+1); i++) {
			
			System.out.println("*** "+(num1+i)+"단 ***");
			
			/*
				j의 변수의 범위 1 부터 9까지요~~ ^^
			*/

			//각 단과 1~9까지의 곱을 나타내는 for문
			for(int j = 0; j <9; j ++) {
				System.out.println((num1+i) + " * " + j + " = "+num1*j);
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
