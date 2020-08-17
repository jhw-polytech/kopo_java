package exam0428.ListStackQueue;

import java.util.Scanner;

public class Structure {

	private int selectNum;
	private Scanner sc = new Scanner(System.in);
	private String str;
	
	Structure() {
	}
	public void start() {

		StackAndQueue saq = new StackAndQueue();
		
		while(true) {
			System.out.println("원하는 것을 선택하세요. (종료하려면  9 입력)");
			System.out.println("============Stack============");
			System.out.println("1.입력, 2.삭제, 3.출력, 4. 전체 삭제\n");
			System.out.println("============Queue============");
			System.out.println("5. 입력, 6.삭제, 7.출력, 8.전체 삭제");
			selectNum = Integer.parseInt(sc.nextLine());
			
			switch(selectNum) {
			case 1: 
				System.out.println("String값 입력 : ");
				str = sc.nextLine();
				saq.push(str);
				break;
			case 2:
				saq.pop();
				break;
			case 3:
				saq.stackPrint();
				break;
			case 4:
				saq.clearStack();
				break;
			case 5:
				System.out.println("String값 입력 : ");
				str = sc.nextLine();
				saq.enqueue(str);
				break;
			case 6:
				saq.dequeue();
				break;
			case 7:
				saq.queuePrint();
				break;
			case 8:
				saq.clearQueue();
				break;
			case 9:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}
}
