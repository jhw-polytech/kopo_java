package Test04;

import java.util.Random;

class CallCenter01 extends Thread{
	
	private int money = 0;
	private int[] moneyArr = new int[10];
	private int sum;
	
	
	
	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		
		Random r = new Random();
		for(int i = 0; i<10 ;i++) {
			money = r.nextInt(9000) + 1000;
			moneyArr[i] = money;
			System.out.println("1번 콜센터 " + money + "원을 받았습니다");
			
		}
		
		for(int i = 0;i<10;i++) {
			sum += moneyArr[i];
		}
		System.out.println("1번 콜센터 총모금액" + sum + " 원을 받았습니다.");
	}
	
}

class CallCenter02 extends Thread{
	
	private int money = 0;
	private int[] moneyArr = new int[10];
	private int sum;
	
	
	
	public int getSum() {
		return sum;
	}



	public void setSum(int sum) {
		this.sum = sum;
	}



	@Override
	public void run() {
		
		Random r = new Random();
		for(int i = 0; i<10 ;i++) {
			money = r.nextInt(9000) + 1000;
			moneyArr[i] = money;
			System.out.println("2번 콜센터" + money + "원을 받았습니다");
		}
		
		for(int i = 0;i<10;i++) {
			sum += moneyArr[i];
		}
		System.out.println("2번 콜센터 총 모금액" + sum + "원을 받았습니다.");
	}
	
}

class CallCenter03 extends Thread{
	
	private int money = 0;
	private int[] moneyArr = new int[10];
	private int sum;
	
	
	
	public int getSum() {
		return sum;
	}



	public void setSum(int sum) {
		this.sum = sum;
	}
	



	@Override
	public void run() {
		
		Random r = new Random();
		for(int i = 0; i<10 ;i++) {
			money = r.nextInt(9000) + 1000;
			moneyArr[i] = money;
			System.out.println("3번 콜센터" + money + "원을 받았습니다");
		}
		
		for(int i = 0;i<10;i++) {
			sum += moneyArr[i];
		}
		System.out.println("3번 콜센터 총모금액 " + sum + "원을 받았습니다.");
	}
	
}

class CallCenter04 extends Thread{
	
	private int money = 0;
	private int[] moneyArr = new int[10];
	private int sum;
	
	
	
	public int getSum() {
		return sum;
	}



	public void setSum(int sum) {
		this.sum = sum;
	}



	@Override
	public void run() {
		
		Random r = new Random();
		for(int i = 0; i<10 ;i++) {
			money = r.nextInt(9000) + 1000;
			moneyArr[i] = money;
			System.out.println("4번 콜센터" + money + "원을 받았습니다");
		}
		
		for(int i = 0;i<10;i++) {
			sum += moneyArr[i];
		}
		System.out.println("4번 콜센터 총모금액 " + sum + "원을 받았습니다.");
	}
	
}

public class CallCenterMain {
	
	public static void main(String[] args) {
		
		CallCenter01 cc1 = new CallCenter01();
		CallCenter02 cc2 = new CallCenter02();
		CallCenter03 cc3 = new CallCenter03();
		CallCenter04 cc4 = new CallCenter04();
		
		try {
			
			cc1.start();
			cc2.start();
			cc3.start();
			cc4.start();
			
//			cc1.join();
//			cc2.join();
//			cc3.join();
//			cc4.join();
			
			int sum = cc1.getSum() + cc2.getSum() + cc3.getSum() + cc4.getSum();
			
			
			System.out.println("국민들이 보내주신 총 금액 : " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
