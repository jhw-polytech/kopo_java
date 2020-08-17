package kr.ac.kopo.day17.assignment;

import java.util.Random;

class Account {

	   private String name;
	   private int money;
	   private Random r = new Random();
	   
	   Account(){
		   r = new Random();
	   }
	   
	   Account(String name, int money){
		   this.name = name;
		   this.money = money;
		   r = new Random();
	   }
	   
	   public synchronized void deposit(String name) {
			int amount = (r.nextInt(10)+1)*1000;
			money += amount;
			System.out.println(name + "고객님이 " + amount + "원을 입금하셨습니다.");
			System.out.println("현재 잔액은 " + money + "원입니다");
	   }
	   
	   public synchronized void withdraw(String name) {
		   int amount = (r.nextInt(10)+1)*1000;
		   if(amount <= money) {
			   money -= amount;
			   System.out.println(name + "고객님이 " + amount + "원을 출금하셨습니다.");
		   }else {
				System.out.println("출금금액: " + amount + "=> 잔액이 부족하여 출금을 할 수 없습니다.");
		   }
			System.out.println("현재 잔액은 " + money + "원입니다");
	   }
}

class User extends Thread{

	  String name;
	  Account account;
	  
	  User(){}
	  
	  User(String name, Account account){
		  this.name = name;
		  this.account = account;
	  }
	  
	  @Override
	  public void run() {

		  for(int i = 0; i < 2; i++) {
			  account.withdraw(name);
			  account.deposit(name);
			}
		}
}	
	
	public class AccountThreadMain {

		public static void main(String[] args) {
			
		  Account ac = new Account("홍길동", 10000);

		  User hong = new User("홍길동", ac);
		  User mom = new User("어머니", ac);
		  User papa = new User("아버지", ac);

		  hong.start();
		  mom.start();
		  papa.start();
		  
		}
	}
	