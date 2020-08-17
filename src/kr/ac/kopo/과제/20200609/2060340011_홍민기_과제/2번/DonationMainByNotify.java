package kr.ac.kopo.day17.homework;

import java.util.Random;

class Donation {

	Random r = new Random();
	
	private int totalSum =0;
	private int[] sum= {0,0,0,0};

	public synchronized void sum(int num) {
		try {
			notify();
			int money = (r.nextInt(10)+1)*1000;
			System.out.println(num+"번 콜센터 : "+money+"원을 받았습니다 ");
			sum[0]+=money;
			wait();
			notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void sum2(int num) {
		try {
			notify();
			int money = (r.nextInt(10)+1)*1000;
			System.out.println(num+"번 콜센터 : "+money+"원을 받았습니다");
			sum[1]+=money;
			wait();
			notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void sum3(int num) {
		try {
			notify();
			int money = (r.nextInt(10)+1)*1000;
			System.out.println(num+"번 콜센터 : "+money+"원을 받았습니다");
			sum[2]+=money;
			wait();
			notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void sum4(int num) {
		try {
			notify();
			int money = (r.nextInt(10)+1)*1000;
			System.out.println(num+"번 콜센터 : "+money+"원을 받았습니다");
			sum[3]+=money;
			wait();
			notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int totalSum() {
		int total =0;
		for(int i=0;i<sum.length;i++) {
			total+=sum[i];
		}
		return total;
	}
	
	public int[] getSum() {
		return sum;
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
		for(int i=0;i<10;i++) {
			done.sum(num);
		}
		System.out.println(num+"번 콜센터에서의 총 모금액 : "+done.getSum()[0]);
	}
}

class CallCenter2 extends Thread{

	Donation done;
	int num;

	CallCenter2(Donation done, int num){
		this.done = done;
		this.num = num;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			done.sum2(num);
		}
		System.out.println(num+"번 콜센터에서의 총 모금액 : "+done.getSum()[1]);
	}
}

class CallCenter3 extends Thread{

	Donation done;
	int num;

	CallCenter3(Donation done, int num){
		this.done = done;
		this.num = num;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			done.sum3(num);
		}
		System.out.println(num+"번 콜센터에서의 총 모금액 : "+done.getSum()[2]);
	}
}

class CallCenter4 extends Thread{

	Donation done;
	int num;

	CallCenter4(Donation done, int num){
		this.done = done;
		this.num = num;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			done.sum4(num);
		}
		System.out.println(num+"번 콜센터에서의 총 모금액 : "+done.getSum()[3]);
	}
}

public class DonationMainByNotify {

	public static void main(String[] args) {

		Donation done = new Donation();

		CallCenter cc = new CallCenter(done,1);
		CallCenter2 cc2 = new CallCenter2(done,2);
		CallCenter3 cc3 = new CallCenter3(done,3);
		CallCenter4 cc4 = new CallCenter4(done,4);

		cc.start();
		cc2.start();
		cc3.start();
		cc4.start();

		try {
			cc.join();
			cc2.join();
			cc3.join();
			cc4.join();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("국민들이 보내주신 성금총액  : "+done.totalSum());
	}
}