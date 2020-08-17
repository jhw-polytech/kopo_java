package Exam_0609;
/*
1-4번까지의 콜센터는 각각 10통의 전화를 받을 수 있습니다.
성금은 1000-10000원사이로 1000원단위로 랜덤하게 추출된다고 가정.
각 콜센터에서는 10통의 전화를 받은 후 각 콜센터의 총성금을 출력하고 4개의 콜센터 총액을 출력


전화번호 1 - 4번까지 1000원 ~ 10000원사이로 금액을 보내주시길 바랍니다.
1번 콜센터 : 8000원을 받았습니다.
3번 콜센터 : 2000원을 받았습니다.
4번 콜센터 : 9000원을 받았습니다.
2번 콜센터 : 1000원을 받았습니다.
4번 콜센터 : 1000원을 받았습니다.
2번 콜센터 : 10000원을 받았습니다.
3번 콜센터 : 9000원을 받았습니다.
 */

import java.util.Random;

class Callcenter {
	static int total = 0;

}

class Callcenter01 implements Runnable {
	int money = 0;
	int sum = 0;
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			money = (r.nextInt(10) + 1) * 1000;
			sum = sum + money;

			System.out.println("1번 콜센터 : " + money + "원을 받았습니다.");
		}
		System.out.println("1번 콜센터에서의 총 모금액 : " + sum + "원");
	}
}

class Callcenter02 implements Runnable {
	int money = 0;
	int sum = 0;
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			money = (r.nextInt(10) + 1) * 1000;
			sum = sum + money;
			System.out.println("2번 콜센터 : " + money + "원을 받았습니다.");
		}
		System.out.println("2번 콜센터에서의 총 모금액 : " + sum + "원");
	}
}

class Callcenter03 implements Runnable {
	int money = 0;
	int sum = 0;
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}	
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			money = (r.nextInt(10) + 1) * 1000;
			sum = sum + money;
			System.out.println("3번 콜센터 : " + money + "원을 받았습니다.");
		}
		System.out.println("3번 콜센터에서의 총 모금액 : " + sum + "원");
	}
}

class Callcenter04 implements Runnable {
	int money = 0;
	int sum = 0;
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			money = (r.nextInt(10) + 1) * 1000;
			sum = sum + money;
			System.out.println("4번 콜센터 : " + money + "원을 받았습니다.");
		}
		System.out.println("4번 콜센터에서의 총 모금액 : " + sum + "원");
	}
}

public class CallCenterThreadMain {

	public static void main(String[] args) {
		Callcenter01 call01 = new Callcenter01();
		Callcenter02 call02 = new Callcenter02();
		Callcenter03 call03 = new Callcenter03();
		Callcenter04 call04 = new Callcenter04();
		Thread t1 = new Thread(call01);
		Thread t2 = new Thread(call02);
		Thread t3 = new Thread(call03);
		Thread t4 = new Thread(call04);
		

		try {
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t1.join();
			t2.join();
			t3.join();
			t4.join();

			int total = call01.getSum() + call02.getSum() + call03.getSum() + call04.getSum();
			System.out.println("\n국민들이 보내주신 총 성금 :" + total + "원");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
