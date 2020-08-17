package CallCenter;

public class CallCenter extends Thread {

	private int donation;
	private int money;

	public int getDonation() {
		return donation;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			money = (int) ((Math.random() * 10000) + 1);

			System.out.println("1번 콜센터 : " + money + "원을 받았습니다.");
			donation = donation + money;
		}
		System.out.println("1번 콜센터에서의 총 모금액 : " + donation);
	}
}

class CallCenter2 extends Thread {

	private int donation;
	private int money;

	public int getDonation() {
		return donation;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			money = (int) ((Math.random() * 10000) + 1);

			System.out.println("2번 콜센터 : " + money + "원을 받았습니다.");
			donation = donation + money;
		}
		System.out.println("2번 콜센터에서의 총 모금액 : " + donation);
	}
}

class CallCenter3 extends Thread {

	private int donation;
	private int money;

	public int getDonation() {
		return donation;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			money = (int) ((Math.random() * 10000) + 1);

			System.out.println("3번 콜센터 : " + money + "원을 받았습니다.");
			donation = donation + money;
		}
		System.out.println("3번 콜센터에서의 총 모금액 : " + donation);
	}
}

class CallCenter4 extends Thread {

	private int donation;
	private int money;

	public int getDonation() {
		return donation;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			money = (int) ((Math.random() * 10000) + 1);

			System.out.println("4번 콜센터 : " + money + "원을 받았습니다.");
			donation = donation + money;
		}
		System.out.println("4번 콜센터에서의 총 모금액 : " + donation);
	}
}
