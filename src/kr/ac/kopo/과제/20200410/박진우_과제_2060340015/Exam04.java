package kr.ac.jinwoo.day03.homework;

import java.util.Scanner;

/*
 * 다음의 결과를 보이는 프로그램을 작성하시오.
 * 
 * 1 - 100 사이의 정수를 입력 : 40
 * 2 - 10 사이의 정수를 입력 : 5
 * 
 * < 1 ~ 40 사이의 5의 배수를 제외한 정수 출력 >
 *  1 2 3 4 6 7 8 9 11 ... 39
 *  
 * < 1 ~ 40 사이의 5의 배수를 제외한 정수 5개씩 출력>
 *  1 2 3 4 6
 *  7 8 9 11 12
 *  ...
 * 
 */

public class Exam04 {

	public static void main(String[] args) {
		
		int inputNum1, inputNum2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수를 입력  : ");
		while(true) {
			inputNum1 = sc.nextInt();
			sc.nextLine();
			if(1 < inputNum1 && inputNum1 < 100) {
				break;
			}
			else {
				System.out.print("1 - 100 사이의 정수를 입력해주세요 : ");
			}
		}
		
		System.out.printf("2 - 10 사이의 정수를 입력  : ");
		while(true) {
			inputNum2 = sc.nextInt();
			sc.nextLine();
			if(2 < inputNum2 && inputNum2 < 10) {
				break;
			}
			else {
				System.out.print("2 - 10 사이의 정수를 입력해주세요 : ");
			}
		}
		System.out.print('\n');
		
		System.out.printf("< 1 - %d 사이의 %d의 배수를 제외한 정수 출력 >\n", inputNum1, inputNum2);
		for(int i = 1; i < inputNum1; i++) {
			if((i%inputNum2) != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.print("\n\n");
		
		int printCnt = 0;
		System.out.printf("< 1 - %d 사이의 %d의 배수를 제외한 정수 5개씩 출력 >\n", inputNum1, inputNum2);
		for(int i = 1; i < inputNum1; i++) {
			if((i%inputNum2) != 0) {
				System.out.printf("%d\t ", i);
				printCnt++;
				if(printCnt == 5) {
					printCnt = 0;
					System.out.print('\n');
				}
			}
		}
	}
}
