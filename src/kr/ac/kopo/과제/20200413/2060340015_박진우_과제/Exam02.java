package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

/*
    5개의 짝수를 입력받아 출력하는 코드 작성
    
    < 5개의 정수 출력 >
    12 20 10 26 4

 */

public class Exam02 {

	public static void main(String[] args) {
		
		int numArr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		/*
			while문을 사용하지 않고 작성할 수 있는 방법을 한번 생각해봐요~~ ^^
		*/

		int input;
		for(int i = 0; i < 5; i++) {
			while(true) {
				System.out.printf("%d's 정수 : ", i+1);
				input = sc.nextInt();
				sc.nextLine();
				
				if(input%2 == 0) {
					numArr[i] = input;
					break;
				}
			}
		}
		sc.close();
		
		System.out.println("\n< 5개의 정수 출력 >");
		for(int item : numArr) {
			System.out.printf("%d ", item);
		}
	}
}
