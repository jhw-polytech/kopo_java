package kr.ac.kopo.day17.homework;

import java.util.Random;

class Account{
	Random r = new Random();
	private String name;
	private int money;

	Account(String name, int money){
		this.name = name;
		this.money = money;
	}
	public synchronized void deposit(String name) {

		int don = (r.nextInt(10)+1)*1000;
		
		money +=don;
		System.out.println(name+"고객님이 "+don+"원을 입금하셨습니다");		
		System.out.println("현재잔액은 "+money+"원입니다");
		
	}
	public synchronized void withdraw(String name) {
		int don = (r.nextInt(10)+1)*1000;
		
		money -=don;
		if(money<0) {
			System.out.println("출금금액 : "+don+"원 => 잔액이 부족하여 출금할 수 없습니다");
			money += don;
		}
		else {
			System.out.println(name+"고객님이 "+don+"원을 출금하셨습니다");
		}
		System.out.println("현재잔액은 "+money+"원입니다");

		
	}
}

class User extends Thread{
	String name;
	Account account;
	Random r = new Random();
	int count1 =0;
	int count2 =0;

	User(String name, Account account){
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		while(true) {
			if(count1==2 && count2==2) break;
			
			int num = r.nextInt(2);
			if(num==0 && count1<2) {
				account.deposit(name);
				count1++;
			}
			if(num==1 && count2<2) {
				account.withdraw(name);
				count2++;
			}
		}
	}
}

public class PoorGildong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account("홍길동", 10000);
		User user1 = new User("홍길동", ac);
		User user2 = new User("어머니", ac);
		User user3 = new User("아버지", ac);

		user1.start();
		user2.start();
		user3.start();
	}

}
