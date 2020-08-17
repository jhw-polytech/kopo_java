package kr.ac.kopo.assignment.day17;

public class DonationMain {
	
	public static void main(String[] args) {
		System.out.println("전화번호 1 - 4번까지 1000원 ~ 10000원사이로 금액을 보내주시길 바랍니다.");
		
		Donation don = new Donation();
		
		CallCenter call1 = new CallCenter(don, 1);
		CallCenter call2 = new CallCenter(don, 2);
		CallCenter call3 = new CallCenter(don, 3);
		CallCenter call4 = new CallCenter(don, 4);
		
		call1.start();
		call2.start();
		call3.start();
		call4.start();
		
		try {
			call1.join();
			call2.join();
			call3.join();
			call4.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int[] callTotal = don.getCallTotal();
		for(int i = 0; i < 4; i++) {
			System.out.println( (i+1) + "번 콜센터에서의 총 모금액 : " + callTotal[i] + "원");
		}
		System.out.println("국민들이 보내주신 성금총액 : " + don.getTotal() + "원");
	}

}
