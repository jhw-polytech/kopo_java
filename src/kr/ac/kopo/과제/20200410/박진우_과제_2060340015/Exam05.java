package kr.ac.jinwoo.day03.homework;

/*
 * 다음의 설명을 보고 코드 작성하시오.
 * 
 * 달팽이가 100M 깊이의 우물을 빠졌습니다.
 * 달팽이는 1시간에 5M속도로 움직입니다.
 * 올라온 높이가 50M미만일 땐 1시간에 1M씩 미끄러지고
 *          50M이상일 때 1시간에 2M씩 미끄러집니다.
 * 달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.
 * 
 * <출력결과>
 *  [1시간 후] 달팽이가 올라간 총 높이 : 4M
 *  [2시간 후] 달팽이가 올라간 총 높이 : 8M
 *  ...
 *  [XX시간 후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
 *  
 */

public class Exam05 {

	public static void main(String[] args) {
		
		int snailSpeed = 5;
		int wellDepth = 100;
		int under50_Slide = 1, over50_Slide = 2;
		int snailHeight = 0;
		
		
		for(int i = 1; snailHeight < wellDepth; i++) {
			
			if(snailHeight < 50)	{
				snailHeight += (snailSpeed - under50_Slide);
			}
			else {
				snailHeight += (snailSpeed - over50_Slide);
			}
				
			
			System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %d\n", i, snailHeight);
		}
	}
}
