package jaeheehomework;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		Calculator c = new Calculator();
		
		c.cal(num1, num2);
		

	}
	
}
