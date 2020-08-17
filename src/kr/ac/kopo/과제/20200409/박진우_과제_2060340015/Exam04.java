package kr.ac.jinwoo.day02.homework;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		System.out.println("나눌 수를 입력하세요 : ");
		int divideNum = sc.nextInt();
		sc.nextLine();
		
		int quotient, remainder;
		
		quotient = inputNum / divideNum;
		remainder = inputNum % divideNum;
		
		System.out.printf("몫 : %d  ", quotient);
		System.out.printf("나머지 : %d", remainder);
	}
}
