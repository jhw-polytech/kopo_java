package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueView {

	Scanner sc= new Scanner(System.in);
	private ArrayList<String> queue;
	QueueUtil qu = new QueueUtil();
	
	
	
	public void Viewer() {
		System.out.println("1.������ �Է�");
		System.out.println("2.������ ����");
		System.out.println("3.������ ���");
		System.out.println("4.����");
		
		while(true) {
			System.out.println("1~4���� �Է�");
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
				System.out.println("����˴ϴ�.");
				break;
			}
			
		}
		
	}
}
