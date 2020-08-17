package kr.ac.yeongnam.day03.homework;


/*
 	5. 다음의 설명을 보고 코드를 작성하세요.
 	      달팽이가 100M 깊이의 우물을 빠졌습니다
 	      달팽이는 1시간에 5M속도로 움직입니다
 	      올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
 	                   50M이상일때 1시간에 2M씩 미끌어집니다
 	      달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.
 	      
 	    < 출력결과 >
 	    [1시간후] 달팽이가 올라간 총 높이 : 4M
 	    [2시간후] 달팽이가 올라간 총 높이 : 8M
 	    ...      
 	    [XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M 
 */

public class Problem05 {

	public static void main(String[] args) {

		int snailDepth = -100; // 달팽이의 높이를 나타내는 변수
		int hours = 1; // 경과 시간을 나타내기 위한 변수
		
		System.out.println("<출력 결과>");
		for( ; snailDepth <= 0; hours++) { // 달팽이가 탈출할 때까지 반복
			snailDepth += 5; // 시간당 5M씩 올라감
			if(snailDepth < -50) { // 50M 미만일 때 1M씩 미끄러짐
				snailDepth -= 1;				
			} else { // 50M 이상일 때 2M씩 미끄러짐
				snailDepth -= 2;				
			}
			System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %dM\n", hours, 100 + snailDepth);
		}		
	}
}
