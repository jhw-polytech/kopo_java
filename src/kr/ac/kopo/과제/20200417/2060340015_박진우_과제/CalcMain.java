package kr.ac.jinwoo.day06.homework;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		calc.setNum1(Integer.parseInt(sc.nextLine()));
		
		System.out.print("정수 : ");
		calc.setNum2(Integer.parseInt(sc.nextLine()));
		
		System.out.println();
		System.out.printf("%d + %d = %d\n", calc.getNum1(), calc.getNum2(), calc.sum());
		System.out.printf("%d - %d = %d\n", calc.getNum1(), calc.getNum2(), calc.sub());
		System.out.printf("%d * %d = %d\n", calc.getNum1(), calc.getNum2(), calc.mul());
		System.out.printf("%d / %d = %.1f\n", calc.getNum1(), calc.getNum2(), calc.div());
		System.out.println();
			
		System.out.println(calc.getNum1() + " 소수체크 : " + calc.isPrime(calc.getNum1()));
		System.out.println(calc.getNum2() + " 소수체크 : " + calc.isPrime(calc.getNum2()));
		
	}
}
