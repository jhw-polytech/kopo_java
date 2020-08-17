package kr.ac.kopo.day17.homework.account;

import java.util.Random;

class Account {

	private String name;
	private int money;

	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public synchronized void withDraw(int withDrawMoney) {

		try {
			notifyAll();
			System.out.println("[ * 출금 시도 ] \n\t" + this.name + "님이 출금합니다. 출금액 : -" + withDrawMoney + "원");
			if (withDrawMoney < this.money) {

				this.money -= withDrawMoney;
				System.out.println("\t[ O 출금 성공 ] 현재 잔액은 " + this.money + "원 입니다.\n");

			} else
				System.out.println("\t[ X 출금 실패 ] 현재 잔액 : " + this.money + "원, 출금 금액 : " + withDrawMoney + "원\n");
			wait();	
		}
		catch(Exception e) {
			
		}
		
	}

	public synchronized void deposit(int depositMoney) {

		try {
			notifyAll();
			System.out.println("[ * 입금 시도 ] \n\t" + this.name + "님이 입금합니다. 입금액 : +" + depositMoney + "원");
			this.money += depositMoney;
			System.out.println("\t[ O 입금 성공 ] 현재 잔액은 " + this.money + "원 입니다.\n");
			wait();
		}
		catch(Exception e) {
			
		}
		

	}

}

class User extends Thread {

	private String name;
	private Account account;
	private Random r = new Random();

	private int ranMoney() {

		return (r.nextInt(10000) + 1000) / 1000 * 1000;
	}

	public User(String name, Account ac) {
		this.name = name;
		this.account = ac;
	}

	@Override
	public void run() {

		int n = 0;

		while (true) {

			int withDrawMoney = ranMoney();
			n++;
			if (n % 2 == 0) {

				account.setName(name);
				account.withDraw(withDrawMoney);

			} else {

				account.setName(name);
				account.deposit(withDrawMoney);

			}

		}
	}

}

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account("홍길동", 10000);
		User son = new User("홍길동", ac);
		User mom = new User("어머니", ac);
		User papa = new User("아버지", ac);

		son.start();
		mom.start();
		papa.start();

	}
}
