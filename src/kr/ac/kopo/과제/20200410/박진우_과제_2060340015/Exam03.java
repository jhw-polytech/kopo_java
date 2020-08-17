package kr.ac.jinwoo.day03.homework;

import java.util.Scanner;

/*
 * 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성하시오.
 * 
 * ex) input  : 60
 *     output : < 1 ~ 60 정수 출력 >
 *              1 2 3 ... 60
 *              
 */

public class Exam03 {

	public static void main(String[] args) {
		
		int inputNum;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("1 - 100 사이의 정수를 입력 : ");
		
		while(true) {
			inputNum = sc.nextInt();
			sc.nextLine();
			if(1 < inputNum && inputNum < 100) {
				break;
			}
			else {
				System.out.printf("1 - 100 사이의 정수를 입력해주세요 : ");
			}
		}
		
		System.out.printf("< 1 ~ %d 정수 출력 >\n", inputNum);
		
		for(int i = 1; i <= inputNum; i++) {
			System.out.printf("%d ", i);
		}
		
	}
}
