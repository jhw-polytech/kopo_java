package exam0428.ListStackQueue;

import java.util.ArrayList;
import java.util.List;

public class StackAndQueue {

	public List<String> queue = new ArrayList<String>();
	public List<String> stack = new ArrayList<String>();
	private int loc = -1;
	private int front = 0;
	private int rear = -1;

	public void enqueue(String str) {
		queue.add(str);
		rear += 1;
	}
	
	public void dequeue() {
		
		if(rear == -1) {
			System.out.println("큐가 비어있어 dequeue가 불가능합니다.");
		} else {
			System.out.println("pop된 값 : " + queue.get(front));
			queue.remove(front);
			rear -= 1;
		}
	}

	public void push(String str) {
		stack.add(str);
		loc += 1;
	}

	public void pop() {
		if (loc == -1) {
			System.out.println("스택이 비어있어 pop할 수 없습니다.");
		} else {
			System.out.println("pop된 값 : " + stack.get(loc));
			stack.remove(loc);
			loc -= 1;
		}
	}

	public void clearStack() {
		stack.clear();
		loc = -1;
		
	}
	
	public void clearQueue() {
		queue.clear();
		rear = -1;
	}

	public void stackPrint() {
		for(String str : stack) {
			System.out.print(str + "  ");
		}
		System.out.println();	
	}

	public void queuePrint() {
		for(String str : queue) {
			System.out.print(str + "  ");
		}
		System.out.println();	
	}

}
