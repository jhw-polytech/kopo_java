package kr.ac.kopo.day17.homework;

public class HongAccount {
	
	private String who;
	private static int balance;	
	
	public HongAccount(String who, int balance) {
		this.who = who;
		HongAccount.balance = balance;
	}

	/**
	 * @return the who
	 */
	public String getWho() {
		return who;
	}

	/**
	 * @param who the who to set
	 */
	public void setWho(String who) {
		this.who = who;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
