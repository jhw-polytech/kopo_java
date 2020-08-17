package kr.ac.kopo.day11.homework;

import java.util.Calendar;
import java.util.Scanner;

public class CalanderUtil {

	private Scanner sc;
	private int year;
	private int month;
	private Calendar c;

	public CalanderUtil() {
		sc = new Scanner(System.in);
	}

	public CalanderUtil(int year, int month) {
		this.year = year;
		this.month = month;
	}

	
	
	// 프로그램을 진행하는 메소드
	public void execute() {

		loop: while (true) {
			System.out.println("선택하세요. (1. 특정년도   2. 특정월   3. 종료) =>");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("년도를 입력하세요: ");
				year = sc.nextInt();
				sc.nextLine();
				printAllMonths(year);
				break;

			case 2:
				System.out.println("년도를 입력하세요: ");
				year = sc.nextInt();
				sc.nextLine();
				System.out.println("월을 입력하세요: ");
				month = sc.nextInt();
				sc.nextLine();
				printOneMonth(year, month);
				break;

			case 3:
				System.out.println("달력 프로그램을 종료합니다 . . .");
				break loop;
			}
		}

	}

	
	// 특정 연도의 모든 월을 출력하는 메소드
	public void printAllMonths(int year) {

		c = Calendar.getInstance();

		c.set(Calendar.YEAR, year);

		for (int i = 1; i <= 12; i++) {

			c.set(Calendar.MONTH, i - 1);

			System.out.println("<<  "+ year + "년  " + i + "월  >>");
			System.out.printf("일   월   화   수   목   금   토 \n");

			c.set(year, i - 1, 1);

			int lastDay = c.getActualMaximum(Calendar.DATE);
			int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

			for (int j = 1; j <= lastDay; j++) {

				System.out.printf("%-3s", j);

				if (dayOfWeek % 7 == 0) {
					System.out.println();
				}

				dayOfWeek++;
			}
			System.out.println();
		}

	}

	
	// 특정 연도와 특정 월을 출력하는 메소드
	public void printOneMonth(int year, int month) {

		c = Calendar.getInstance();

		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);

		int lastDay = c.getActualMaximum(Calendar.DATE);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		System.out.println("<<  "+ year + "년  " + month + "월  >>");
		for (int i = 1; i <= lastDay; i++) {

			System.out.printf("%-3s", i);

			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}

			dayOfWeek++;
		}

		System.out.println();

	}


}
