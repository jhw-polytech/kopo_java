package Exam_0609;

import java.util.Random;

class Account {
	Random r = new Random();
	private String name;
	private int money;
	private int balance;

	Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public synchronized void deposit(String name) {
		money = (r.nextInt(10) + 1) * 1000;
		balance += money;
		System.out.println(name + "님이 " + money + "원을 입금했습니다.");
		System.out.println("현재 잔액은  " + balance + "원 입니다.");

	}

	public synchronized void widthrow(String name) {
		money = (r.nextInt(10) + 1) * 1000;

		if (balance - money < 0) {
			System.out.println("출금금액 : " + money + "원 => 잔액이 부족하여 출금을 할 수 없습니다.");
		} else {
			balance -= money;
			System.out.println(name + "님이 " + money + "원을 출금했습니다.");
		}
		System.out.println("현재 잔액은  " + balance + "원 입니다.");
	}
}

class User extends Thread {
	String name = null;
	private Account account;

	User(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(name);
		account.widthrow(name);

	}

}

public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account("홍길동", 10000);
		User u1 = new User("홍길동", ac);
		User u2 = new User("아버지", ac);
		User u3 = new User("어머니", ac);
		
		u1.start();
		u2.start();
		u3.start();
	}
}