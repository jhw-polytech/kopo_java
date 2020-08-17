package kr.ac.kopo.day11.assignment;

import java.util.Scanner;
import java.util.Calendar;

public class CalendarPrint {

	Scanner sc = new Scanner(System.in);
	Calendar c = Calendar.getInstance();
	int year;
	int month;
	
	
	//옵션1 특정 년도 선택 시 출력되는 메소드
	public void twelveMonths() {
		System.out.print("년도를 입력하세요: ");
		year = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= 12; i++) {
			printMonth(year, i);
		}
	}
	
	
	//옵션2 특정 월 선택 시 출력되는 메소드
	public void oneMonth() {
		System.out.println("년도를 입력하세요: ");
		year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("월을 입력하세요: ");	
		month = sc.nextInt();
		sc.nextLine();
		
		printMonth(year, month);
	}
	
	
	//특정 년도의 특정 월을 출력하는 메소드
	public void printMonth(int year, int month) {
		//달의 처음 시작 요일
		c.set(year, month-1, 1);
		int day = c.get(Calendar.DAY_OF_WEEK);	//1 ~ 7
		
		//달의 마지막 날
		int date = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//제목 출력하는 메소드 호출
		titlePrint(year, month);
		
		//일별로 저장할 수 있는 배열 생성. 
		//단, 배열의 길이는 첫 날이 시작하기 전 필요한 공백을 포함해서 설정
		int[] dateArr = new int[date+(day-1)];
		
		//한 주 단위로 출력하기
		for(int i = 0; i < dateArr.length; i++) {
			//처음 시작하는 날짜를 (day-1)인텍스부터 넣어준다
			//(day-1) 이전 인덱스의 경우 공백을 출력
			if (i < day-1) {
				System.out.printf("%-3.5s", "");
			}
			//배열 원소의 값은 이전 원소보다 1씩 증가
			//단, day-1 == 0일 경우, ArrayIndexOutOfBoundsException발생
			//=> i == day-1 인 경우를 따로 나눠 시작 인덱스를 정해주는 게 좋다
			else if (i == day-1) {
				dateArr[i] = 1;
				System.out.printf("%-3d", dateArr[i]);
			}else {	
				dateArr[i] = dateArr[i-1] + 1;	
				System.out.printf("%-3d", dateArr[i]);
			}
			//한 주를 출력하면 Enter, 배열의 인덱스는 0부터 시작하므로 나머지는 0이 아닌 6
			if(i % 7 == 6) {
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println();
	}
	
	
	/*
		미희씨 %5.5s는 뭐에요?????? .은 원래 소수점 이하자리수를 의미하거든요....
	*/

	//제목 출력하는 메소드
	public void titlePrint(int year, int month) {
		System.out.println("<< " + year + "년 " + month + "월 >>");
		System.out.printf("%-5.5s%-5.5s%-5.5s%-5.5s%-5.5s%-5.5s%-5.5s\n", "일", "월", "화", "수", "목", "금", "토");
	}
	
	
}
