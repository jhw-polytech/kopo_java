package homework0609_2;

import java.util.Random;

class Account{
	private String name;
	private int balance;
	
	public Account(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.balance = i;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
class User{
	String name;
	Account account;
	public User(String string, Account ac) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.account = ac;
	}
	public void serviceB() {
		synchronized(this) {
		Random r = new Random();
			int cash = (r.nextInt(9)+1)*1000;
			int balance = account.getBalance();
			if(balance<cash) {
				System.out.println("출금 요청("+cash+")보다 잔액이 부족합니다. 출금을 중지합니다.");
			}else {
				System.out.println(name+"고객님께서  "+cash+"원을 출금하셨습니다.");
				int i = balance-cash;
				account.setBalance(i);
				System.out.println("현재 잔액은 " + (account.getBalance()) + "원 입니다.");
			}
		}
	}
	
	public void serviceA() {
		synchronized(this) {
		Random r = new Random();
			int cash = (r.nextInt(9)+1)*1000;
			System.out.println(name+"고객님께서  "+cash+"원을 입금하셨습니다.");
			int balance = account.getBalance();
			account.setBalance(balance+cash);
			System.out.println("현재 잔액은 " + account.getBalance() + "원 입니다.");
		}
	}
}

public class SyncBanking {
	public static void main(String[] args) {
		Account ac = new Account("홍길동", 10000);
		MyThread my = new MyThread(new User("홍길동", ac));
		MomThread mom = new MomThread(new User("어머니", ac));
		DadThread dad = new DadThread(new User("아버지", ac));
		
		
		try {
			runing : while(true) {
				Random r = new Random();
				int check = r.nextInt(3);
				int checkA = 0;
				int checkB = 0;
				int checkC = 0;
				if(check==0 && checkA!=2) {
					my.start();
					my.join();
					checkA++;
				}
				if(check==1 && checkB!=2) {
					mom.start();
					mom.join();
					checkB++;
				}
				if(check==2 && checkC!=2) {
					dad.start();
					dad.join();
					checkC++;
				}
				if(checkA==2&&checkB==2&&checkC==2) {
					break runing;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class MyThread extends Thread{
	User user=null;
	public MyThread(User user) {
		this.user = user;
	}
	@Override
	public void run() {
		user.serviceA();
		user.serviceB();
	}	
}
class MomThread extends Thread{
	User user=null;
	public MomThread(User user) {
		this.user = user;
	}
	@Override
	public void run() {
		user.serviceA();
		user.serviceB();
	}
}
class DadThread extends Thread{
	User user=null;
	public DadThread(User user) {
		this.user = user;
	}
	@Override
	public void run() {
		
		user.serviceA();
		user.serviceB();
	}	
}