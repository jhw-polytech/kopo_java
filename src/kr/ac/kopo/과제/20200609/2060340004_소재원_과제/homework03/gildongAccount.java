package kr.ac.kopo.day19.homework03;

import java.util.Random;

class Account {
	
	private String name;
	private int money;
	public Account Account;
	private static int flag = 0;

	Account() {};
	
	Account(String name, int money) {
		this.name = name;
		this.money = money;

	}

	public synchronized void depositMoney(String name, int money) {
		
		notifyAll();
		this.money = this.money + money;
		System.out.println(name + "님이 " + money + "원을 입금하였습니다.");
		System.out.println("현재 잔액 : " + this.money);
		try {
			wait();
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void withdrawMoney(String name, int money) {
		
		notifyAll();
		if (this.money > money) {
			this.money = this.money - money;
			System.out.println(name + "님이 " + money + "원을 출금하였습니다.");
			System.out.println("현재 잔액 : " + this.money);
		} else {
			System.out.println(name + "님. 잔액이 부족하여 출금할 수 없습니다.");
		}
		try {
			wait();
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class User extends Thread {
	
	private String name;
	private Account account;
	private Random r = new Random();
	private int money;
	private static int flag = 0;
	
	User(String name, Account account) {
		this.account = account;
		this.name = name;
	}

	@Override
	public void run() {
	
		for (int i = 0; i < 2; i++) {
			money = ((r.nextInt(6000) + 1000) / 1000 * 1000);
			account.depositMoney(this.name, money);
			money = (r.nextInt(7000) + 1000) / 1000 * 1000;
			account.withdrawMoney(this.name, money);
			
		}
	}
}

public class gildongAccount {
	
	public static void main(String[] args) {
		
		Account ac = new Account("홍길동", 10000);
		User gildong = new User("홍길동", ac);
		User mother = new User("어머니", ac);
		User father = new User("아버지", ac);
 
		Thread th = new Thread(gildong);
		Thread th2 = new Thread(mother);
		Thread th3 = new Thread(father);
		
		th.start();
		th2.start();
		th3.start();
		try {
			th.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
