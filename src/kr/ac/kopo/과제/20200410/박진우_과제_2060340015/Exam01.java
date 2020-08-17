package kr.ac.jinwoo.day03.homework;

import java.util.Scanner;

/*
 * 정수 3개를 입력받아 큰 수에서 작은 수 순으로 출력하는 코드를 작성하시오.
 * 
 * ex) input  : 12 6 22
 * 	   output : 22 12 6
 * 
 */

public class Exam01 {

	public static void main(String[] args) {
		
		int inputNum1, inputNum2, inputNum3;
		
		System.out.printf("정수 3개를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		inputNum1 = sc.nextInt();
		inputNum2 = sc.nextInt();
		inputNum3 = sc.nextInt();
		sc.nextLine();
		
		int temp;
		if(inputNum1 < inputNum2 || inputNum1 < inputNum3) {
			if(inputNum2 < inputNum3) {
				temp = inputNum3;
				inputNum3 = inputNum1;
				inputNum1 = temp;
			}
			else {
				temp = inputNum2;
				inputNum2 = inputNum1;
				inputNum1 = temp;
			}
		}
		if(inputNum2 < inputNum3) {
			temp = inputNum3;
			inputNum3 = inputNum2;
			inputNum2 = temp;
		}
		
		System.out.println(inputNum1 + " " + inputNum2 + " " + inputNum3);

	}
}
