package Homework_0410;

import java.util.Scanner;

// 4) 다음의 결과를 보이는 프로그램 작성하시오.

public class Test04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int a = sc.nextInt();

		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int b = sc.nextInt();

		System.out.println("\n <1 ~ 40 사이의  " + b + "의 배수를 제외한 정수 출력>");

		for (int i = 1; i <= a; i++) {
			if (!(i % b == 0)) { // 2-에서 입력한 수의 배수가 아닐 경우에만
				System.out.print(i + " "); // 출력한다.
			}
		}

		System.out.println("\n\n <1 ~ 40 사이의  " + b + "의 배수를 제외한 정수 5개씩 출력>");
		int x = 0; // 변수를 설정하여 정해진 갯수만큼 출력되도록 한다.

		for (int i = 1; i <= a; i++) {
			if (!(i % b == 0)) {
				System.out.print(i + " ");
				x++; // 변수 x가 하나씩 늘어나도록 한다.
				if (x % 5 == 0) { // 5개가 다 차면 (5의 배수가 되면)
					System.out.println(); // 다음줄로 넘어간다.
				}
			}
		}
	}
}