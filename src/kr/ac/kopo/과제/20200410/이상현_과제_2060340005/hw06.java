package shlee1993.day03.homework;

import java.util.Scanner;

/* 
6. 단을 입력받아 구구단을 출력하세요
ex)	2 - 9 단을 입력 : 6
	 
	*** 6단 ***
	6 * 1 = 6
	6 * 2 = 12
	...
	6 * 9 = 54
*/

public class hw06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2-9 단을 입력 : ");
		int dan = sc.nextInt();
		sc.close();

		System.out.printf("*** %d단 ***\n", dan);
		for (int i = 1; i < 10; i++)
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
	}

}
