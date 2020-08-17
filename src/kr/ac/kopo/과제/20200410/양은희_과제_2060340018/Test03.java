package Homework_0410;

import java.util.Scanner;

// 3) 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1-100사이의 정수를 입력 : ");
		int a = sc.nextInt();
		System.out.println("<1 ~ " + a + " 정수 출력>");

		for (int i = 1; i <= a; i++) { // for문을 돌려 1부터 입력한 숫자까지 출력한다.
			System.out.print(" " + i);
		}
	}
}