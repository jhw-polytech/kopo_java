package kr.ac.jinwoo.day11.homework;

import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선택하세요 (1. 특정년도    2. 특정월    3. 종료) => ");
		
		int cmd = Integer.parseInt(sc.nextLine());
		
		int aYear, aMonth;
		
		if(cmd == 1) {
			System.out.print("년도를 입력하세요 : ");
			aYear = Integer.parseInt(sc.nextLine());
			
			CalendarHomework.printOneYearCalendar(aYear);
		}
		else if(cmd == 2) {
			System.out.print("년도를 입력하세요 : ");
			aYear = Integer.parseInt(sc.nextLine());
			System.out.print("월을 입력하세요 : ");
			aMonth = Integer.parseInt(sc.nextLine());
			
			CalendarHomework.printOneMonthCalendar(aYear, aMonth);
		}
	}
}
