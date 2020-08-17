package Homework0417;

import java.util.Scanner;

 // 8. 사칙연산을 수행하는 Calculator의 메인 클래스

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.print("정수 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println();

		int result1 = cal.plus(x, y);
		System.out.println(x + "+" + y + "=" + result1);
		int result2 = cal.minus(12, 5);
		System.out.println(x + "-" + y + "=" + result2);
		int result3 = cal.multi(12, 5);
		System.out.println(x + "*" + y + "=" + result3);
		double result4 = cal.divide(12, 5);
		System.out.println(x + "/" + y + "=" + result4);

		System.out.println();

		System.out.println(x + " 소수체크 : " + cal.prime(x));
		System.out.println(y + " 소수체크 : " + cal.prime(y));
	}

}
