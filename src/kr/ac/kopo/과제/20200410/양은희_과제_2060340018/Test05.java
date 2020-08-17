package Homework_0410;

/* 5) 다음의 설명을 보고 코드를 작성하세요.
 * 달팽이가 100M 깊이의 우물에 빠졌습니다.
 * 달팽이는 1시간에 5M 속도로 움직입니다.
 * 올라온 높이가 50M 미만일 때 1시간에 1M씩 미끌어지고
 * 			50M 이상일 때 1시간에 2M씩 미끌어집니다.
 * 달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.
 * */

public class Test05 {
	public static void main(String[] args) {
		
		int h = 0;		// 달팽이가 올라간 높이
		int speed = 5;	// 달팽이의 속도
		
		for (int i = 1; h < 100; i++) {	// 높이 100까지 반복
			if (h < 50) {	// 50M 미만일 경우
				h = h + speed - 1;	// 1M씩 미끌어진다.
			} else {		// 50M 이상일 경우
				h = h + speed - 2;	// 2M씩 미끌어진다.
			}
			System.out.println("[" + i + "시간후] 달팽이가 올라간 총 높이 : " + h + "M");
		}
	}
}