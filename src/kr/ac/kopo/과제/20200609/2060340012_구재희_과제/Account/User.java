package accountThread;

import java.util.Random;

public class User extends Thread{

	String name;
	Account account;
	
	Random r = new Random();
	
	public User(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	@Override
	public void run() {
		
		//입출금 10번시행
		for(int i =1; i <= 10; i++) {
			
			//입출금 금액 랜덤으로 설정
			int myMoney = r.nextInt(10) * 1000;
			
			
			// 입출금 순서를 랜덤하게 설정
			int num = r.nextInt(2);
			
			if(num == 0) {
				account.deposit(name, myMoney);				
			} else {
				account.withdraw(name, myMoney);				
			}
			
		}
		
	}	
}
