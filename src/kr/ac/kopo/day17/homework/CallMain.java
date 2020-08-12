package kr.ac.kopo.day17.homework;

public class CallMain {
	
	public static void main(String[] args) {
	
		CallCenter call1 = new CallCenter(1);
		CallCenter call2 = new CallCenter(2);
		CallCenter call3 = new CallCenter(3);
		CallCenter call4 = new CallCenter(4);
		
		try {
			
			call1.start();
			call2.start();
			call3.start();
			call4.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
