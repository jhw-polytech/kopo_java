package day0609.homework.banking;

import java.util.Random;

public class User extends Thread {
	String name;
	Account account;
	Random rand = new Random();

	public User(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		int cnt = 0;
		
		while (cnt++ < 4) {	//입출금 두번씩 총 4번
			int dp = 0;
			int wd = 0;

			int num = rand.nextInt(2) + 1;
			if (num == 1 && dp < 2) {	//랜덤값이 1일 경우 입금
				account.deposit(name);
				dp++;
			}
			if (num == 2 && wd < 2) {	//랜덤값이 2일 경우 출금
				account.withdraw(name);
				wd++;
			}
			
		}

	}
}
