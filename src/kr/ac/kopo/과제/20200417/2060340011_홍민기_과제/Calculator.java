package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	
	void getNums() { // 입력받기 위한 출력문과 입력문을 담은 메소드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수 : ");
		
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
	}
	
	int sum() {
		return num1+num2;
	}
	
	int subtract() {
		return num1 - num2;
	}
	
	int multiply() {
		return num1 * num2;
	}
	
	double divide() {
		return (double)num1 / num2;
	}

	boolean isPrime(int num) {
		for(int i=2;i<num;i++) { // 소수인지 아닌지 판별하는 반복문
			if(num %i ==0) {
				return false; // 나누어지는 수가 있을 때, 바로 false를 반환
			}
		}
		return true; // 반복문을 다돌면, 나누어지는 수가 없다는 것이므로 소수, true반환
	}
	
	void print() {
		
		System.out.println(num1+" + "+num2+" = "+sum());
		System.out.println(num1+" - "+num2+" = "+subtract());
		System.out.println(num1+" * "+num2+" = "+multiply());
		System.out.println(num1+" / "+num2+" = "+divide());
		System.out.println();
		System.out.println(num1+" 소수체크 : "+isPrime(num1));
		System.out.println(num2+" 소수체크 : "+isPrime(num2));
	}
}
