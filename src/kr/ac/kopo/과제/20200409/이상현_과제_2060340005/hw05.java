package shlee1993.day02.homework;

import java.util.Scanner;

/*
5. 1 달러는 현재 1,092.50 원 입니다 . 화면에서 달러를 입력 받아 원화로 보여주는 프로그램
ex)달러를 입력하세요 : 10달러
원화 : 10925.00원
*/

// 3번의 반지름 구하는 문제와 마찬가지로 음수일 경우 error를 출력하는 것에 주의하고, 소수점 둘째까지만 출력하도록 작성

public class hw05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달러(양수) : ");
		String dInput = sc.nextLine();
		double dollar = Double.parseDouble(dInput);
		double rate = 1092.5;	//환율값, 상수로 지정했으면 더 좋을 것 같습니다.

		if (dollar < 0)
			System.out.println("error!!"); // 음수일 경우 error 출력
		else
			System.out.printf("원화 : %.2f원", dollar * rate); // 달러와 환율을 곱하여 소수점 둘째자리까지 출력
	}
}
