package Homework_0410;

import java.util.Scanner;

// 6) 단을 입력 받아 구구단을 출력하세요.

public class Test06 {
	public static void main(String[] args) {
		
		System.out.print("2 - 9 단을 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	// 출력할 단을 입력한다.
		
		System.out.println("\n*** " + a + "단 ***");
		for (int i = 1; i <= 9; i++)	// for문을 돌려 곱하는 수를 1~9까지로 설정해준다.
			System.out.println(a + " * " + i + " = " + a * i);
	}
}
