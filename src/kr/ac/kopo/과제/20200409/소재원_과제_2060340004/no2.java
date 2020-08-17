package exam0409;

import java.util.Scanner;

public class no2 {
	
	/*
	 * 0초 ~ 60초 미만은 그대로 출력
	 * 60초 이상 ~ 3600초 미만
	 * 3600초 이상은 몫과 나머지를 이용해서 시/분/초를 계산한다.
	 * 그 외의 값(음수)은 오류이다.
	 */

	public static void main(String[] args) {
		
		System.out.println("초를 입력하면 환산됩니다.");
		Scanner sc = new Scanner(System.in);
		int second = sc.nextInt();
		sc.close();
		
		if (second > 0) {
	
			if ((0 < second) && (second < 60)) {
				System.out.println(second + "초 입니다.");
			} else if (second < 3600) {
				//3010 = > 50분 10초
				int min = second / 60;
				int sec = second % 60;
				System.out.println(min + "분 " + sec + "초 입니다.");
			} else {
				int hour = second / 3600;
				int min = second % 3600 / 60;
				int sec = second % 3600 % 60;
				System.out.println(hour + "시간 " + min + "분 " + sec + "초 입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
