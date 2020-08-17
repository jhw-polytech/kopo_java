package exam0427;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {
	
	static Scanner sc;

	public void yourChoice() {
		System.out.println("선택하세요 (1. 특정년도, 2.특정월, 3.종료) => ");
		sc = new Scanner(System.in);
		int selectNum = sc.nextInt();
		
		if(selectNum == 1) {
			allCalendar();
		} else if (selectNum == 2) {
			monthCalendar();
		} else if (selectNum == 3) {
			sc.close();
		}
	}
	

	public void monthCalendar() {
		
		System.out.println("보고 싶은 특정 월을 입력하세요.");
		int selectMonth = sc.nextInt();
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int width = 7;
		String[][] dateFrame = new String[7][7];
		
		c.set(year, selectMonth - 1, 1);
		int startDay = c.get(Calendar.DAY_OF_WEEK); //시작 위치
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); //마지막일
		String[] dayKor = {"일","월","화","수","목","금","토"};
		//일-토 입력
		for(int k = 0; k < dayKor.length; k++) {
			dateFrame[0][k] = dayKor[k];
		}
		
		System.out.println("\n      <" + year + "년 " + selectMonth + "월>");
		
		//날짜 입력
		int row = 1;
		int inputDate = 1;
		for(int j = 1; inputDate <= lastDay; j++) {
			if (j < startDay) {
				dateFrame[row][j-1] = "";
			} else {
				dateFrame[row][(j-1)%width] = String.valueOf(inputDate);
				inputDate++;

				if(j % width == 0) {
					row++;
				}
			}	
		}
		for(int z = 0; z < width; z++) {
			System.out.printf("%5s",dateFrame[0][z]);
		}
		System.out.println();
		row = 1;
		for(int j = 1; j < lastDay + startDay; j++) {
			if (dateFrame[row][(j-1)%width] != null) {
				System.out.printf("%3s", dateFrame[row][(j-1)%width]);
			}
				
			if((j-1)%width == width-1) {
				System.out.println();
				row++;
			}
		}
		System.out.println();
		System.out.println();
		yourChoice();
	}


	public void allCalendar() {
		System.out.println("연도를 입력하세요.");
		int selectYear = sc.nextInt();
		Calendar c = Calendar.getInstance();
		int width = 7;
		String[][] dateFrame = new String[7][7];
		
		for (int i = 1; i <= 12; i++) {
			
			c.set(selectYear, i-1, 1);
			int startDay = c.get(Calendar.DAY_OF_WEEK); //시작 위치
			int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); //마지막일
			String[] dayKor = {"일","월","화","수","목","금","토"};
			//일-토 입력
			for(int k = 0; k < dayKor.length; k++) {
				dateFrame[0][k] = dayKor[k];
			}
			
			System.out.println("\n      <" + selectYear + "년 " + i + "월>");
			
			//날짜 입력
			int row = 1;
			int inputDate = 1;
			for(int j = 1; inputDate <= lastDay; j++) {
				if (j < startDay) {
					dateFrame[row][j-1] = "";
				} else {
					dateFrame[row][(j-1)%width] = String.valueOf(inputDate);
					inputDate++;
					
					if(j % width == 0) {
						row++;
					}
				}
			}
			for(int z = 0; z < width; z++) {
				System.out.printf("%5s",dateFrame[0][z]);
			}
			System.out.println();
			row = 1;
			for(int j = 1; j < lastDay + startDay; j++) {
				if (dateFrame[row][(j-1)%width] != null) {
					System.out.printf("%3s", dateFrame[row][(j-1)%width]);
				}
				
				if((j-1)%width == width-1) {
					System.out.println();
					row++;
				}
			}
			System.out.println();
		}

		System.out.println();
		yourChoice();
	}

}

