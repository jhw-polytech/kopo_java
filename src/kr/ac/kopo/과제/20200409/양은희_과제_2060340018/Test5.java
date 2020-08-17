package Homework_0409;

import java.util.Scanner;

// 5)1달러는 현재 1,092.50원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을 작성하세요.

public class Test5 {

	public static void main(String[] args) {
		
		final double ex = 1092.50;				// 환율은 상수처리
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하세요 ? ");
		
		int dollar = sc.nextInt();
		System.out.println("원화 : "+ex*dollar+"원");	// 환율을 계산하여 원화로 얼마인지 나타낸다.
		
	}
}
