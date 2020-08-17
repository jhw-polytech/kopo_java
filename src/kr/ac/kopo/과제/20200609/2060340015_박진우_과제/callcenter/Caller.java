package kr.ac.kopo.day17.homework.callcenter;

import java.util.Random;

public class Caller {

	public static int totalMoney = 0;

	private int raiseMoney1 = 0;
	private int raiseMoney2 = 0;
	private int raiseMoney3 = 0;
	private int raiseMoney4 = 0;
	private Random r = null;
	
	public Caller() {
		r = new Random();
	}

	private int ranMoney() {
		return (r.nextInt(9000) + 1000) / 1000 * 1000;
	}

	public void call(int centerNo, int cnt) {
		
		int raiseMoney = ranMoney();
		System.out.println(centerNo + "번 콜센터 : " + cnt + "번째 모금 "+ Util.convertMoneySign(raiseMoney) + "원을 받았습니다.");
		
		if(centerNo == 1) 
			raiseMoney1 += raiseMoney;
		else if(centerNo == 2) 
			raiseMoney2 += raiseMoney;
		else if(centerNo == 3)
			raiseMoney3 += raiseMoney;
		else if(centerNo == 4)
			raiseMoney4 += raiseMoney;
		
		totalMoney += raiseMoney;
	}
	
	public synchronized void raise(int centerNo) {

		for (int i = 0; i < 10; i++) {
			
			try {
				notifyAll();
				
				call(centerNo, i+1);
				
				if(i == 9) {
					int printMoney = 0;
					if(centerNo == 1)
						printMoney = raiseMoney1;
					else if(centerNo == 2)
						printMoney = raiseMoney2;
					else if(centerNo == 3)
						printMoney = raiseMoney3;
					else if(centerNo == 4)
						printMoney = raiseMoney4;
						
					System.out.println("==================================================");
					System.out.println("\t" + centerNo + "번 콜센터에서의 총 모금액 : " + Util.convertMoneySign(printMoney) + "원");
					System.out.println("==================================================");
				}
				
				if(Thread.activeCount() > 2)
					wait();
			
				notifyAll();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}	
	}
	
}
