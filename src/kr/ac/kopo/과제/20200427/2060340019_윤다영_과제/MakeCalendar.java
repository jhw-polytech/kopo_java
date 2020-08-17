package kr.ac.kopo.assignment.day11;

import java.util.Calendar;
import java.util.Scanner;

public class MakeCalendar {
	
	private Scanner sc;
	private Calendar c;
	private int year, month; 
	private final String[] DAY_ARR = {"", "일", "월", "화", "수", "목", "금", "토"};
	
	//기본 생성자
	public MakeCalendar() {
		c = Calendar.getInstance();	
		sc = new Scanner(System.in);
	}
	
	//년도 입력
	public void inputYear() {
		System.out.print("년도를 입력하세요 : ");
		this.year = sc.nextInt();
		sc.nextLine();
		
	}
	
	//월 입력
	public void inputYearMonth() {
		this.inputYear();
		System.out.print("월을 입력하세요 : ");
		this.month = sc.nextInt();
		sc.nextLine();		
	}
	
	
	//월 단위의 달력을 하나 출력
	public void printCalendarByMonth(int year, int month) {
		
		c.set(year, month-1, 1);	
		
		int firstDay = c.get(Calendar.DAY_OF_WEEK);	      //첫째날 무슨 요일인지 찾기
		int lastDay = c.getActualMaximum(Calendar.DATE);  //마지막날 무슨 날인지 찾기
		
//		확인
//		System.out.println("시작 요일" + DAY_ARR[firstDay]);
//		System.out.println("마지막날" + lastDay);
				
		System.out.printf("-------------------<< %d년 %d월 >>-------------------\n", year, month);
		//일 월 화 수 목 금 토	출력
		for(int i = 1; i < DAY_ARR.length; i++) {
			System.out.printf("%s\t", DAY_ARR[i]);
		}
		System.out.println();
		//공백 출력
		for(int i = 1; i < firstDay; i++) {
			System.out.printf("%s\t", " ");
		}
		//1부터 날짜 출력
		for(int i = 1; i <= lastDay; i++) {
			System.out.printf("%d\t", i);
			if(firstDay % 7 == 0) {
				System.out.println();
			}
			firstDay++;
		}
		
	}
	
	//년 단위의 캘린더 출력
	public void printCalendarByYear(int year) {
		
		for(int i = 1; i <= 12; i++) {
			printCalendarByMonth(year, i);
			System.out.println();
		}
	}
	
	
	//실행 메소드
	public void execute() {
		
		int selectNum = 1;
		
		while(selectNum >= 1 && selectNum <= 3) {
			System.out.println("<< 원하는 메뉴를 선택하세요(1.특정년도  2.특정월  3.종료) >>");
			selectNum = sc.nextInt();
			sc.nextLine();
			
			if(selectNum == 1) {
				inputYear();
				printCalendarByYear(year);
				System.out.println();
				System.out.println();
			}else if(selectNum == 2) {
				inputYearMonth();
				printCalendarByMonth(year, month);
				System.out.println();
				System.out.println();
			}else if(selectNum == 3){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
	
	

}
