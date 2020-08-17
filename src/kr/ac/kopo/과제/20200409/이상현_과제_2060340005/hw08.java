package shlee1993.day02.homework;

import java.util.Scanner;

/*
8. 거스름돈 출력 프로그램
ex)물건 값을 입력하세요 : 5480
지불한 돈의 액수를 입력하세요 : 10000
거스름 돈 : 4520 원
1000원 : 4 개
500 원 : 1 개
100 원 : 0 개
50원 : 0 개
10원 : 2개

물건 값을 입력하세요 : 5480
지불한 돈의 액수를 입력하세요 : 5000
480원이 부족합니다
*/

//'2번의 시간 구하는 문제의 시, 분, 초를 나눈 것처럼 화폐를 분류한 후' 출력
//다만, 지불한 돈보다 물건 값이 비싼 경우를 생각하여 조건문으로 제작

public class hw08 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 값을 입력하세요 : ");
		String moneyInput = sc.nextLine();
		int price = Integer.parseInt(moneyInput);

		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		moneyInput = sc.nextLine();
		int pay = Integer.parseInt(moneyInput);
		int change = pay - price;
		int thous, fHund, hund, fifty, ten;

		if (change < 0)
			System.out.println(price - pay + "원이 부족합니다.");
		else {
			thous = change / 1000;
			fHund = change % 1000 / 500;
			hund = change % 500 / 100;
			fifty = change % 100 / 50;
			ten = change % 50 / 10;

			System.out.println("거스름돈 : " + change + "원");
			System.out.println("1000원 : " + thous + "장");
			System.out.println("500원 : " + fHund + "개");
			System.out.println("100원 : " + hund + "개");
			System.out.println("50원 : " + fifty + "개");
			System.out.println("10원 : " + ten + "개");
		}
	}
}
