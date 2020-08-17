package kr.ac.jinwoo.day03.homework;

import java.util.Scanner;

/*
 * 단을 입력받아 구구단을 출력하는 코드를 작성하시오.
 * 
 */

public class Exam06 {

	public static void main(String[] args) {
		
		int inputNum;
		
		System.out.printf("2 - 9 단을 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		inputNum = sc.nextInt();
		
		System.out.printf("\n*** %d단 ***\n", inputNum);
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, inputNum * i);
		}
		
	}
}
