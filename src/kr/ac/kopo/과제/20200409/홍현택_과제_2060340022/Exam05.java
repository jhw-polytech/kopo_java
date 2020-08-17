package kr.co.hana.homework01;

import java.util.Scanner;

public class Exam05 {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("달러를 입력하세요 : ");
		float dollar = sc.nextFloat();
		
		float won = (float)1092.50;
		float result = won*dollar;
		
		/*
			소수점 자리수 조정은요
			%.자리수f 이렇게 쓰시면 되요. 소수점 둘째자리까지만 표현하고 싶다면 %.2f 입니다
		*/

		System.out.printf("%2f%s", result, " 원");    //소수점 자리수 조정, float/double 써야할지?
//		System.out.println(won*dollar + "원");
		sc.close();
	}
}
