package kr.ac.kopo.assignment.day12;

import java.util.Scanner;

public class ListUtil {
	
	private Scanner sc;
	private ListView view;
	private boolean loopCheck = true;
	
	public ListUtil() {
		sc = new Scanner(System.in);
		view = new ListView();
	}
	
	public void execute() {
		
		int select = view.menuSelect();
				
		if(select == 1) {
			while(loopCheck) {
				this.Stack();				
			}
		}else if(select == 2) {
			while(loopCheck) {
				this.Queue();
			}
		}else System.out.println("1, 2 중 하나를 선택하세요.");
		
	}
	
	public boolean Stack() {
		
		ListStack stack = new ListStack();
		
		int selectStack = view.PrintListMenu("STACK");
		
		switch(selectStack) {
			case 1 : System.out.print("추가할 문자열을 입력하세요 : ");
					 String input = sc.nextLine();
					 stack.push(input);
				break;
			case 2 : stack.pop();
			         System.out.println("데이터를 삭제했습니다.");
				break;
			case 3 : stack.printList();
				break;
			case 4 : System.out.println("프로그램을 종료합니다.");
					 loopCheck = false;
				break;
			default : System.out.println("[ERROR]1~4 중 하나를 입력하세요.");
				break;		
		}
		
		return loopCheck;
	}
	
	public void Queue() {
		
		ListQueue queue = new ListQueue();
		
		int selectQueue = view.PrintListMenu("QUEUE");
				
		switch(selectQueue) {
		case 1 : System.out.print("추가할 문자열을 입력하세요 : ");
		 	 	 String input = sc.nextLine();
		 		 queue.push(input);
			break;
		case 2 : queue.pop();
				 System.out.println("데이터를 삭제했습니다.");
			break;
		case 3 : queue.printList();
			break;
		case 4 : System.out.println("프로그램을 종료합니다.");
				 loopCheck = false;
			break;
		default : System.out.println("[ERROR]1~4 중 하나를 입력하세요.");
			break;
		
	}

}
}
