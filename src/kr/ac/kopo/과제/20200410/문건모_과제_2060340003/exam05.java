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


public class exam05 {
	
	public static void main(String[] args) {
		
		System.out.println("<출력결과>");
		
		/*
			3*i+12<=102 이조건은 어떻게 나온거래요??? ㅋㅋㅋ
		*/
		for(int i = 1 ; 3*i+12<=102 ;i++) {
			
			
			int escape01 = 4*i; //50M 미만일때 탈출거리
			int escape02 = 48 + 3*(i-12); //50M 이상일때 탈출거리
			
			int cnt = 1;
			cnt++;
			
			
			if(escape01<50) {
				
				
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", i, escape01);
			
			}else {
								
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", i, escape02);
				
				}
			
			}
		
		
		
	}

}
