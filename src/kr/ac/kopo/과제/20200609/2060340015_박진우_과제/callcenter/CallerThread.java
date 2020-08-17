package kr.ac.kopo.day17.homework.callcenter;

public class CallerThread extends Thread{

	private Caller caller = null;
	private int centerNo = 0;
	
	public CallerThread(Caller caller) { 
		this.caller = caller;
	}
	
	public CallerThread(Caller caller, int centerNo) { 
		this.caller = caller;
		this.centerNo = centerNo;
	}

	@Override
	public void run() {
		
		caller.raise(centerNo);
		
	}

	
}

