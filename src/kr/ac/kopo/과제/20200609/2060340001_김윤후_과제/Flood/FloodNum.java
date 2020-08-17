package Assignment;

import java.util.Random;
import java.util.Scanner;

class FloodNum {
	
	Random ran= new Random();
	static int RanOne=0;
	static int RanTwo=0;
	static int RanThree=0;
	static int RanFour=0;
	
	public synchronized void One() {
		
		try {
			int OneRan=ran.nextInt(9000)+1000;
			notify(); 
			System.out.println("1번 콜센터 : "+OneRan+"원을 받았습니다.");
			RanOne=OneRan;
			wait();	
			notify();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	
	public synchronized void Two() {
		
		try {
			int TwoRan=ran.nextInt(9000)+1000;
			notify(); 
			System.out.println("2번 콜센터 : "+TwoRan+"원을 받았습니다.");
			RanTwo=TwoRan;
			wait();	
			notify();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	public synchronized void Three() {
		
		try {
			int ThreeRan=ran.nextInt(9000)+1000;
			notify();
			System.out.println("3번 콜센터 : "+ThreeRan+"원을 받았습니다.");
			RanThree=ThreeRan;
			wait();	
			notify();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	public synchronized void Four() {
		
		try {
			int FourRan=ran.nextInt(9000)+1000;
			notify();
			System.out.println("4번 콜센터 : "+FourRan+"원을 받았습니다.");
			RanFour=FourRan;
			wait();	
			notify();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	
}
