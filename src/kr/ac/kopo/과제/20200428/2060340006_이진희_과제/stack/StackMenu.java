package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class StackMenu {
	void setMenu() {
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("========[스택]========");
			System.out.println("1.데이터 입력");
			System.out.println("2.데이터 삭제");
			System.out.println("3.전체 데이터 출력([0] ~ [size()-1]");
			System.out.println("4.종료");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("데이터를 입력하세요 : ");
				String data = scan.next();
				stack.pushback(data);
			}else if(sel == 2) {
				String pop = stack.pop();
				System.out.println(pop + "을 삭제합니다.");
				
			}else if(sel == 3) {
				stack.printStack();
			}else if(sel == 4) {
				break;
			}
			
		}
		
	}
}
