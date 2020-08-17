package kr.ac.kopo.day6.assignment;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String [] args) {
		
		//Scanner와 Calculator클래스 객체 생성
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		//2개 정수 입력받기
		System.out.println("정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수 : ");	
		int num2 = sc.nextInt();		
		sc.nextLine();
		
		//Calculator클래스 메소드 사용
		//사칙연산 결과 출력
		System.out.println(num1 + "+" + num2 + "=" + cal.add(num1, num2)); 	
		System.out.println(num1 + "-" + num2 + "=" + cal.substract(num1, num2)); 	
		System.out.println(num1 + "*" + num2 + "=" + cal.multiply(num1, num2)); 	
		System.out.println(num1 + "/" + num2 + "=" + cal.divide(num1, num2)); 	
		System.out.println(); 	
		//소수 여부 출력
		System.out.println(num1 + " 소수체크 : " + cal.prime(num1));
		System.out.println(num2 + " 소수체크 : " + cal.prime(num2));
		
		
		
	}
}
