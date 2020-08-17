package Account;

public class Account {
//	private String name;
	private int money;

	public Account(String name, int money) {
		this.money = money;
	}

	public synchronized void deposite(String name) {

		for (int i = 0; i < 2; i++) {
			int cash = (int) ((Math.random() * 9000) + 1000);
			System.out.println(name + " 고객님이 " + cash + " 원을 입금하셨습니다.");
			money += cash;
			System.out.println("현재 잔액은 " + money + "원 입니다.");
		}
	}

	public synchronized void withdraw(String name) {

		for (int i = 0; i < 2; i++) {
			int cash = (int) ((Math.random() * 9000) + 1000);
			if (cash > money) {

				System.out.println("출금 금액이 부족합니다.");
			} else {
				System.out.println(name + " 고객님이 " + cash + " 원을 출금하셨습니다.");
				money -= cash;
				System.out.println("현재 잔액은 " + money + "원 입니다.");
			}
		}
	}
}