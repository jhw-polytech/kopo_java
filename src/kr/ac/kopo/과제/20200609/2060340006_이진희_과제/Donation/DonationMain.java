package gneegnee;

import java.util.Random;

class CallCenter{
	private Random r;
	private int donation;
	private int sqc;
	
	
	CallCenter(int sqc){
		r = new Random();
		donation = 0;
		this.sqc = sqc;
	}
	
	public int getSqc() {
		return sqc;
	}
	
	public int getDonation() {
		return donation;
	}
	
	public synchronized void donate(){
		int money = (r.nextInt(10) + 1) * 1000;
		donation += money;
		System.out.println(sqc + "번 콜센터 : " + money + "원을 받았습니다.");
	}
}



class DonationThread extends Thread{
	
	private CallCenter call;
	
	public DonationThread(CallCenter call){
		this.call = call;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			call.donate();
		}
		System.out.println(call.getSqc() + "번 콜센터에서의 총 모금액 : " + call.getDonation() + "원");
	}
	
}


public class DonationMain {
	
	public static void main(String[] args) {
		
		CallCenter c1 = new CallCenter(1);
		CallCenter c2 = new CallCenter(2);
		CallCenter c3 = new CallCenter(3);
		CallCenter c4 = new CallCenter(4);
		
		DonationThread donate1 = new DonationThread(c1);
		DonationThread donate2 = new DonationThread(c2);
		DonationThread donate3 = new DonationThread(c3);
		DonationThread donate4 = new DonationThread(c4);
		
		donate1.start();
		donate2.start();
		donate3.start();
		donate4.start();
		try {
			donate1.join();
			donate2.join();
			donate3.join();
			donate4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int totalDonation = c1.getDonation() + c2.getDonation() 
								+c3.getDonation() + c4.getDonation();
		System.out.println("국민들이 보내주신 총 모금액 : " + totalDonation + "원");	
	}
}
