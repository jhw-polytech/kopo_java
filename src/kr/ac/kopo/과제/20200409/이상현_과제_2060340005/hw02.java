package shlee1993.day02.homework;

import java.util.Scanner;

/*
2. 초를 입력받아 몇 시간 몇 분 몇 초인지 환산 하는 프로그램
ex)초를 입력하세요 : 3600
1시간, 1시간 5분, 1시간 2분 5초
*/


// '/'와 '%'를 이용하여 입력받은 시간을'시, 분, 초'로 나눈 후,값이 있을 때만 출력하기 위해 if문을 이용해 0 보다 클 때만,해당 값을 출력하도록 한다.


public class hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요(양수) : ");
		String timeInput = sc.nextLine();	//이 문제에서는 상관없지만 버퍼문제를 해결하기 위해 사용
		int time = Integer.parseInt(timeInput);	//이 문제에서는 상관없지만 버퍼문제를 해결하기 위해 사용

		int hour = 0, minute = 0, second = 0;
		hour = time / 3600;
		minute = time % 3600 /60;	//입력된 시간에서 hour(3600초)에 들어간 부분을 제외한 것에 몫을 구해 '분'을 구한다.
		second = time % 60;
		if (time <= 0)
			System.out.println("0초보다 작습니다.");
		else {
			if(hour != 0) System.out.print(hour + "시 ");	//문제의 조건대로 0이 아닐 때만 해당 값을 출력하고 0일때는 해당 라인은 출력하지 않음
			if(minute != 0) System.out.print(minute + "분 ");
			if(second != 0) System.out.print(second + "초");
			System.out.println("");
		}
	}
}
