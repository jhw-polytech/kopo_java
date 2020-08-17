package kr.ac.kopo.day11.homework;

import java.util.Calendar;
import java.util.Scanner;

public class ElectronicCalendar {
	
	Scanner sc;
	Calendar c;

	public void Choice(){
		while(true) {
			int choice, year, mon;
			sc = new Scanner(System.in);
			
			System.out.print("선택하세요(1. 특정년도   2. 특정월   3. 종료) => ");
			choice = sc.nextInt();
	
			if(choice ==1) {
				System.out.print("년도를 입력하세요 : ");
				year = sc.nextInt();
				printYear(year);
			}
			else if(choice ==2) {
				System.out.print("년도를 입력하세요 : ");
				year = sc.nextInt();
				System.out.print("월을 입력하세요 : ");
				mon = sc.nextInt();
				
				printMon(year, mon);
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	public void printMon(int year,int mon) {
		
		String[] str = {"일","월","화","수","목","금","토"};
		c = Calendar.getInstance();	// 
		c.set(year, mon-1,1);	// 사용자가 입력한 해와 달로 설정
		System.out.println("\t\t<< "+year+"년 "+mon+"월 >>");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){	// 첫째날의 요일까지 공백문자를 넣어서 달력처럼 출력하게함
			System.out.print("\t");
		}
		for(int i=c.getActualMinimum(Calendar.DAY_OF_MONTH); i<=c.getActualMaximum(Calendar.DAY_OF_MONTH);i++) {
			// 설정한 Calendar 월의 최소일 부터 최대일 까지 i값을 증가시킴
			System.out.printf("%2d\t",i);
			if(i!=c.getActualMaximum(Calendar.DAY_OF_MONTH) &&
					(i + c.get(Calendar.DAY_OF_WEEK) -1 ) % 7 ==0) { // 토요일 일때 줄바꿈
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public void printYear(int year) {
		for(int i=1;i<=12;i++) {
			printMon(year,i);
		}
	}
}