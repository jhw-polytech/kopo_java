package hw.hw16;

import java.util.Random;

class call1 extends Thread {
	
	private int sumofone=0;

	private int[] money1 = new int[10];
	

	public int getSumofone() {
		return sumofone;
	}

	@Override
	public void run() {
		Random r = new Random();
		for(int i=0; i<10 ; i++) {
			try {
			money1[i] = (r.nextInt(9000)+1000);
			System.out.println("1번 콜센터 : "+money1[i]+"원을 받았습니다.");
			sumofone += money1[i];
			Thread.yield();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("1번 콜센터에서의 총 모금액 : "+sumofone);
		
	}
	
}
class call2 extends Thread {
	
	private int sumoftwo=0;

	private int[] money2 = new int[10];
	

	public int getSumoftwo() {
		return sumoftwo;
	}

	@Override
	public void run() {
		Random r = new Random();
		for(int i=0; i<10 ; i++) {
			try {
			money2[i] = (r.nextInt(9000)+1000);
			System.out.println("2번 콜센터 : "+money2[i]+"원을 받았습니다.");
			sumoftwo += money2[i];
			Thread.yield();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("2번 콜센터에서의 총 모금액 : "+sumoftwo);
		
	}
	
}
class call3 extends Thread {
	
	private int sumofthree=0;

	private int[] money3 = new int[10];
	

	public int getSumofthree() {
		return sumofthree;
	}

	@Override
	public void run() {
		Random r = new Random();
		for(int i=0; i<10 ; i++) {
			try {
			money3[i] = (r.nextInt(9000)+1000);
			System.out.println("3번 콜센터 : "+money3[i]+"원을 받았습니다.");
			sumofthree += money3[i];
			Thread.yield();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("3번 콜센터에서의 총 모금액 : "+sumofthree);
		
	}
	
}
class call4 extends Thread {
	
	private int sumoffour=0;

	private int[] money4 = new int[10];
	

	public int getSumoffour() {
		return sumoffour;
	}

	@Override
	public void run() {
		Random r = new Random();
		for(int i=0; i<10 ; i++) {
			try {
			money4[i] = (r.nextInt(9000)+1000);
			System.out.println("4번 콜센터 : "+money4[i]+"원을 받았습니다.");
			sumoffour += money4[i];
			Thread.yield();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("4번 콜센터에서의 총 모금액 : "+sumoffour);
		
	}
	
}

public class CallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call1 one = new call1();
		call2 two = new call2();
		call3 three = new call3();
		call4 four = new call4();
		
		one.start();
		two.start();
		three.start();
		four.start();
		
		try {
			one.join();
			two.join();
			three.join();
			four.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int totalsum = one.getSumofone()+two.getSumoftwo()+three.getSumofthree()+four.getSumoffour();

		System.out.println("국민들이 보내주신 성금총액 : "+totalsum+"원 입니다.");
	}

}
