package kr.ac.kopo.day11.project02;

import java.util.Scanner;

public class CalendarController {

	public static void execute() {
		
		
		// while에서 switch로 처리한다.
		// 1인 경우 -> 인자 한개를 받아서 넘긴다.
		// 2인 경우 -> 인자 두개를 받아서 넘긴다.	
		// 3인 경우
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int year = 0;
		int month = 0;
		stop: while(true) {
			System.out.println("선택하세요(1.특정년도 2.특정월 3.종료) =>");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력하세요.");
			}
			switch(num) {
				case 1:
					System.out.println("년도를 입력하세요.: ");
					year = Integer.parseInt(sc.nextLine());
					AutoCalendar.yearly(year);
					break;
				case 2:
					System.out.println("년도를 입력하세요.: ");
					year = Integer.parseInt(sc.nextLine());
					System.out.println("월을 입력하세요.");
					month = Integer.parseInt(sc.nextLine());
					AutoCalendar.monthly(year, month);
					break;
				case 3:
					System.out.println("자동 캘린더를 종료합니다.");
					break stop;
				default:
					System.out.println("다시 입력하세요.");
			}
		}
		sc.close();
	}

}
