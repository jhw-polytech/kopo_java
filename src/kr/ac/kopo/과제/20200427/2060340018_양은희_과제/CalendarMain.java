package homework0427;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("선택하세요 (1. 특정년도   2. 특정월   3. 종료) => ");
		int num = sc.nextInt();
		sc.nextLine();
		if (num == 1) { // 특정년도를 선택하면
			inputYear(); // inputYear() 메소드 호출
		} else if (num == 2) { // 특정월을 선택하면
			inputMonth(); // inputMonth() 메소드 호출
		} else if (num == 3) {
			System.out.println("종료되었습니다.");
		} else {
			System.out.println("1,2,3의 숫자 중 선택해주세요.");
		}
	}

	public static void inputYear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		sc.nextLine();

		Calendar calYear = Calendar.getInstance(); // Calendar는 추상클래스이기 때문에 getInstance()를 통해 접근
		for (int month = 1; month < 13; month++) { // 1~12월까지 출력
			calYear.set(year, month - 1, 1); // 년,월,일 설정

			int week = calYear.get(Calendar.DAY_OF_WEEK) - 1; // 요일
			int lastDay = calYear.getActualMaximum(Calendar.DATE) + 1; // 마지막 날짜
			System.out.println();
			System.out.println("<<  " + year + "년 " + month + "월   >>");

			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for (int i = 0; i < week; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i < lastDay; i++) {
				System.out.print(i + "\t");
				if ((i + week) % 7 == 0) { // 주 바뀔 때 줄바꿈
					System.out.println();
				}
			}
		}
	}

	public static void inputMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		sc.nextLine();

		Calendar calMonth = Calendar.getInstance();
		calMonth.set(year, month - 1, 1);

		int week = calMonth.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDay = calMonth.getActualMaximum(Calendar.DATE) + 1;
		System.out.println("<<  " + year + "년 " + month + "월   >>");

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < week; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i < lastDay; i++) {
			System.out.print(i + "\t");
			if ((i + week) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
