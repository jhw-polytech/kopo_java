package kr.ac.kopo.day11.assignment;

import java.util.Scanner;

public class CalendarPrintMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalendarPrint cp = new CalendarPrint();
		int option = 1;		//while조건문을 만족하는 값으로 초기화
		
		
		//옵션1,2를 선택하면 반복문을 반복실행
		while(option == 1 | option == 2) {
			System.out.print("선택하세요(1.특정년도 2.특정월 3.종료) => ");
			option = sc.nextInt();
			sc.nextLine();
			
			if(option == 1) {
				cp.twelveMonths();
			}else {
				cp.oneMonth();
			}
		}
		//옵션3을 선택하면 입력을 끝낸다
		if(option == 3) {
			sc.close();
		}


	}
}