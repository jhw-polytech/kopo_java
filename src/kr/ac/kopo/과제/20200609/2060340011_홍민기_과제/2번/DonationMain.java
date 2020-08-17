package kr.ac.kopo.day17.homework;

import java.util.Random;

class Donation {

	Random r = new Random();
	private int totalSum =0;

	public void sum(int num) {

		int sum =0;
		for(int i=0;i<10;i++) {
			int money = (r.nextInt(10)+1)*1000;
			System.out.println(num+"번 콜센터 : "+money+"원을 받았습니다");
			sum+=money;
		}
		System.out.println(num+"번 콜센터에서의 총 모금액 : "+sum);
		totalSum+=sum;
	}
	public int totalSum() {
		return totalSum;
	}
}

class CallCenter extends Thread{

	Donation done;
	int num;

	CallCenter(Donation done, int num){
		this.done = done;
		this.num = num;
	}
	@Override
	public void run() {
		done.sum(num);
	}
}

public class DonationMain {

	public static void main(String[] args) {

		Donation done = new Donation();

		CallCenter cc = new CallCenter(done,1);
		CallCenter cc2 = new CallCenter(done,2);
		CallCenter cc3 = new CallCenter(done,3);
		CallCenter cc4 = new CallCenter(done,4);

		cc.start();
		cc2.start();
		cc3.start();
		cc4.start();

		try {
			cc.join();
			cc2.join();
			cc3.join();
			cc4.join();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("국민들이 보내주신 성금총액  : "+done.totalSum());
	}
}