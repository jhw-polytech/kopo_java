package kr.ac.jinwoo.day11.homework;

import java.util.Calendar;

public class CalendarHomework {

	private static Calendar calendar = Calendar.getInstance();
	
	private static int date, day, lastDay;
	
	// 입력받은 년도, 월의 달력을 출력하는 메소드
	public static void printOneMonthCalendar(int aYear, int aMonth) {
		
		aMonth = aMonth-1;
		
		calendar.set(aYear, aMonth, 1);
		
		date = calendar.get(Calendar.DATE);
		day = calendar.get(Calendar.DAY_OF_WEEK);
		lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("\n<< " + aYear + "년 " + (aMonth+1) + "월 >>");
		System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-7s\n", "일", "월", "화", "수", "목", "금", "토");
		
		day = calendar.get(Calendar.DAY_OF_WEEK);
		
		// 1일이 찍히기 전까지 공백을 출력하는 반복문
		for(int j = 1; j < day; j++)
			System.out.printf("%-4s", " ");		
		
		// 날짜 출력하는 반복문. 매주 토요일을 출력 후 줄바꿈.
		for(int j = 1; j <= lastDay; j++) {
			if(date < 10)
				System.out.printf(" %-2d ", date);	
			else
				System.out.printf("%-3d ", date);
			
			calendar.set(aYear, aMonth , date +=1);
			
			day = calendar.get(Calendar.DAY_OF_WEEK);
			if(day == 1)
				System.out.println();
		}
		System.out.println();
	}
	
	// 입력받은 년도의 달력을 전부 출력하는 메소드
	public static void printOneYearCalendar(int aYear) {
		
		for(int i = 1; i <= 12; i++)
			printOneMonthCalendar(aYear, i);
		
	}
}
