package kr.ac.kopo.day19.homework02;


class CallTh1 extends Thread {

	private Caller caller = null;

	public CallTh1(Caller caller) {
		this.caller = caller;
	}

	@Override
	public void run() {

		caller.giving1();
	}

}

class CallTh2 extends Thread {

	private Caller caller = null;

	public CallTh2(Caller caller) {
		this.caller = caller;
	}

	@Override
	public void run() {

		caller.giving2();
	}

}

class CallTh3 extends Thread {

	private Caller caller = null;

	public CallTh3(Caller caller) {
		this.caller = caller;
	}

	@Override
	public void run() {

		caller.giving3();
	}

}

class CallTh4 extends Thread {

	private Caller caller = null;

	public CallTh4(Caller caller) {
		this.caller = caller;
	}

	@Override
	public void run() {

		caller.giving4();
	}

}

public class CallThread {

	
}
