package kr.ac.kopo.assignment.day17;

import java.util.Random;

public class Donation {
	
	private int total = 0;
	private int[] callTotal = {0,0,0,0};
	private int money;
	
	public void sum(int callNum) {
		
		try {
			
			synchronized(this) {
				for(int i = 1; i <= 10; i++) {
					
					notify();
					Random ran = new Random();
					money = ran.nextInt(9000) + 1001;
					
					switch(callNum) {
					case 1 :
						callTotal[0] += money;
						break;
					case 2 :
						callTotal[1] += money;
						break;
					case 3 :
						callTotal[2] += money;
						break;
					case 4 : 
						callTotal[3] += money;
						break;
					}
					
					total += money;
					System.out.println(callNum + "번 콜센터 : " + money + "원을 받았습니다.");
					wait();
					
				}
				
				notifyAll();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int getTotal() {
		return total;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int[] getCallTotal() {
		return callTotal;
	}
	
	

}
