package shlee1993.day11.homework;

import java.util.Calendar;

public class CalendarView {

// 입력받은 년도, 월의 달력을 출력하는 메소드
	public void view(int year, int month) {
		Calendar calendar = Calendar.getInstance();	//Calendar은 new대신 getInstance사용(추상클래스)
		calendar.set(year, month - 1, 1);	//인덱스 0에 1월이 들어가 있으므로 3월일 때 2번 인덱스를 구해야한다. 그러므로 -1을 해줌
		int cnt = 0;	//개행을 위한 변수

		System.out.printf("\t\t  << %d 년  %d 월 >>\n", year, month);
		System.out.printf("%2s\t%2s\t%2s\t%2s\t%2s\t%2s\t%2s\t\n", "일", "월", "화", "수", "목", "금", "토");

		for (int i= 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {	//달력 정렬을 위한 공백 (시작 요일 전까지 공백)
			System.out.print("  \t");
			cnt++;	//한칸을 찍을 때마다 cnt를 증가시켜 7이 쌓이면 개행
		}

		int endDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	//getActualMaximum로 마지막 일을 저장
		for (int i = 1; i <= endDay; i++) {	//일 출력하기
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%2d\t", day);
			cnt++;	//한칸을 찍을 때마다 cnt를 증가시켜 7이 쌓이면 개행
			day++;	//일수 증가
			
			calendar.set(year, month - 1, day); // 마찬가지로 달에 -1을 해줌, 증가시킨 일로 set캘린더

			if (cnt % 7 == 0)	//cnt가 7의 배수(일주일)마다 개행
				System.out.println();
		}
		System.out.println();
	}

	public void view(int year) { // 전체를 입력할 때는 1~12월까지 메소드를 12번 진행
		for (int i = 1; i <= 12; i++) {
			view(year, i);
			System.out.println();
		}
	}
}