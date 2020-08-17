package Assignment;

public class FloodMain {

	public static void main(String[] args) {
		FloodNum flood =new FloodNum();
		
		FloodControl01 fc01 = new FloodControl01(flood);
		FloodControl02 fc02 = new FloodControl02(flood);
		FloodControl03 fc03 = new FloodControl03(flood);
		FloodControl04 fc04 = new FloodControl04(flood);
		
		fc01.start();
		fc02.start();
		fc03.start();
		fc04.start();
		
		try {
			fc01.join();
			fc02.join();
			fc03.join();
			fc04.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.exit(0);
//		
		
	}
}
