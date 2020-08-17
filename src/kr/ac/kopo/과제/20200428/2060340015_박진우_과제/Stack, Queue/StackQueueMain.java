package kr.ac.jinwoo.day12.homework.StackQueue;

public class StackQueueMain {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		System.out.println("Push [ a, b, c, d, e] in Stack\n");
		stack.print();
		System.out.println();
		String str = stack.pop();
		System.out.println("Popped data : " + str + "\n");
		stack.print();
		
		System.out.println();
		
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		queue.enqueue("e");
		
		System.out.println("Enqueue [ a, b, c, d, e] in Queue\n");
		queue.print();
		System.out.println();
		str = queue.dequeue();
		System.out.println("Dequeued data : " + str + "\n");
		queue.print();
	}
}
