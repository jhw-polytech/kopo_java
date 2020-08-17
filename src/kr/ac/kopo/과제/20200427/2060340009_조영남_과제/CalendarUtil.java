package kr.ac.yeongnam.day11.homework;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarUtil {

	public static void getCalendar() {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num != 3) {
			System.out.print("선택하세요 (1. 특정연도   2. 특정 월   3. 종료) =>");
			num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				System.out.print("연도를 입력하세요 : ");
				int year = Integer.parseInt(sc.nextLine());
				
				Calendar c = Calendar.getInstance();
				c.set(year, 0, 1); // year - 1월 - 1일 으로 초기화
				
				// year 1월 ~ year 12월 까지 반복문
				for(int i = 1; i <= 12; i++) { // 월 반복
					
					c.set(year, i-1, 1); // year - month(i-1) - 1일으로 초기화
					int day = c.get(Calendar.DAY_OF_WEEK); // 1일의 요일 => (1:일, ..., 7:토)
					int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); // month 마지막 날짜
					int date = c.get(Calendar.DAY_OF_MONTH); // 해당 날짜
					
					System.out.println(); 
					System.out.println("<< " + year + "년 " + i + "월 >>");
					System.out.println("일  월   화   수   목   금   토");
					for(int j = 1; j <= lastDay; j++) {
						c.set(year, i-1, j);
						day = c.get(Calendar.DAY_OF_WEEK);
						date = c.get(Calendar.DAY_OF_MONTH);
						
						if(date == 1) { // 해당 요일부터 달력이 시작해야 함
							for(int d = 1; d < day; d++){
								System.out.printf("%3s", "");
							}
							System.out.printf("%-3s", j);
						} else {						
							if(day == 1) { // 일요일이면, 한줄 띄움
								System.out.println();
								System.out.printf("%-3s", j);
							} else {
								System.out.printf("%-3s", j);						
							}
							
						}
						
					}
					System.out.println();
					
				}
				
			} else if(num == 2) {
				System.out.print("연도를 입력하세요 : ");
				int year = Integer.parseInt(sc.nextLine());
				System.out.println();
				System.out.print("월을 입력하세요 : ");
				int month = Integer.parseInt(sc.nextLine());
				
				Calendar c = Calendar.getInstance();
				c.set(year, month-1, 1); // year - month(i-1) - 1일으로 초기화
				int day = c.get(Calendar.DAY_OF_WEEK); // 1일의 요일 => (1:일, ..., 7:토)
				int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); // month 마지막 날짜
				int date = c.get(Calendar.DAY_OF_MONTH); // 해당 날짜
				
				System.out.println();
				System.out.println("<< " + year + "년 " + month + "월 >>");
				System.out.println("일  월   화   수   목   금   토");
				for(int j = 1; j <= lastDay; j++) {
					c.set(year, month-1, j);
					day = c.get(Calendar.DAY_OF_WEEK);
					date = c.get(Calendar.DAY_OF_MONTH);
					
					if(date == 1) { // 해당 요일부터 달력이 시작해야 함
						for(int d = 1; d < day; d++){
							System.out.printf("%3s", "");
						}
						System.out.printf("%-3s", j);
					} else {						
						if(day == 1) { // 일요일이면, 한줄 띄움
							System.out.println();
							System.out.printf("%-3s", j);
						} else {
							System.out.printf("%-3s", j);						
						}
						
					}
					
				}
				System.out.println();
				
			} else {
				System.out.println("종료합니다.");				
				break;
			}
		}
			
		
	}
}
