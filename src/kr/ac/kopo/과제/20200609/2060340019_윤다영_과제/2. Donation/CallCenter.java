package kr.ac.kopo.assignment.day17;

public class CallCenter extends Thread {
	
	private Donation don;
	private int num;
	
	public CallCenter(Donation don, int num) {
		this.don = don;
		this.num = num;
	}

	@Override
	public void run() {
		don.sum(num);
		
	}
	
	

}
