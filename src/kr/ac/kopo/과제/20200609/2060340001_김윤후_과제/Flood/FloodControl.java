package Assignment;


class FloodControl01 extends Thread{
	int OneSum;
	private FloodNum flood;
	
	public FloodControl01(FloodNum flood) {
		this.flood=flood;
	}

	@Override
	public synchronized void run() {
		OneSum=0;
		try {
			
			for(int i=0; i<10; i++) {
				flood.One();
				OneSum+=flood.RanOne;
				if(i==9) {
					System.out.println("1번 콜센터에서의 총 모금액 : "+OneSum);
					
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
class FloodControl02 extends Thread{
	int TwoSum;
	private FloodNum flood;
	
	public FloodControl02(FloodNum flood) {
		this.flood=flood;
	}
	
	@Override
	public synchronized void run() {
		TwoSum=0;

		try {
			for(int i=0; i<10; i++) {
				flood.Two();
				TwoSum+=flood.RanTwo;
				if(i==9) {
					System.out.println("2번 콜센터에서의 총 모금액 : "+TwoSum);
					
				}
				
			}

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}
class FloodControl03 extends Thread{
	int ThreeSum;
	private FloodNum flood;
	
	public FloodControl03(FloodNum flood) {
		this.flood=flood;
	}
	
	@Override
	public void run() {
		ThreeSum=0;
		for(int i=0; i<10; i++) {
			flood.Three();
			ThreeSum+=flood.RanThree;
			
		}
		System.out.println("3번 콜센터에서의 총 모금액 : "+ThreeSum);
	}
	
	
}
class FloodControl04 extends Thread{
	int FourSum;
	private FloodNum flood;
	
	public FloodControl04(FloodNum flood) {
		this.flood=flood;
	}
	
	@Override
	public void run() {
		FourSum=0;
		for(int i=0; i<10; i++) {
			flood.Four();
			FourSum+=flood.RanFour;
			
		}
		System.out.println("4번 콜센터에서의 총 모금액 : "+FourSum);
	}
	
	
}