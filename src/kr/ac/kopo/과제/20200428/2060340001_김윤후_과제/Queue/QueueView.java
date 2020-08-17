package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueView {

	Scanner sc= new Scanner(System.in);
	private ArrayList<String> queue;
	QueueUtil qu = new QueueUtil();
	
	
	
	public void Viewer() {
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 삭제");
		System.out.println("3.데이터 출력");
		System.out.println("4.종료");
		
		while(true) {
			System.out.println("1~4사이 입력");
			int num=sc.nextInt();
			switch(num) {
			case 1:
				qu.pushQueue(qu.que);
				break;
	
			case 2:
				qu.popQueue(qu.que);
				break;
				
			case 3:
				qu.queueView(qu.que);
				break;
				
			}
			if(num==4) {
				System.out.println("종료됩니다.");
				break;
			}
			
		}
		
	}
}
