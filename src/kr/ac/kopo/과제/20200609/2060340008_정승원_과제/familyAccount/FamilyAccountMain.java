package kr.ac.kopo.day18.project.familyAccount;

import java.util.Random;


class Account {
	
	Random r = new Random();
	private String name;
	private int money;
	
	public Account(String name, int money) {
		this.name = name;
		this.setMoney(money);
	}

	public synchronized int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) {
		this.money = money;
	}
	
	
	
}

class User extends Thread {
	
	Random r = new Random();
	String name;
	Account account;
	
	public User(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	
	@Override
	public synchronized void run() {
		String[] transactions = {"-", "+","-", "+"};
		
		for (String transaction: transactions) {
			int money = (r.nextInt(10) + 1)*1000;
			if (transaction.equals("-")) {
				
				if ((account.getMoney() -  money) <= 0) {
					System.out.println("출금금액 : "+ money+"원 => 잔액이 부족하여 출금을 할 수 없습니다.");
					continue;
				}
				account.setMoney((account.getMoney() - money));
				System.out.println(name+"고객님이"+ money+"원을 출금하셨습니다.");
			}
			if (transaction.equals("+")) {
				
				account.setMoney((account.getMoney() + money));

				System.out.println(name+"고객님이"+ money+"원을 입금하셨습니다.");
				
			}
			System.out.println("현재 잔액은"+ account.getMoney()+"원입니다.");

		}
		
	}
	
}


public class FamilyAccountMain {
	
	public static void main(String[] args) {
		Account ac = new Account("홍길동", 10000);
		User son = new User("홍길동", ac);
		User mom = new User("어머니", ac);
		User dad = new User("아버지", ac);
		
		try {
			son.start();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			mom.start();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			dad.start();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
