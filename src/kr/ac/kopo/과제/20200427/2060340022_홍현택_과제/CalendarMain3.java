package kr.co.hana.homework11;

import java.util.Scanner;

// 배열 이용하려고 이것저것 찾아보다가 시간 너무 오래 걸려서 일단 제출합니다 ㅠ

public class CalendarMain3 {
	public static void main(String[] args) {

		int year;
		int month;

		Scanner sc = new Scanner(System.in);
		System.out.print("선택하세요 (1.특정년도  2.특정일  3.종료)");
		int select = sc.nextInt();
		sc.nextLine();

		if (select == 1) {
			System.out.println("년도를 입력하세요 : ");
			year = sc.nextInt();
//			Calendar3 cal = new Calendar3(year, month);
//			cal.printCal();
		} else if (select == 2) {
			System.out.println("년도를 입력하세요 : ");
			year = sc.nextInt();
			System.out.println("월을 입력하시오");
			month = sc.nextInt();
			sc.nextLine();
			Calendar3 cal = new Calendar3(year, month);
			cal.printCal();
		} else if (select == 3) {
			System.out.println("종료");
		}
	}

}
