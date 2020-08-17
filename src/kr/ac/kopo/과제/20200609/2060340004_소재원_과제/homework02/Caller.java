package kr.ac.kopo.day19.homework02;

import java.util.Random;

public class Caller {

	static int totalMoney = 0;
	private Random r = new Random();
	private int sumMoneyByChannel1 = 0;
	private int sumMoneyByChannel2 = 0;
	private int sumMoneyByChannel3 = 0;
	private int sumMoneyByChannel4 = 0;
	private int giveMoney;

	int flag = 0;

	public synchronized void giving1() {

		for (int i = 0; i < 10; i++) {

			try {
				notifyAll();
				showMoney(1);

				if (i == 9) {
					System.out.println("1번 콜센터에서의 총 모금액 : " + sumMoneyByChannel1);
					flag++;
				}

				if (flag <= 3)
					wait();

			} catch (Exception e) {

			}
		}
	}

	public synchronized void giving2() {

		for (int i = 0; i < 10; i++) {

			try {
				notifyAll();
				showMoney(2);
				if (i == 9) {
					System.out.println("2번 콜센터에서의 총 모금액 : " + sumMoneyByChannel2);
					flag++;
				}
				if (flag <= 3)
					wait();

			} catch (Exception e) {

			}
		}
	}

	public synchronized void giving3() {

		for (int i = 0; i < 10; i++) {

			try {
				notifyAll();
				showMoney(3);
				if (i == 9) {
					System.out.println("3번 콜센터에서의 총 모금액 : " + sumMoneyByChannel3);
					flag++;
				}
				if (flag <= 3)
					wait();

			} catch (Exception e) {

			}
		}
	}

	public synchronized void giving4() {

		for (int i = 0; i < 10; i++) {

			try {
				notifyAll();
				showMoney(4);
				if (i == 9) {
					System.out.println("4번 콜센터에서의 총 모금액 : " + sumMoneyByChannel4);
					flag++;
				}
				if (flag <= 3)
					wait();

			} catch (Exception e) {

			}
		}
	}

	private void showMoney(int callCenterNo) {

		giveMoney = (r.nextInt(9000) + 1000) / 1000 * 1000;
		totalMoney += giveMoney;
		System.out.println("[" + callCenterNo + "번 콜센터] : " + giveMoney + "원 받았습니다.");
		if (callCenterNo == 1)
			sumMoneyByChannel1 += giveMoney;
		else if (callCenterNo == 2)
			sumMoneyByChannel2 += giveMoney;
		else if (callCenterNo == 3)
			sumMoneyByChannel3 += giveMoney;
		else if (callCenterNo == 4)
			sumMoneyByChannel4 += giveMoney;
	}
}
