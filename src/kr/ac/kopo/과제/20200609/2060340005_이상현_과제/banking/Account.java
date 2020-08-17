package day0609.homework.banking;

import java.util.Random;

public class Account {
	Random rand = new Random();
	private int balance = 10000;	//랜덤으로 받을 수 있는 최대 금액이 만원이므로 초기 만원을 넣어줌

	public synchronized void deposit(String name) {

		int money = (rand.nextInt(10) + 1) * 1000;
		balance += money;
		
		System.out.println(name + "(이)가  " + money + "원을 입금하셨습니다");
		System.out.println("잔액 : " + balance + "원");

	}

	public synchronized void withdraw(String name) {
		int money = (rand.nextInt(10) + 1) * 1000;

		balance -= money;
		if (balance < 0) {
			System.out.println("잔액이 부족합니다...");
			balance += money;
		} else {
			System.out.println(name + "(이)가 " + money + "원을 출금하셨습니다");
		}
		System.out.println("잔액 : " + balance + "원");
	}
}