package Homework_0410;

import java.util.Scanner;

// 2) 4개의 정수를 입력받아 가장 큰수를 구하는 코드를 작성하시오.
// 정수는 각각 입력받아도 상관없습니다.

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 4개를 입력하세요.");

		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		if (a > b && a > c && a > d) { // a가 가장 큰 경우
			System.out.println(a + ", " + b + ", " + c + ", " + d + " 중 가장 큰 수 : " + a);
		}
		if (b > a && b > c && b > d) { // b가 가장 큰 경우
			System.out.println(a + ", " + b + ", " + c + ", " + d + " 중 가장 큰 수 : " + b);
		}
		if (c > a && c > b && c > d) { // c가 가장 큰 경우
			System.out.println(a + ", " + b + ", " + c + ", " + d + " 중 가장 큰 수 : " + c);
		}
		if (d > a && d > b && d > c) { // d가 가장 큰 경우
			System.out.println(a + ", " + b + ", " + c + ", " + d + " 중 가장 큰 수 : " + d);
		}
	}
}
