package CallCenter;

public class Main {

	public static void main(String[] args) {

		CallCenter c1 = new CallCenter();
		CallCenter2 c2 = new CallCenter2();
		CallCenter3 c3 = new CallCenter3();
		CallCenter4 c4 = new CallCenter4();

		try {
			c1.start();
			c2.start();
			c3.start();
			c4.start();

			c1.join();
			c2.join();
			c3.join();
			c4.join();

			int total = c1.getDonation() + c2.getDonation() + c3.getDonation() + c4.getDonation();
			System.out.println("국민들이 보내주신 성금총액 : " + total);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}