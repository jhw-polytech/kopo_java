package kr.ac.kopo.day17.assignment;

import java.util.Random;

class CallCenter{
	private int donation;
	private int no;
	private Random r;
	
	CallCenter(){
		r = new Random();
		donation = 0;
	}
	
	CallCenter(int no){
		r = new Random();
		donation = 0;
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}
	
	public int getDonation() {
		return donation;
	}
	
	public synchronized void donate(){
		int money = (r.nextInt(10) + 1) * 1000;
		donation += money;
		System.out.println(no + "번 콜센터 : " + money + "원을 받았습니다.");
	}
}

class DonationThread extends Thread{
	
	private CallCenter call;
	
	public DonationThread(){
	}
	
	public DonationThread(CallCenter call){
		this.call = call;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			call.donate();
		}
		System.out.println(call.getNo() + "번 콜센터에서의 총 모금액 : " + call.getDonation() + "원");
	}
	
}
public class DonationMain {
	
	public static void main(String[] args) {
		
		CallCenter call1 = new CallCenter(1);
		CallCenter call2 = new CallCenter(2);
		CallCenter call3 = new CallCenter(3);
		CallCenter call4 = new CallCenter(4);
		
		DonationThread donat1 = new DonationThread(call1);
		DonationThread donat2 = new DonationThread(call2);
		DonationThread donat3 = new DonationThread(call3);
		DonationThread donat4 = new DonationThread(call4);
		
		donat1.start();
		donat2.start();
		donat3.start();
		donat4.start();
		try {
			donat1.join();
			donat2.join();
			donat3.join();
			donat4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int totalDonation = call1.getDonation() + call2.getDonation() 
								+call3.getDonation() + call4.getDonation();
		System.out.println("국민들이 보내주신 성금총액 : " + totalDonation + "원");	
	}
}