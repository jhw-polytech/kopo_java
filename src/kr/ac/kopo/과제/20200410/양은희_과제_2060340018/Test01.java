package Homework_0410;

import java.util.Scanner;

// 1) 정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오.

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 3개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) { // a가 가장 큰 경우
			if (b > c) { // a>b>c 의 경우
				System.out.print(a + " " + b + " " + c);
			} else { // a>c>b 의 경우
				System.out.print(a + " " + c + " " + b);
			}
		}
		if (b > a && b > c) { // b가 가장 큰 경우
			if (a > c) { // b>a>c 의 경우
				System.out.print(b + " " + a + " " + c);
			} else { // b>c>a 의 경우
				System.out.print(b + " " + c + " " + a);
			}
		}
		if (c > b && c > a) { // c가 가장 큰 경우
			if (b > a) { // c>b>a 의 경우
				System.out.print(c + " " + b + " " + a);
			} else { // c>a>b 의 경우
				System.out.print(c + " " + a + " " + b);
			}
		}
	}
}
