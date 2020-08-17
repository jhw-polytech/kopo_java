package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
	5. 1달러는 현재 1,092.50원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을
	작성하세요
	달러를 입력하세요 ? 10
	원화 : 10925.00원
*/

public class Exam05 {
	
	public static void main(String[] args) {
		
		//고정환율 선언
		final double RATE = 1092.50;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가지고 계신 달러를 입력해주세요: ");
		double dollar = sc.nextDouble();
		sc.nextLine();

		System.out.printf("현재 보유한 달러의 가격은 %.2f 원 입니다.", dollar*RATE);
		
		//스캐너 닫아주기
		sc.close();
	}

}
