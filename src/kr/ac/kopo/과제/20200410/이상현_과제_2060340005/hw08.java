package shlee1993.day03.homework;

import java.util.Scanner;

/*
8. 시작단과 종료단을 입력받아 구구단을 출력하시오.
ex)	시작단을 입력 : 5
	종료단을 입력 : 8

	*** 5단 ***
	5 * 1 = 5
	...
	8 * 9 = 72

	이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다
*/

//입력받은 두 수중 작은 수를 start, 큰 수를 fininsh에 대입한다,
//그 후, 7번 문제와 같이 start단부터 finish단까지 출력한다.

public class hw08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작단을 입력 : ");
		int start = sc.nextInt();

		System.out.println("종료단을 입력 : ");
		int finish = sc.nextInt();
		sc.close();

		int temp;
		if (start > finish) {
			temp = start;
			start = finish;
			finish = temp;
		}

		for (; start <= finish; start++) {
			System.out.printf("*** %d단 ***\n", start);
			for (int i = 1; i < 10; i++)
				System.out.printf("%d * %d = %d\n", start, i, start * i);
			System.out.println();
		}
	}
}
