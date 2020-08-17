package test0418;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cl = new Calculator();
		
		System.out.println("정수 2개를 입력해주세요");
		int first = sc.nextInt();
		sc.nextLine();
		int second = sc.nextInt();
		sc.nextLine();
		
		cl.input(first, second);
		cl.print(first, second);
		
		
		
	}

}
