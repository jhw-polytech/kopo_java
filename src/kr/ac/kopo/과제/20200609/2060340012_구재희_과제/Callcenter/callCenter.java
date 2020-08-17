package callCenterThread;

import java.util.Random;

public class callCenter extends Thread{
	
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
					
			Random r = new Random();
			int money = (r.nextInt(9) + 1) * 1000;
			
			System.out.println("1번 콜센터 : " + money + "원을 받았습니다.");
			
			sum += money;
		}
		System.out.println("*** 1번 콜센터에서의 총 모금액 : "+ sum + " ***");
	}
}


class callCenter2 extends Thread{
	
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
					
			Random r = new Random();
			int money = r.nextInt(9001) + 1000;
			
			System.out.println("2번 콜센터 : " + money + "원을 받았습니다.");
			
			sum += money;
		}
		System.out.println("*** 2번 콜센터에서의 총 모금액 : "+ sum + " ***");
	}
}


class callCenter3 extends Thread{
	
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
					
			Random r = new Random();
			int money = r.nextInt(9001) + 1000;
			
			System.out.println("3번 콜센터 : " + money + "원을 받았습니다.");
			
			sum += money;
		}
		System.out.println("*** 3번 콜센터에서의 총 모금액 : "+ sum + " ***");
	}
}


class callCenter4 extends Thread{
	
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
					
			Random r = new Random();
			int money = r.nextInt(9001) + 1000;
			
			System.out.println("4번 콜센터 : " + money + "원을 받았습니다.");
			
			sum += money;
		}
		System.out.println("*** 4번 콜센터에서의 총 모금액 : "+ sum + " ***");
	}
}