package shlee1993.day11.homework;

import java.util.Scanner;

public class CalendarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		int year = 0, month = 0;
		CalendarView cv;

		end: while (true) {
			System.out.println("선택하세요(1.특정 연도   2.특정 월   3.종료)");
			select = Integer.parseInt(sc.nextLine());
			
			switch (select) {
			case 1:
				System.out.println("연도를 입력하세요 : ");
				year = Integer.parseInt(sc.nextLine());

				cv = new CalendarView();
				cv.view(year);
				break;

			case 2:
				System.out.println("연도를 입력하세요 : ");
				year = Integer.parseInt(sc.nextLine());
				System.out.println("월을 입력하세요 : ");
				month = Integer.parseInt(sc.nextLine());

				cv = new CalendarView();
				cv.view(year, month);
				break;
			default:
				System.out.println("종료합니다.");
				
				sc.close();
				break end;
			}
		}
	}
	
}
