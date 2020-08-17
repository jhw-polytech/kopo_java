package Assignmnet11;

import java.util.Calendar;
import java.util.Scanner;

public class Day {

	Scanner sc =new Scanner(System.in);
	int Sel;
	int Year;
	int Month;
	int Day;
	Calendar c= Calendar.getInstance();
	
	
	Day(){
	}
	
	
	void Start() {
		System.out.print("선택하세요 (1.특정년도 2.특정일 3.종료)");
		Sel=sc.nextInt();
		sc.nextLine();
		
		if(Sel==1) {
			Year();
			
		}
		else if(Sel==2) {
			Month();
		}
		else if(Sel==3) {
			System.out.println("끝났습니다.");
		}
	}
	
//	int Year() {	
//			System.out.println("년도를 입력하세요");
//			Year=sc.nextInt();
//			sc.nextLine();
//			Start();
//			return Year;
//	}
//	
//	int Month() {
//		System.out.println("월을 입력하세요");
//		Month=sc.nextInt();
//		sc.nextLine();
//		
//		return Month;
//	}
//	
	
	void Year() {
		System.out.println("년도를 입력하세요");
		Year=sc.nextInt();
		sc.nextLine();
			
		c.set(Calendar.YEAR,Year);
		for(int i=1; i<=12; i++) {
		
		c.set(Calendar.MONTH,i-1);
				
		System.out.println(Year+"년"+i+"월");
		System.out.println("   일     월     화     수     목     금     토");
		
		c.set(Year, i-1, 1);
		
		int end=c.getActualMaximum(Calendar.DATE);
		int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);
		
		for(int j=1; j<=end; j++) {
			if(j==1) {
				for(int k=1; k<dayOfWeek;k++) {
					System.out.print("    ");
				}
			}
			if (j<10) {
				System.out.print(" ");
			}
			System.out.print(" " +j+ " ");
			if(dayOfWeek%7==0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println();
	}
	Start();	
	
	}
	
	
	void Month() {
		System.out.println("년도를 입력하세요");
		Year=sc.nextInt();
		sc.nextLine();
		
		System.out.println("월을 입력하시오");
		Month=sc.nextInt();
		sc.nextLine();
		
		c.set(Calendar.YEAR,Year);
		c.set(Calendar.MONTH,Month-1);
			
			System.out.println(Year+"년"+Month+"월");
			System.out.println("   일     월     화     수     목     금     토");
			
			c.set(Year, Month-1, 1);
			
			int end=c.getActualMaximum(Calendar.DATE);
			int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);
			
			for(int j=1; j<=end; j++) {
				if(j==1) {
					for(int k=1; k<dayOfWeek;k++) {
						System.out.print("    ");
					}
				}
				if (j<10) {
					System.out.print(" ");
				}
				System.out.print(" " +j+ " ");
				if(dayOfWeek%7==0) {
					System.out.println();
				}
				dayOfWeek++;
			}
			System.out.println();
			Start();	
		
		
	}	
	
}
