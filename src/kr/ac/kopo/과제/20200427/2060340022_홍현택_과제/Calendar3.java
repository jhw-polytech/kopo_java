package kr.co.hana.homework11;

import java.util.*;

/*
	남들과느 다른 2차원배열을 사용하다니~~ ^^
	이것도 재미있네요..
	중간중간 예외가 발생했을거 같은데~~~
	고생하셨습니다
*/

public class Calendar3 {

	Calendar cal = Calendar.getInstance();

	private String[] calHeader = { "일", "월", "화", "수", "목", "금", "토" };

	private String[][] calDate = new String[6][7];

	private int width = calHeader.length; // 배열 가로 넓이
	private int startDay; // 월 시작 요일
	private int lastDay; // 월 마지막 날짜
	private int inputDate = 1; // 입력 날짜

	

	public Calendar3(int year, int month) {

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);

		startDay = cal.get(Calendar.DAY_OF_WEEK); // 월 시작 요일
		lastDay = cal.getActualMaximum(Calendar.DATE); // 월 마지막 날짜

		// 2차 배열에 날짜 입력
		int row = 0;
		for (int i = 1; inputDate <= lastDay; i++) {

			// 시작 요일이 오기전에는 공백 대입
			if (i < startDay)
				calDate[row][i - 1] = "";
			else {
				// 날짜 배열에 입력
				calDate[row][(i - 1) % width] = Integer.toString(inputDate);
				inputDate++;

				// 가로 마지막 열에 오면 행 바꿈
				if (i % width == 0)
					row++;
			}
		}
	}

	// 달력 출력
	public void printCal() {

		// 달력 헤더 출력 "일월화수목금토"
		for (int i = 0; i < width; i++) {
			System.out.print(calHeader[i] + " ");
		}
		System.out.println();

		// 날짜 배열 출력
		int row = 0;
		for (int j = 1; j < lastDay + startDay; j++) {

			System.out.print(calDate[row][(j - 1) % width] + " ");

			if ((j - 1) % width == width - 1) {
				System.out.println();
				row++;
			}

		}
	}

}
