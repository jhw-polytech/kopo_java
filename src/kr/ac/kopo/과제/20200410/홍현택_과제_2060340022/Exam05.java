package kr.co.hana.homework02;

public class Exam05 {
	public static void main(String[] args) {
		
		int depth;
			
		for(depth = 0; depth <= 100; depth++) {
			
			if (depth < 50) {
				int speed = 4;
				int time = depth / speed;
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, time*speed);
			}
			else if(depth > 50 && depth <= 100) {
				int speed = 5;
				int time = depth / speed;
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, time*speed);
			}
			else {
				System.out.println();
			}
		
	}
		
		
	}
}
