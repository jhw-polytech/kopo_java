package jaeheehomework;

public class Homework2_5 {
	
	public static void main(String[] args) {
		
		// 5. 달팽이 문제. 총 100m거리. 이동거리 <50m 일때는 시속 4m/h, >50일때는 시속 3m/h
				System.out.println("\n5번");
				
				int totalDistance = 0;
				int totalTime = 0;
				
				// 주기를 1시간으로 두고, while문이 돌아갈 동안 totalTime을 1시간씩 더해줌.
				// totalDistance를 50미만, 이상으로 나누고 1시간 당 이동거리를 더해줌.
				while(totalDistance < 100) {
					
					if (totalDistance < 50) {
					
						totalDistance += 4; 
					
					} else {
					
						totalDistance += 3;
					}
					
					totalTime++;
					
					System.out.printf("\n[%d시간 후] 달팽이가 올라간 총 높이 : %dM", totalTime, totalDistance);
				
				}
	}
}
