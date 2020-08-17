package test0411;

/*
 *  다음의 설명을 보고 코드를 작성하세요. 
 *  달팽이가 100M 깊이의 우물을 빠졌습니다 
 *  달팽이는 1시간에 5M속도로 움직입니다 
 *  올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고 
 *  50M이상일때 1시간에 2M씩 미끌어집니다 
 *   달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요
 *   
 *   <출력결과> 
 *  [1시간후] 달팽이가 올라간 총 높이 : 4M 
 *  [2시간후] 달팽이가 올라간 총 높이 : 8M 
 *  ...
 *  [XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M 
 */

public class exam05correction {
	
	public static void main(String[] args) {
		
		System.out.println("<출력결과>");
		
		int escape = 0;
		int hour = 0;
		
		while(escape<100) {
			
			hour++;
			escape +=(escape < 50 ? 4 : 3);
			System.out.println("[" + hour + "시간후] 달팽이가 올라간 총 높이 :" + escape + "M");
			
			if(escape>100) {
				System.out.println("[" + hour + "시간후] 달팽이가 올라간 총 높이 :" + escape + "M");
				
				
			}
		}
		
	}

}
