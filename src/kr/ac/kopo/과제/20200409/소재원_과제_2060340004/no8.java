package exam0409;

import java.util.Scanner;

public class no8 {
	/*
	 * 앞서 나왔던 문제들처럼 몫과 나머지를 활용하였다.
	 * 부족한 금액은 Math.abs()를 활용하여 절대값으로 바꾸었다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("물건 값을 입력하세요.");
		int price = sc.nextInt();
		System.out.println("지불할 돈을 입력하세요.");
		int pay = sc.nextInt();
		sc.close();
		
		int change = pay - price;
		
		if (change > 0) {
			System.out.printf("거스름 돈  : %d원\n", change);
			System.out.printf("1000원 : %d개\n", change / 1000);
			System.out.printf("500원 : %d개\n", change % 1000 / 500);
			System.out.printf("100원 : %d개\n", change % 1000 % 500 / 100);
			System.out.printf("50원 : %d개\n", change % 1000 % 500 % 100 / 50);
			System.out.printf("10원 : %d개\n", change % 1000 % 500 % 100 % 50 / 10);
			System.out.printf("1원 : %d개\n", change % 1000 % 500 % 100 % 50 % 10);
		} else {
			System.out.printf("%d원이 부족합니다.", Math.abs(change));
		}
	}
}
