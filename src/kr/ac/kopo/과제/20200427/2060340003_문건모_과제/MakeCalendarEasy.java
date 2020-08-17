package test0427;

import java.util.Calendar;

public class MakeCalendarEasy {
	
	Calendar c = Calendar.getInstance();
	
	/*
	 * 앞서서 첫 번째 메소드를 만들고나서 두 번째 메소드를 만들었을 때, 두번째 메소드를 먼저 만들었으면 이를 활용해서 
	 * 첫 번째 메소드를 만들 수 있다는 것을 깨달았습니다.
	 * 좀 더 간단한 형태의 달력 만드는 클래스입니다.
	  ==> 흐흐~ 그렇죠??? month가 12개 보여서 year가 되니깐요~~ 잘하셨어요
	 */
	
	public void makeCal(int year) {
		
		for(int i = 0;i<12;i++) {
			makeCalendarMonth(year, i+1);
		}
	}
	
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
