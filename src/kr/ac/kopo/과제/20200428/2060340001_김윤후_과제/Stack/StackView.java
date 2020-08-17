package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StackView {

	Scanner sc= new Scanner(System.in);
	private ArrayList<String> sta;
	StackUtil su = new StackUtil();
	
	
	
	public void sViewer() {
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 삭제");
		System.out.println("3.데이터 출력");
		System.out.println("4.종료");
		
		while(true) {
			System.out.println("1~4사이 입력");
			int num=sc.nextInt();
			switch(num) {
			case 1:
				su.pushStack(su.sta);
				break;
	
			case 2:
				su.popStack(su.sta);
				break;
				
			case 3:
				su.stackView(su.sta);
				break;
				
			}
			if(num==4) {
				System.out.println("종료됩니다.");
				break;
			}
			
		}
		
	}
}
