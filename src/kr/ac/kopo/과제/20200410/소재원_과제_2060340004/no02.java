package exam0410;

import java.util.Scanner;

public class no02 {
	/*
	 * 1번 문제랑은 다르게 각각 값을 받고,
	 * 즉각적으로 비교하여 bignum을 갱신해가는 방법으로 풀었습니다.
	 */
	public static void main(String[] args) {
		
		int bignum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 4개를 입력합니다.");
		System.out.println("첫 번째 정수 : ");
		int one = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int two = sc.nextInt();
		
		if (two > one) {
			bignum = two;
		} else { bignum = one; }
		System.out.println(bignum);

		System.out.println("세 번째 정수 : ");
		int three = sc.nextInt();
		if (bignum < three) { bignum = three; }
		System.out.println(bignum);

		System.out.println("마지막 정수 : ");
		int four = sc.nextInt();
		sc.close();
		
		if (bignum < four) { 
			System.out.printf("%d, %d, %d, %d중 가장 큰 수 : %d", one, two, three, four, four);
		} else {
			System.out.printf("%d, %d, %d, %d 중 가장 큰 수 : %d", one, two, three, four, bignum);
		}
		
	}
}
