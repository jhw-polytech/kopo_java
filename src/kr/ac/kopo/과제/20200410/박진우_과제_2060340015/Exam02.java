package kr.ac.jinwoo.day03.homework;

import java.util.Scanner;

/*
 * 4개의 정수를 입력받아 가장 큰 수를 구하는 코드를 작성하시오.
 * 
 * ex) input  : 89 4 222 6
 * 	   output : 89, 4, 22, 6 중 가장 큰 수 : 222
 * 
 */

public class Exam02 {
	
	public static void main(String[] args) {
		
		int inputNum1, inputNum2, inputNum3, inputNum4;
		
		System.out.printf("정수 4개를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		inputNum1 = sc.nextInt();
		inputNum2 = sc.nextInt();
		inputNum3 = sc.nextInt();
		inputNum4 = sc.nextInt();
		sc.nextLine();
		
		int maxNum = inputNum1;
		
		if(maxNum < inputNum2) maxNum = inputNum2;
		if(maxNum < inputNum3) maxNum = inputNum3;
		if(maxNum < inputNum4) maxNum = inputNum4;
		
		System.out.printf("%d, %d, %d, %d 중 가장 큰 수 : %d", inputNum1, inputNum2, inputNum3, inputNum4, maxNum);
	}
}
