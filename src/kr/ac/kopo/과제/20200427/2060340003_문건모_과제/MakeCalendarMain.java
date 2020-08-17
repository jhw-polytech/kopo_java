package test0427;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MakeCalendarMain {
	
	public static void main(String[] args) {
		
		
		MakeCalendar mc = new MakeCalendar();
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		while(input<3) {
			System.out.print("선택하세요(1.특정년도 2.특정월 3.종료)");
			input = sc.nextInt();
			sc.nextLine();
			
			if(input == 1) {
				System.out.print("년도를 입력하세요 : ");
				int year = sc.nextInt();
				sc.nextLine();
				
				mc.makeCal(year);
			}else if(input == 2) {
				System.out.print("년도를 입력하세요 : ");
				int year2 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("월을 입력하세요 : ");
				int month = sc.nextInt();
				sc.nextLine();
				
				mc.makeCalendarMonth(year2, month);
				
			}else {
				System.out.println("종료합니다");
				break;
			}
			
		}
		
		
	}

}
