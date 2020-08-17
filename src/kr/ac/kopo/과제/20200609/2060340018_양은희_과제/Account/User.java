package Account;

public class User extends Thread {
		
	String name;
	Account account;
	
	public User(String name, Account ac) {
		this.name = name;
		this.account = ac;		
	}

	@Override
	public void run() {
		account.deposite(name);
		account.withdraw(name);
	}
}