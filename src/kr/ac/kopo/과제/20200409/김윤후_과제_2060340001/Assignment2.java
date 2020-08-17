package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초를 입력하세요 :");
		int Second = sc.nextInt();
		sc.nextLine();
		
		// Scanner를 사용하여 Second라는 변수에 초를 입력받았습니다.
		System.out.println("결과 출력");

		/*
			만일 3608호 입력하면 0분 나오지 않나요???
			확인한번 해주세요 ^^
		*/

		if (Second>=3600) {
			System.out.printf("%d시간 %d분 %d초",Second/3600,Second%60,Second%1);
		} 
		else if(Second>60 && Second<3600) {
			System.out.printf("%d시간 %d분 %d초",Second/3600,Second/60,Second-Second/60*60);
		}
		else {
			System.out.printf("%d시간 %d분 %d초",Second/3600,Second/60,Second);
		}
	}
}
/* IF문을 사용하여 1시간이 넘을때, 1분~59분 , ~59초까지 나누어 기록함.
1시간이 넘으면 분과 초를 나머지 값으로 넣음
1~59분사이는 입력받은 초에서 입력받은초/60을 하여 60이 안되는 소수값을 절삭하고 다시 60을 곱하여 처리
59초는 그대로 입력
*/
