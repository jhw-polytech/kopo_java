package homework0609;

import java.util.Random;

public class CallCenter {
	static public int totalCash = 0;
	
	public static void main(String[] args) {
		
		CenterM m = new CenterM();
		m.start();
		
	}
}	

class CenterA extends Thread{

	@Override
	public void run() {
		int centerATotal=0;
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=1; i<=9; i++) {
			int cash = (r.nextInt(10)+1)*1000;
			System.out.println("1번 콜센터 : "+cash+" 원을 받았습니다.("+i+")회차");
			centerATotal += cash;
		}
		int cash2 = (r.nextInt(10)+1)*1000;
		System.out.printf("1번 콜센터 : %d 원을 받았습니다.(%d)회차\n1번 콜센터의 총 모금액 : %d \n", cash2,10, centerATotal);
//		System.out.println("1번 콜센터에서의 총 모금액 : " + centerATotal);
		CallCenter.totalCash += centerATotal; 
	}
	
}
class CenterB extends Thread{
	@Override
	public void run() {
		int centerBTotal=0;
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=1; i<=10; i++) {
			int cash = (r.nextInt(10)+1)*1000;
			System.out.println("2번 콜센터 : "+cash+" 원을 받았습니다.("+i+")회차");
			centerBTotal += cash;
		}
		System.out.println("2번 콜센터에서의 총 모금액 : " + centerBTotal);
		CallCenter.totalCash += centerBTotal; 
	}
	
}
class CenterC extends Thread{
	@Override
	public void run() {
		int centerCTotal=0;
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=1; i<=10; i++) {
			int cash = (r.nextInt(10)+1)*1000;
			System.out.println("3번 콜센터 : "+cash+" 원을 받았습니다.("+i+")회차");
			centerCTotal += cash;
		}
		System.out.println("3번 콜센터에서의 총 모금액 : " + centerCTotal);
		CallCenter.totalCash += centerCTotal; 
	}
	
}
class CenterD extends Thread{
	@Override
	public void run() {
		int centerDTotal=0;
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=1; i<=10; i++) {
			int cash = (r.nextInt(10)+1)*1000;
			System.out.println("4번 콜센터 : "+cash+" 원을 받았습니다.("+i+")회차");
			centerDTotal += cash;
		}
		System.out.println("4번 콜센터에서의 총 모금액 : " + centerDTotal);
		CallCenter.totalCash += centerDTotal; 
	}
	
}

class CenterM extends Thread{
	@Override
	public void run() {
		CenterA a = new CenterA();
		CenterB b = new CenterB();
		CenterC c = new CenterC();
		CenterD d = new CenterD();
		
		a.start();
		b.start();
		c.start();
		d.start();
		
		try {
			a.join();
			b.join();
			c.join();
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("국민들이 보내주신 성금 총액 : " + CallCenter.totalCash);
	}
}