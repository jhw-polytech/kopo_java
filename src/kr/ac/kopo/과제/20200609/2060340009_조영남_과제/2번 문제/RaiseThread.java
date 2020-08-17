package kr.ac.yeongnam.day17.homeworkTest;

import java.util.Random;

public class RaiseThread extends Thread{
	
	private int callNo = 0;
	private int partMoney = 0;
//	private static int wholeMoney = 0;
	static int wholeMoney = 0;
	
	RaiseThread(int callNo){
		this.callNo = callNo;
	}
	

	@Override
	public void run() {
		
		Random r = new Random();
		
		int count = 1;
		while(count <= 10) {
			int money = (r.nextInt(10)+1) * 1000;
			System.out.println(callNo + "번 콜센터 : " + money);
			
			partMoney = partMoney + money;
			if(count == 10) {
				wholeMoney = wholeMoney + partMoney;
				System.out.println(callNo + "번 콜센터에서의 총 모금액 : " + partMoney);
			}
			count++;
		}
		
		
		
	}

}
