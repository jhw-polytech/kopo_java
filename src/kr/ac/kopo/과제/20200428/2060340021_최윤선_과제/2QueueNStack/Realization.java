package homework12.QueueNStack;

import java.util.ArrayList;
import java.util.Scanner;

public class Realization {
	Realization() {
	}

	private String ipt;

	public void PushStack(ArrayList<String> stack) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("push하고 싶은 문자열 입력 : ");
		ipt = sc.nextLine();
		stack.add(ipt);
		RealizationView.top++;
		System.out.println("[ " + ipt + " 데이터가 입력됩니다. ]");
		// System.out.println("현재의 top : "+RealizationView.top);
	}

	public void PopStack(ArrayList<String> stack) {
		if (RealizationView.top == -1) {
			System.out.println("스택이 비어있습니다.");
		} 
		else {
			System.out.println("[ " + stack.get(RealizationView.top) + "데이터가 삭제됩니다. ]");
			stack.remove(RealizationView.top);
			RealizationView.top--;
			// System.out.println("현재의 top : "+RealizationView.top);
		}
	}

	public void seeAllStack(ArrayList<String> stack) {
		System.out.printf("stack 상태 : [");
		for (String a : stack) {
			System.out.printf(" %s ", a);
		}
		System.out.println("]");
	}

	public void enqueue(ArrayList<String> queue) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("enqueue하고 싶은 문자열 입력 : ");
		ipt = sc.nextLine();
		queue.add(ipt);
		RealizationView.rear++;
		System.out.println("[ " + ipt + " 데이터가 입력됩니다. ]");
	}

	public void dequeue(ArrayList<String> queue) {
		RealizationView.front++;
		System.out.println("[ " + queue.get(RealizationView.front) + "데이터가 삭제됩니다. ]");
		queue.set(RealizationView.front,"");
		System.out.printf("");
	}

	public void seeAllQueue(ArrayList<String> queue) {
		if (RealizationView.front == RealizationView.rear) {
			System.out.println("Queue가 비어있습니다.");
		} 
		else {
			System.out.printf("queue 상태 : [");
			for (String a : queue) {
				System.out.printf(" %s ", a);
			}
			System.out.println("]");
		}
	}

}
