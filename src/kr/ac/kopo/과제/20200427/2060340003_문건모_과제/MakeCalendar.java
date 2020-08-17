package test0427;

import java.util.Arrays;
import java.util.Calendar;

public class MakeCalendar {
	
	Calendar c = Calendar.getInstance();
	
	/**
	 * 달력을 만드는 메소드(1월 ~ 12월)
	 * @param year 원하는 년도 입력
	 */
	public void makeCal(int year) {
		
		
		String[] strArr = {"일","월","화","수","목","금","토"};
		
		
		for(int i = 1;i<=12;i++) {
			System.out.println("<<" + year + "년 " + i +"월>>");
			for(String str : strArr) {
				System.out.print(str + '\t');
			}
			System.out.println();
			
			int month = i-1;
			
			c.set(year, month, 1);
			int start = c.get(Calendar.DAY_OF_WEEK);
			int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			int[] dateArr = new int[lastDay];
			for(int j = 0;j<dateArr.length;j++) {
				dateArr[j] =j+1;
			}
			
			for(int k = 1;k<start;k++) {
				System.out.print('\t');
				}
			
			int cnt = 0;
			int loc = start;
			while(cnt<dateArr.length) {
				
			
				
				System.out.print(dateArr[cnt]+"\t");
				loc++;
				cnt++;
				
				if(loc%7 == 1) {
					System.out.println();
				}
			}
				
			System.out.println();	
				
			
		}
		
	}
	
	
	
	
	/**
	 * 원하는 년도와 월의 달력을 만드는 메소드
	 * @param year 원하는 년도 입력
	 * @param month 원하는 월 입력
	 */
	public void makeCalendarMonth(int year, int month) {
		
		String[] strArr = {"일","월","화","수","목","금","토"};
		System.out.println("<<" + year + "년 " + month +"월>>");
		
		 for(String str : strArr) {
			System.out.print(str + '\t');
		 }
		System.out.println();
		
		
		c.set(year, month-1, 1);
		int start = c.get(Calendar.DAY_OF_WEEK);
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int[] dateArr = new int[lastDay];
		for(int j = 0;j<dateArr.length;j++) {
			dateArr[j] =j+1;
		}
		
		for(int k = 1;k<start;k++) {
			System.out.print('\t');
		}
		
		int cnt = 0;
		int loc = start;
		while(cnt<dateArr.length) {
			
			System.out.print(dateArr[cnt]+"\t");
			loc++;
			cnt++;
			
			if(loc%7 == 1) {
				System.out.println();
			}
		}
		
		System.out.println();	
	}
	
}
		
		
			
				
				
				
			
			
				
				
				
			
			
	
	
	


