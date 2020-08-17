package jaeheehomework;

import java.util.Calendar;
import java.util.Scanner;

public class Calander {

	Calendar cal = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	
	int num;
	int year;
	int month;
	
	//선택
	public void choose() {
		System.out.print("선택하세요(1. 특정년도   2. 특정월   3. 종료) => ");
		num = Integer.parseInt(sc.nextLine());
	}
	
	//특정 년 월 선택
	public void chooseMonth(){
		
		System.out.print("년도를 입력하세요 : ");
		year = Integer.parseInt(sc.nextLine());
		
		if(num == 2) {
			System.out.print("월을 입력하세요 : ");
			month = Integer.parseInt(sc.nextLine());
			//사용자가 지정한 년도, 월의 첫째날로 날짜 세팅
			cal.set(year, month-1, 1);
		}
	}
	
	//특정 월
	public void monthCal() {
		
		// 첫날, 마지막날, 공백포함한 배열
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int finalDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int[] calArr = new int[finalDay + firstDay - 1];
	
		// 공백은 0으로 바꾸고, 시작일 부터 1,2,3, ..., claArr.length일까지 대입
		int cnt = 1;
		for(int i = 0; i < calArr.length; i++) {
			if(i < firstDay-1) {
				calArr[i] = 0;
			} else if(i >= firstDay-1) {
				calArr[i] = cnt++ ;
			}
		}
		
		System.out.printf("<<%d년 %d월>>\n", year, month);
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "일", "월", "화", "수", "목", "금", "토");
		for(int i =0; i < calArr.length; i++) {
			if(calArr[i] == 0) {
				System.out.printf("%s\t", " ");
			} else if(i % 7 == 6) {
				System.out.printf("%d\n", calArr[i]);
			} else {
				System.out.printf("%d\t", calArr[i]);
			}
		}
		System.out.println();
	}
	
	//특정 년도
	public void yearCal() {
		
		for(int i = 0; i < 12; i++) {
			//시작 월을 loop 돌림
			month = i+1; // 프린트 할때 1~12월 출력되게 하기 위한 작업
			cal.set(year, month-1, 1);
			monthCal();
		}
	}
	
	//합치기
	public void playCal() {
		while (true) {
			
			choose();
			if(num == 3) {
				break;
			}
			
			chooseMonth();
			if (num == 1) {
				yearCal();
			} else {
				monthCal();
			} 
			
		}
	}
}
