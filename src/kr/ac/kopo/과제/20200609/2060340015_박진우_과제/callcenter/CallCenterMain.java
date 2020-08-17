package kr.ac.kopo.day17.homework.callcenter;

public class CallCenterMain {

	public static void main(String[] args) {
		
		Caller caller = new Caller();
		
		CallerThread ct1 = new CallerThread(caller, 1);
		CallerThread ct2 = new CallerThread(caller, 2);
		CallerThread ct3 = new CallerThread(caller, 3);
		CallerThread ct4 = new CallerThread(caller, 4);

		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
			ct4.join();
			
			System.out.println("\n국민들이 보내주신 성금 총액 : " + Util.convertMoneySign(Caller.totalMoney) + "원");
		} catch(Exception e) {
			
		}
		
	}
}
