package kr.ac.kopo.day3.assignment;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
	//정수를 입력받아 1에서부터 입력받은 정수 사이의 숫자 출력하기
		
		//정수 입력받기
		System.out.println("1 - 100사이의 정수를 입력 :");
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		
		
		//1에서부터 입력받은 정수 사이의 숫자 출력
		System.out.printf("< 1 ~ %d 정수 출력 >", inputNumber);
		System.out.print('\n');
		for (int i = 1; i <= inputNumber; i++) {
			System.out.print(i);
			System.out.print(' ');
		}
		
		
	}
}
