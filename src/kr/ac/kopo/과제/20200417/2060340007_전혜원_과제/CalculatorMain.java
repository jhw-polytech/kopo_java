package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class CalculatorMain {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수 입력받기
		System.out.println("첫 번째 정수를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int j = sc.nextInt();

		//계산기 클래스 인스턴스 생성 및 실행
		Calculator cal = new Calculator();
		cal.calculator(i, j);
		
		sc.close();
	}
	
	
	
}
