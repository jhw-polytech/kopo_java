package kr.ac.jinwoo.day02.homework;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("물건값을 입력하세요 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("지불한 돈의 액수를 입력하세요 : ");
		int payMoney = sc.nextInt();
		sc.nextLine();
		
		int change = payMoney - price;
		int d_1000_Count, d_500_Count, d_100_Count, d_50_Count, d_10_Count; 
		
		if(change < 0) {
			System.out.printf("%d원이 부족합니다.\n", price - payMoney);
		}
		else {
			System.out.printf("거스름돈 : %d원\n", change);
			d_1000_Count = change/1000;
			if(d_1000_Count > 0) {
				change = change - 1000 * d_1000_Count;
				System.out.printf("1000원\t : %d개\n", d_1000_Count);
			}
			d_500_Count = change/500;
			if(d_500_Count > 0) {
				change = change - 500 * d_500_Count;
				System.out.printf("500원\t : %d개\n", d_500_Count);
			}
			d_100_Count = change/100;
			if(d_100_Count > 0) {
				change = change - 100 * d_100_Count;
				System.out.printf("100원\t : %d개\n", d_100_Count);
			}
			d_50_Count = change/50;
			if(d_50_Count > 0) {
				change = change - 50 * d_50_Count;
				System.out.printf("50원\t : %d개\n", d_50_Count);
			}
			d_10_Count = change/10;
			if(d_10_Count > 0) {
				change = change - 10 * d_10_Count;
				System.out.printf("10원\t : %d개\n", d_10_Count);
			}
		}
	}
}
