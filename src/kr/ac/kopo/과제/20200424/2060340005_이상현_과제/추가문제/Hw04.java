package shlee1993.day10.homework;

import java.util.Scanner;

/*
 * 문제4 . 사용자로부터 점수들을 입력 받아서 총 입력 받은 점수의 개수와 평균을 구하십시오 . -1입력시 종료
 */

public class Hw04 {
	public static void main(String[] args) {
		int num;
		int cnt = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			num = Integer.parseInt(sc.nextLine());
			if (num == -1)
				break;
			sum += num;
			cnt++;
		}

		sc.close();
		System.out.println("점수들의 평균(double) : " + (double) sum / cnt);
		System.out.println("점수들의 평균(int) : " + sum / cnt);
	}
}
