package hw.hw16;
import hw.hw16.Account;

public class User extends Thread {

	String name;
	Account account;

	public User(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			account.add(name);
			account.sub(name);
		}
	}
	

}
