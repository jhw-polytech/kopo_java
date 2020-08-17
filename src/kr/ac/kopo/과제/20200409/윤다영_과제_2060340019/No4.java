package kr.ac.kopo.assignment.first;

import java.util.Scanner;

public class No4 {
	/*
	 화면에서 하나의 정수를 입력받고, 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면에 출력하시오
	 */
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("나눌 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.printf("몫 : %d \n나머지 : %d\n", quotient, remainder);
		
	}

}
