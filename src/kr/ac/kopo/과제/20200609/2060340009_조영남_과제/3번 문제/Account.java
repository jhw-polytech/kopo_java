package kr.ac.yeongnam.day17.homeworkTest3;

public class Account {

	private String name;
	private int money;
	
	Account(String name, int money){
		
		this.name = name;
		this.money = money;
		
	}
	
	public synchronized void sendMoney(String name, int sendMoney) {
		this.money += sendMoney;
		// this.name = name;
		System.out.println(name + "고객님이 " + sendMoney + "원을 입금하셨습니다.");
		System.out.println("현재 잔액은 " + this.money + "원입니다.");
	}
	
	public synchronized void withrawMoney(String name, int withrawMoney) {
		if(this.money - withrawMoney < 0) {
			System.out.println(name + "고객님, 출금금액 : " + withrawMoney + "원 => 잔액이 부족하여 출금을 할 수 없습니다.");
			System.out.println("현재 잔액은 " +  this.money + "원입니다.");
			
		} else {
			this.money -= withrawMoney;
			System.out.println(name + "고객님이 " + withrawMoney + "원을 출금하셨습니다.");
			System.out.println("현재 잔액은 " + this.money + "원입니다.");
			
		}
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
