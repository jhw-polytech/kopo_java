package kr.ac.kopo.day11.project02;

import java.util.Calendar;

public class AutoCalendar {
		static Calendar calendar;
		
		
		public static void yearly(int year) {
			for(int i=1; i<=12; i++) {
				monthly(year,i);
			}
		}
			
		public static void monthly(int year,int month) {
			
			//                1   2   3    4   5    6   7  
			String[] week = {"일","월","화","수","목","금","토"}; 
			
			calendar = Calendar.getInstance();	 
			calendar.set(year, month-1, 1); // month는 0:1~11:12
			
			System.out.println("\t\t<< "+year+"년 "+month+"월 >>");
			
			// 요일 출력
			for(int i=0; i < week.length; i++) {
				System.out.printf("%2s\t", week[i]);
			}
			System.out.println();
			
			// 2020년 4월 기준인 경우, 수요일(4)이 첫 날인 경우, 
			// i=0; i < (4-1); i++  0, 1, 2 -> 앞의 3번에 공백을 추가해준다. 
			for(int i=0; i < calendar.get(Calendar.DAY_OF_WEEK)-1; i++) {
				System.out.print("\t");
			}
			
			int days = calendar.get(Calendar.DAY_OF_WEEK);
			// 해당 달의 첫 날부터 마지막 날까지 출력하는데,
			for(int i=calendar.getActualMinimum(Calendar.DAY_OF_MONTH); 
					i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
					i++) {
				
				System.out.printf("%2d\t",i);
				
				// 다음 개행을 위한 조건은 다음과 같다.
				// 조건:
				// 1. calendar.getActualMaximum(Calendar.DAY_OF_MONTH) 해당 달의 마지막 날이 아니고,
				// 2. 그 달을 시작한 요일을 기준으로 %7했을때 나머지가 0이 되면 토요일이므로,개행을 추가해준다.
				if (i != calendar.getActualMaximum(Calendar.DAY_OF_MONTH) &&
						days % 7 == 0) {
					System.out.println();
				}
				days++;
			}
			
			System.out.print("\n\n");
		}
}
