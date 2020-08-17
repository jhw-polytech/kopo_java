package Assignment05;

import java.util.Scanner;

public class CalcMain {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Calc c = new Calc();
		
		
		System.out.print("정수 입력 : ");
		int num1=sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수 입력 : ");
		int num2=sc.nextInt();
		sc.nextLine();
		
		c.add(num1, num2);
		c.minus(num1, num2);
		c.multiple(num1, num2);
		c.divide(num1, num2);
		
		c.prime(num1, num2);
	}
}
