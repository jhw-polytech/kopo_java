package kr.ac.kopo.assignment.day03;

public class No5 {
	/*
	달팽이가 100M 깊이의 우물을 빠졌습니다.
	달팽이는 1시간에 5M 속도로 움직입니다
	올라온 높이가 50M 미만일 땐 1시간에 1M씩 미끄러지고,
			 50M 이상일 땐 1시간에 2M씩 미끄러집니다.
	달팽이가 총 몇 시간만에 탈출하는지를 코드로 작성하시오.
	 */
	
	public static void main(String[] args) {
		
		/*
		 12시간 후 48m
		 ( 4m/h 속도로 감 --> 30분에 2m)
		 12.5시간 후 50m
		 ( 50m 이후인 시점이라 3m/h 속도로 이동 --> 30분에 1.5m)
		 13시간 후 51.5m
		12시간 ~ 13시간 내에 속도가 바뀌는데, 표현 방법을 못 찾아서 12.5시간 이후 3m/h로 바뀌는 과정은 생략했습니다ㅜ
		더 좋은 방법이 있을까 아직 고민중입니다ㅜ
		 */
		
		int time = 0; 
		int snailMove = 0;
		int wellDepth = 100;
		int snailSpeedUnder = 4;
		int snailSpeedUpper = 3;
	
		for(time = 1; snailMove < wellDepth ; time++ ){
			if(snailMove < 50) {
				snailMove += snailSpeedUnder;	
				System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %d\n", time, snailMove );
			}
			
			else {
				snailMove += snailSpeedUpper;
				System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %d\n", time, snailMove );
			}
		} 
			
		
	}

}
