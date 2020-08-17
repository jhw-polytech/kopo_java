package shlee1993.day10.homework;

import java.util.Scanner;

/*
 * 문제1 . 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 SumTest 클래스의 main 메쏘드를 완성하십시오 .
a. 입력받은 숫자가 홀수인 경우에는 , 0 부터 입력 값까지 훌수의 합을 출력합니다
- 예제 : 입력 이 7 이면 16 을 출력 ( 1 + 3 + 5 + 7 = 16 )
b. 입력받은 숫자가 짝수인 경우에는 , 0 부터 입력 값까지 짝수의 합을 출력합니다
- 예제 : 입력 이 10 이면 30 을 출력 ( 2 + 4 + 6 + 8 + 10 30 )
 */

public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		int sum = 0;

		if (num % 2 == 0) {
			for (int i = 0; i <= num; i += 2)
				sum += i;
		} else {
			for (int i = 1; i < num; i += 2)
				sum += i;
		}

		System.out.println("결과 값 : " + sum);
	}
}
