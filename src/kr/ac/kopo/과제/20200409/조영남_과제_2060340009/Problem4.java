package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/*
4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 
      몫과 나머지를 화면에 출력하시오.
      
      정수를 입력하세요  :  10 
      나눌 수를 입력하세요  :  7 
      몫 : 1 
      나머지 : 3 
 */

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");		
		int dividend = sc.nextInt();
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		System.out.print("나눌 수를 입력하세요 : ");
		int divisor = sc.nextInt();
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		int quotient = dividend / divisor; // 몫
		int remainder = dividend % divisor; // 나머지
				
		System.out.println("몫 : " + quotient);
		System.out.println("나머지 : " + remainder);		
	}
}
