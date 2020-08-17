package kr.ac.kopo.assignment.day17;


public class Account {
	
	private String name;
	private int money;
	
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void withdraw(String user) {
		
		for(int i = 0; i < 2; i++) {
			synchronized(this) {
				int withdraw = (int)(Math.random()*9000 + 1000);
				if(withdraw > money) {
					System.out.println("출금금액 : " + withdraw + "원 => 잔액이 부족하여 출금할 수 없습니다.");
					System.out.println("현재잔액은 : " + money + "입니다.");
				}else {
					System.out.println(user + "고객님이 " + withdraw + "원을 출금하셨습니다.");
					money -= withdraw;
					System.out.println("현재잔액은 : " + money + "입니다.");
				}
			}
			
			
		}
		
		
	}
	
	public void deposit(String user) {
		
		for(int i = 0; i < 2; i++) {
			synchronized(this) {
				int deposit = (int)(Math.random()*9000 + 1000);
				System.out.println(user + "고객님이 " + deposit + "원을 입금하셨습니다.");
				money += deposit;
				System.out.println("현재잔액은 : " + money + "입니다.");
			}
			
			
		}		
		
		
	}
	
	
	

}
