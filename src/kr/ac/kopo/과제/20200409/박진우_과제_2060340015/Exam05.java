package kr.ac.jinwoo.day02.homework;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		double exchangeRateDollar= 1092.50;
		double dollar, won;
		
		System.out.printf("달러를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			dollar = sc.nextDouble();
			sc.nextLine();
			if(dollar > 0) 
				break;
			else 
				System.out.println("양수를 입력해주세요.");
			
		}
		
		won = dollar * exchangeRateDollar;
		
		System.out.printf("원화 : %.2f", won);
	}
}
