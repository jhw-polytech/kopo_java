package kr.ac.yeongnam.day06.homework;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int firstInt = Integer.parseInt(sc.nextLine());

		System.out.print("두번째 정수를 입력해주세요 : ");
		int secondInt = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		Calculator c = new Calculator(); // Calculator 객체 생성
		c.fourOperation(firstInt, secondInt); // Calculator 타입의 객체 'c'의 fourOperation 메소드를 실행
		c.primeCheck(firstInt, secondInt); // primeCheck 메소드를 실행
		
	}

}
