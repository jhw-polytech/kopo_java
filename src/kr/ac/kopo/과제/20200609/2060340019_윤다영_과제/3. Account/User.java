package kr.ac.kopo.assignment.day17;

public class User extends Thread {
	
	private String name;
	private Account account;
	
	public User(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	
	@Override
	public void run() {
		account.deposit(name);
		account.withdraw(name);
	}
	
	
	

}
