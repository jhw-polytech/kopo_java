package homework0427;

/*
 * 2060340017 신형재 과제 2번
 * 절차대로 코딩하다보니 불필요한 부분이 많은 것 같습니다.
 * 해당 코딩 방식을 객체지향으로 다시 구성해보겠습니다.
 * 
 * 달력에 0으로 표시되는 것을 공백으로 만들기 위해서
 * 별도로 배열 선언을 String으로도 해 보겠습니다.
 */

 /*
	배열에 날짜들을 인덱스에 맞추어 넣다니 기발한데요??? ㅎㅎㅎ
	재미있습니다~~~ userNum1(), userNum2()는 중복코드가 보이실거에요~~~
	나중에 고치실때 생각한번 해주세요~~
 */

import java.util.Scanner;
import java.util.Calendar;

public class CalendarSub {
	
	Scanner sc = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int user;
	int year;
	int month;
	int day;
	int[] dateArr = new int[40];
	int lastDay;
	
	public void start1(String msg) {
		System.out.print(msg);
	}
	
	public void start2() {
		user = sc.nextInt();
		sc.nextLine();
		if(user<1 || user>3) {
			System.out.println("1~3번 옵션을 선택해주세요.");
			execute();
		}
		if(user == 1) {
			userNum1();
			execute();
		}else if(user == 2) {
			userNum2();
			execute();
		}else {
			System.out.println("프로그램을 종료합니다.");
		}
	}
	public void userNum1() {
		System.out.print("특정 연도를 입력하세요 ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.println();
		for(int i = 1; i<=12; i++) {
			cal.set(year, i-1, 1);
			day = cal.get(Calendar.DAY_OF_WEEK); // 1(일요일)~7(토요일)
			
			lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 각 월의 최대일수 산출
			
			
			System.out.printf("<<< %d년 %d월 >>>\n", year, i);
			System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
			
			int k = 1;
			for(int j = day; j<=lastDay+day; j++) { // 해당 월의 최대 일자 확인할 것
				dateArr[j-1] = k;
				k++;

			}
			for(int g = 0; g<lastDay+day-1; g++) {
				System.out.print(dateArr[g] + "\t");
				if(g%7==6) {
					System.out.println();
				}
			}
			System.out.println();
			
			for(int y = 0; y<=lastDay+day; y++) {
				dateArr[y]= 0;
			}
			
		}
	}
	public void userNum2() {
		System.out.print("특정 연도를 입력하세요 ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.print("월을 입력하세요 ");
		month = sc.nextInt();
		sc.nextLine();
		System.out.println();
		cal.set(year, month-1, 1);
		day = cal.get(Calendar.DAY_OF_WEEK); // 1(일요일)~7(토요일)
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.printf("<<< %d년 %d월 >>>\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		int k = 1;
		for(int j = day; j<=lastDay+day; j++) { // 해당 월의 최대 일자 확인할 것
			dateArr[j-1] = k;
			k++;

		}
		for(int g = 0; g<lastDay+day-1; g++) {
			System.out.print(dateArr[g] + "\t");
			if(g%7==6) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void execute() {
		start1("선택 하세요 ( 1. 특정 연도, 2. 특정 월, 3. 종료 ) ==>");
		start2();
	}
}
