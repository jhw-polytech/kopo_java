package kr.ac.kopo.assignment.first;

import java.util.Scanner;

public class No8 {
	/*
	 9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과 
	 1000원, 500원, 100원, 50원, 10원의 개수를 구하는 프로그램을 작성하시오.
	 이때 물건값과 거스름돈은 키보드로 입력할 수 있어야 한다. 
	 액수가 정해져 있는 것은 아님.
	 모든 경우가 되도록 작성할 것.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		int inputMoney = sc.nextInt();
		sc.nextLine();
		
		int change = inputMoney - price;
		if(change >= 0) {
			System.out.println("거스름돈 : " + change + "원");
			
			//거스름돈 0원일 때는 동전 개수 따로 명시하지 않음
			if(change > 0) {
				int a = change / 1000;
				int b = (change % 1000) / 500;
				int c = (change % 1000 % 500 ) / 100;
				int d = (change % 1000 % 500 % 100) / 50;
				int e = (change % 1000 % 500 % 100 % 50) / 10;
				
				System.out.printf("%4d원 : %d개\n", 1000, a);
				System.out.printf("%4d원 : %d개\n", 500, b);
				System.out.printf("%4d원 : %d개\n", 100, c);
				System.out.printf("%4d원 : %d개\n", 50, d);
				System.out.printf("%4d원 : %d개\n", 10, e);
			}
			
		}
		else {
			change = -change;
			System.out.println(change + "원이 부족합니다.");
		}
			
		
	}

}
