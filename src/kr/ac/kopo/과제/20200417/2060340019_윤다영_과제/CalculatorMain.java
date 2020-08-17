package kr.ac.kopo.assignment.day06;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.print("정수 : ");
		int i = sc.nextInt();
		sc.nextLine();
		System.out.print("정수 : ");
		int j = sc.nextInt();
		sc.nextLine();
		
		//사칙연산 출력
		cal.calculation(i, j);
		
		//소수 체크 출력
		cal.primeNumOutput(i, j);
		
		
		
	}

}
