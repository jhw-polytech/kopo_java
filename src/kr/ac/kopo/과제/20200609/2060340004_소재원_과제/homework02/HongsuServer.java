package kr.ac.kopo.day19.homework02;

public class HongsuServer {

	public static void main(String[] args) {

		Caller caller = new Caller();

		CallTh1 ct1 = new CallTh1(caller);
		CallTh2 ct2 = new CallTh2(caller);
		CallTh3 ct3 = new CallTh3(caller);
		CallTh4 ct4 = new CallTh4(caller);

		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();

		try {
			ct1.join();
			ct2.join();
			ct3.join();
			ct4.join();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("국민들이 보내주신 성금총액 : " + Caller.totalMoney + "원");

	}
}
