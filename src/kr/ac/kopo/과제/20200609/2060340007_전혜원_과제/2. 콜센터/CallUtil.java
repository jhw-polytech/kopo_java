package kr.ac.kopo.day17.homework;

import java.util.Random;

public class CallUtil extends Thread {

	private Random random;
	private int amount; // 각 전화별로 모금액 액수를 결정해 반환할 변수
	private int callDon; // 각 콜센터 객체별 모금액을 담을 변수
	private int callCount; // 콜센터 별로 10회까지만 전화를 받을 수 있도록 세는 변수

	public CallUtil() {
		random = new Random();
		callDon = 0;
		callCount = 0;
	}

	// 입금할 액수를 반환하는 메소드
	public int amount() {
		amount = (random.nextInt(10) + 1) * 1000;
		return amount;
	}

	// 전화
	public synchronized void callForDonation(String ccName) {
		int money = amount();

		try {
			notify();
			callCount++;

			if (callCount < 10) {
				System.out.println(ccName + " : " + money + "원을 받았습니다.");
				CallCenter.setDonation(CallCenter.getDonation() + money);
				callDon += money;

				/*
				 * << 교수님께 질문 >> 아래 wait() 메소드가 없을 때는 순서제어를 제외하고 모두 정상적으로 실행되는데, wait() 메소드 적용
				 * 시에 try문 시작과 끝에 notify() notifyAll() 메소드를 호출함에도 불구하고 쓰레드가 깨어나지 않습니다. 해결하는 방법을
				 * 몰라 일단 업로드 합니다 ㅠㅠ
				 */

//              wait();
				notifyAll();

			} else if (callCount == 10) {
				System.out.println(ccName + "에서의 총 모금액 : " + callDon + "원");
				callCount++;
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
