package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StackView {

	Scanner sc= new Scanner(System.in);
	private ArrayList<String> sta;
	StackUtil su = new StackUtil();
	
	
	
	public void sViewer() {
		System.out.println("1.������ �Է�");
		System.out.println("2.������ ����");
		System.out.println("3.������ ���");
		System.out.println("4.����");
		
		while(true) {
			System.out.println("1~4���� �Է�");
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
				System.out.println("����˴ϴ�.");
				break;
			}
			
		}
		
	}
}
