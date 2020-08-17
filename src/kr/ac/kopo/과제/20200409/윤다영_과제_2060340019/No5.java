package kr.ac.kopo.assignment.first;

import java.util.Scanner;

public class No5 {
	/*
	 달러를 입력 받아 원화로 보여주는 프로그램 작성
	 1달러 = 1,092.50원
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 : ");
		int dollar = sc.nextInt();
		sc.nextLine();
		
		double won = dollar * 1092.50;
		
		System.out.printf("원화 : %.2f", won);
		
		
	}

}
