package accountThread;

public class Account {
	
	//계좌 주인과 초기 금액 설정
	private String name;
	private int money;
	
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	//입출금에 따라 잔액 셋팅해줘야함
	public void setMoney(int money) {
		this.money = money;
	}
	
	//synchronize해서 메소드가 끝날때까지 다른 메소드가 실행되지 못하도록 함 
	public synchronized void withdraw(String myName,int myMoney) {
		
		try {
			
			if(money < myMoney) {
				System.out.println(myName + " 고객님, " + myMoney + "원 출금은 부적합합니다.");
				System.out.println("출금 금액 :  " + myMoney + " => 잔액이 부족하여 출금을 할 수 없습니다.");
				System.out.println();
			} else if(myMoney <= 0){
				System.out.println(myName + " 고객님, " + myMoney + "원 출금은 부적합합니다.");
				System.out.println("0 보다 작은 금액은 출금할 수 없습니다.");
				System.out.println();
			} else {
				System.out.println(myName + " 고객님이 " + myMoney + "원 출금하셨습니다.");
				setMoney( money - myMoney );
				System.out.println("현재 잔액 : " + money);
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public synchronized void deposit(String myName,int myMoney) {
		
		try {
			
			if(myMoney <= 0) {
				System.out.println(myName + " 고객님, " + myMoney + "원 입금은 부적합합니다.");
				System.out.println("0보다 작은 금액은 입금할 수 없습니다.");
				System.out.println();
			} else {
				System.out.println(myName + " 고객님이 " + myMoney + "원 입금하셨습니다.");
				setMoney(money + myMoney);
				System.out.println("현재 잔액 : " + money);
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
