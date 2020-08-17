package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/*
5. 1달러는 현재 1,092.50원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을 작성하세요.
      달러를 입력하세요. ? 10 
      원화 : 10925.00원
 */

public class Problem5 {

	public static void main(String[] args) {
		System.out.print("달러를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);		
		double dollar = sc.nextDouble(); // 달러 값을 입력받음
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		final double EXCHANGE_RATE = 1092.50; // 환율은 고정값이므로 final 선언
		double won = dollar * EXCHANGE_RATE; // 원화로 변환(달러 * 환율)
		
		System.out.println("원화 : " + won + "원");			
	}
}
