package hw.hw16;

import java.util.Random;

public class Account {
	
	private Random r = new Random();
	private String name;
	private int money;
	private int cash;

	public Account(String name, int money) {
		this.name = name;
		this.setMoney(money);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void add(String namee) {
		cash = 1000 * (r.nextInt(10) + 1);
		System.out.println(namee + " : "+ name +" 계좌에 " + cash + "원 입금");
		money += cash;
		System.out.println("잔액 : " + money + "원");
	}
	
	public synchronized void sub(String namee) {
		cash = 1000 * (r.nextInt(10) + 1);
		if (money - cash < 0) {
			System.out.println("잔액이 부족하여 출금할 수 없습니다");
		} else {
			System.out.println(namee + " :  "+ name +" 계좌에 " + cash + "원 출금");
			money -= cash;
		}
		System.out.println("잔액 : " + cash + "원");

	}

}
