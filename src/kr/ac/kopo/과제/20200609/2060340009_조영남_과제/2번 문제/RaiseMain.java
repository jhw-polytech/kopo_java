package kr.ac.yeongnam.day17.homeworkTest;

import java.util.Random;

public class RaiseMain {

	public static void main(String[] args) {
		System.out.println("전화번호 1-4번까지 1000원 ~ 10000원 사이로 금액을 보내주시길 바랍니다.");

		//int callNo = 1;
		RaiseThread rt1 = new RaiseThread(1);
		RaiseThread rt2 = new RaiseThread(2);
		RaiseThread rt3 = new RaiseThread(3);
		RaiseThread rt4 = new RaiseThread(4);
		
		rt1.start();
		rt2.start();
		rt3.start();
		rt4.start();
		
		try {
			rt1.join();
			rt2.join();
			rt3.join();
			rt4.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		while(callNo <= 4) {
			
			rt = new RaiseThread(callNo);
			rt.start();

			
			if(callNo == 4) {
				System.out.println(RaiseThread.wholeMoney + "전체 모금액임다.");
			}
			
			
			try {
				rt.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			callNo++;
		}
	*/
		
		
		System.out.println(RaiseThread.wholeMoney + "전체 모금액임다.");
		System.out.println("=================메인스레드 종료===============");
	}
}
