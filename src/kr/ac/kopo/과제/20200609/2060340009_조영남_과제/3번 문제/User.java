package kr.ac.yeongnam.day17.homeworkTest3;

import java.util.Random;

public class User extends Thread{
	
	private String name;
	private Account ac;
	Random r;
	
	User(String name, Account ac){
		this.name = name;
		this.ac = ac;
	}
	
	
	@Override
	public void run() {
		
		r = new Random();
		int count = 1;
		while(count <= 2) {
			int money = (r.nextInt(10) + 1) * 1000;
			ac.sendMoney(name, money);
			
			try {
				Thread.sleep((r.nextInt(10) + 1) * 50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			money = (r.nextInt(10) + 1) * 1000;
			ac.withrawMoney(name, money);
			count++;
		}
		

		/*
		int sendCount = 1;
		while(sendCount <= 2) {
			r = new Random();
			int sendMoney = (r.nextInt(10) + 1) * 1000;
			ac.sendMoney(name, sendMoney);
			sendCount++;
			
		}
		
		int withrawCount = 1;
		while(withrawCount <= 2) {
			r = new Random();
			int withrawMoney = (r.nextInt(10) + 1) * 1000;
			ac.withrawMoney(name, withrawMoney);
			withrawCount++;
		}
		*/

	}
	

}
