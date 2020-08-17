package kr.ac.kopo.day03.project;

/**
 * 
 * @author tess
다음의 설명을 보고 코드를 작성하세요.

달팽이가 100M 깊이의 우물을 빠졌습니다
달팽이는 1시간에 5M속도로 움직입니다
올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
50M이상일때 1시간에 2M씩 미끌어집니다 달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.

< 출력결과 >
[1시간후] 달팽이가 올라간 총 높이 : 4M 
[2시간후] 달팽이가 올라간 총 높이 : 8M
...
[XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
 */

public class Project05 {
	
	public static void main(String[] args) {
		
		int depth = 0;
		int hour = 0;
		
		while (depth < 100) { // 100을 넘기 전까지 반복한다. 
			hour++; // 한 번 올라갈때마다 시간을 늘려주고, 
			depth += 5; // 올라갈 수 있는 만큼 올려준다. 
			if (depth < 50) { // 50 미만인 경우, 
				depth -= 1; 
			} else { // 50 이상인 경우, 
				depth -= 2;
			}
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM \n", hour, depth);
		}
		
	}

}
