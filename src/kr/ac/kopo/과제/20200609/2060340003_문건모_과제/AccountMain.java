package Test04;

import java.util.Random;

class Account {
	private String name;
	private int money;
	
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public synchronized void deposit(String name) {
		 Random r = new Random();
		 int plus = r.nextInt(1000);
		 money += plus;
		 System.out.println(name + "님이 " + plus + "입금하였습니다");
		 System.out.println("현재 잔액은 " + money + "입니다");
		 
	}
		
	
	public synchronized void withdraw(String name) {
		Random r = new Random();
		int minus = r.nextInt(1000);
		money -= minus;
		System.out.println(name + "님이 " + minus + "출금하였습니다");
		System.out.println("현재 잔액은 " + money + "입니다");
		
	}
	
	
	
}

class User extends Thread {
	String name;
	Account account;
	
	public User(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		
		account.deposit(name);
		account.withdraw(name);
		
	}
	
	
}
	
public class AccountMain {
	
	public static void main(String[] args) {
		
		try {
			
			Account ac = new Account("홍길동", 10000);
			User hong = new User("홍길동", ac);
			User mom = new User("어머니", ac);
			User dad = new User("아버지", ac);
			
			hong.start();
			mom.start();
			dad.start();
			
			hong.join();
			mom.join();
			dad.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
