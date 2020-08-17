package kr.ac.kopo.day3.assignment;

public class Exam05 {

	public static void main(String[] args) {
	/*달팽이가 100M 깊이의 우물에 빠졌습니다.
	 달팽이는 1시간에 5M속도로 움직입니다.
	 올라온 높이가 50M미만일 땐 1시간에 1M씩 미끌어지고,
	50M이상일 때 1시간에 2M씩 미끌어집니다.
	달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.
	 */
		System.out.println("<출력결과>");
		
		
		//달팽이가 올라간 높이와 소요 시간을 담는 변수 선언 및 초기화
		int height = 0;
		int time = 0;		
	
		
		//height가 100M에 도달하지 않으면 다음과 같은 statement를 반복해서 실행한다
		while(height < 100) {
			
			//올라간 높이가 50M미만일 땐 1시간에 (5-1)=4M씩 올라간다
			if (height < 50) {
				time += 1;
				height = time * (5-1);
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM", time, height);
				System.out.print('\n'); 
			
			//올라간 높이가 50M이상일 땐 1시간에 (5-2)=3M씩 올라간다		
			}else {
				//50M까지 올라가는 데 걸린 시간을 새로운 변수에 저장해놓는다.
				int timeTo50m = time;	//timeTo50m: 50M까지 올라가는 데 걸린 시간
				time += 1;				//time: 최종적으로 걸린 시간
				height = height + (time-timeTo50m) * (5-2);
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM", time, height);
				System.out.print('\n');
			}
		}
		
			
	}
}
