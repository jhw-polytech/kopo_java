package exam0410;

public class no05 {

	public static void main(String[] args) {
		// <----48m-----><48m--52m><-----50m----->
		/*
		 * 12시간 까지는 4m씩 오르며,
		 * 중간의 48m->53m로 가는 구간에는 1.5m를 미끄러진다.
		 * 이후 50m이상에서는 3m씩 오른다.
		 */
		System.out.println("달팽이가 100M 깊이의 우물에 빠졌습니다.");
		System.out.println("달팽이는 5m/hour 속도로 움직입니다.");
		System.out.println("50M 미만일 때에는 1시간에 1M씩 미끄러지고,");
		System.out.println("50M 이상일 때에는 1시간에 2M씩 미끄러집니다.");
		
		float distance = 0F;
		   
		for (int i = 1; i <= ((50.0 / 4) + (50.0 / 3) + 1); i++) {
			if (i <= 50 / 4) {
				distance += 4;
				System.out.printf("[%2d시간 후] 달팽이가 올라간 총 높이 : %.1fM\n", i, distance);				
			} else if (i == (50 / 4) + 1) {
				distance += 5 - ((1.0 + 2.0) / 2) ;
				System.out.printf("[%2d시간 후] 달팽이가 올라간 총 높이 : %.1fM\n", i, distance);
			} else {
				distance += 3;
				System.out.printf("[%2d시간 후] 달팽이가 올라간 총 높이 : %.1fM\n", i, distance);			
			} 
		}
	}
}