package Homework_0410;

import java.util.Scanner;

// 8) 시작단과 종료단을 입력받아 구구단을 출력하시오.

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작단을 입력 : ");
		int a = sc.nextInt();

		System.out.print("종료단을 입력 : ");
		int b = sc.nextInt();

		if (a <= b) { // 시작단이 종료단보다 작을 경우
			for (int i = a; i <= b; i++) { // 시작단부터 종료단까지
				System.out.println("\n*** " + i + "단 ***");
				for (int j = 1; j <= 9; j++) // 구구단 출력
					System.out.println(i + " * " + j + " = " + i * j);
			}
		} else { // 시작단이 종료단보다 클 경우
			for (int i = b; i <= a; i++) { // 시작단부터 종료단까지
				System.out.println("\n*** " + i + "단 ***");
				for (int j = 1; j <= 9; j++) // 구구단 출력
					System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}