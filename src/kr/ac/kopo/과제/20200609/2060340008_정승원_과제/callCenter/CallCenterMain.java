package kr.ac.kopo.day18.project.callCenter;

import java.util.Random;
/**
 * java 8 이후 문법인 "익명 자신 객체"로 구현하였습니다.
 * @author seung
 *
 */
public class CallCenterMain {
	static int callSum = 0;
	public static void main(String[] args) {
		
		Thread call01 = new Thread() {
			public void run() {
				Random r = new Random();
				int money = 0;
				int call01Money = 0;
				for(int i = 0; i<=10; i++) {
					money = (r.nextInt(10) + 1)*1000;
					System.out.println("1번 콜센터 :"+ money+"원을 받았습니다.");
					call01Money += money;
					
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}  
				}

				System.out.println("1번 콜센터에서의 총 모금액 : "+call01Money);
				callSum += call01Money;
			}
		};
		
		Thread call02 = new Thread() {
			public void run() {
				Random r = new Random();
				int money = 0;
				int call02Money = 0;
				for(int i = 0; i<=10; i++) {
					money = (r.nextInt(10) + 1)*1000;
					System.out.println("2번 콜센터 :"+ money+"원을 받았습니다.");
					call02Money += money;
					try {
						Thread.sleep(900);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("2번 콜센터에서의 총 모금액 : "+call02Money);
				callSum += call02Money;
			}
		};
		
		Thread call03 = new Thread() {
			public void run() {
				Random r = new Random();
				int money = 0;
				int call03Money = 0;
				for(int i = 0; i<=10; i++) {
					money = (r.nextInt(10) + 1)*1000;
					System.out.println("3번 콜센터 :"+ money+"원을 받았습니다.");
					call03Money += money;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				System.out.println("3번 콜센터에서의 총 모금액 : "+call03Money);
				callSum += call03Money;
			}
		};
		
		Thread call04 = new Thread() {
			public void run() {
				Random r = new Random();
				int money = 0;
				int call04Money = 0;
				for(int i = 0; i<=10; i++) {
					money = (r.nextInt(10) + 1)*1000;
					System.out.println("4번 콜센터 :"+ money+"원을 받았습니다.");
					call04Money += money;
					try {
						Thread.sleep(1100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				System.out.println("4번 콜센터에서의 총 모금액 : "+call04Money);
				callSum += call04Money;
				System.out.println("국민들이 보내주신 성금총액 "+ callSum +"원");
			}
		};
		
		call01.start();
		call02.start();
		call03.start();
		call04.start();	
		
	}
	
}
