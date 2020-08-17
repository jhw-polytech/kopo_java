
import java.util.Scanner;

/*과제2> 
선택하세요 (1.특정년도 2.특정월  3.종료)=>1
년도를 입력하세요:2020
<<2020년 1월>>
일 월 화 수 목 금 토 
            1  2   3   4
5  6 
<<2020년 2월>>
<<2020년 12월>>
선택하세요 (1.특정년도 2.특정월  3.종료)=>2
년도를 입력하세요:2020
월을 입력하세요:1
<<2020년 1월>>
일 월 화 수 목 금 토 
            1  2   3   4
5  6 
선택하세요 (1.특정년도 2.특정월  3.종료)=>3
*/
public class CalendarMain{
	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			int year=0;
			int month =1;
			
			System.out.println("1.특정년도 2.특정월 3.종료");
			int num = sc.nextInt();
			
		if(num==1) {
			
			System.out.println("년도를 입력하세요:");
			year= sc.nextInt();
			while(month<=12) {
		    System.out.println();
			System.out.print("<<"+year+"년"+month+"월>>");
		    System.out.println();
	     
		CalendarTest c = new CalendarTest(year, month);
		c.find();
		c.display();	
		month++;}
		}    
		
		else  if(num==2) {
			
			System.out.println("년도를 입력하세요:");
		    year=sc.nextInt();
			System.out.println("월을 입력하세요:");
		    month=sc.nextInt();
		    System.out.println();
		    System.out.println("<<"+year+"년"+month+"월>>");
		  
		    CalendarTest c = new CalendarTest(year, month);
			c.find();
			c.display();	
				   
		 }
		else{ System.out.println("종료");

	    }
	
	}
 }