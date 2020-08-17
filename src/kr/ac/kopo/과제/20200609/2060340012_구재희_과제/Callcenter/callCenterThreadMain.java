package callCenterThread;

public class callCenterThreadMain {

	public static void main(String[] args) {
		
		callCenter c1 = new callCenter();
		callCenter2 c2 = new callCenter2();
		callCenter3 c3 = new callCenter3();
		callCenter4 c4 = new callCenter4();
		
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		
		try {
			c1.join();
			c2.join();
			c3.join();
			c4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		int totalSum = c1.getSum() + c2.getSum() + c3.getSum() + c4.getSum();
		System.out.println();
		System.out.println("***** 국민들이 보내주신 성금총액 : " + totalSum +" *****");
	}
	
}
