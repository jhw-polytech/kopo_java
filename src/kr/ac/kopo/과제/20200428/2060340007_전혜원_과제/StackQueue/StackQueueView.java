package kr.ac.kopo.stackQueue;

import java.util.Scanner;

public class StackQueueView {

	boolean bool = true;
	private Scanner sc;
	Stack stack;
	Queue queue;

	public StackQueueView() {
		sc = new Scanner(System.in);
	}

	public void execute() {

		stack = new Stack();
		queue = new Queue();

		while (bool) {
			System.out.println("   1. STACK방식의 데이터 입력\r\n" + "   2. STACK방식의 데이터 삭제\r\n" + "   3. QUEUE방식의 데이터 입력\r\n"
					+ "   4. QUEUE방식의 데이터 삭제\r\n" + "   5. 전체 데이터 출력\r\n" + "   6. 종료");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				stack.pushData();
				break;
			case 2:
				stack.pullData();
				break;
			case 3:
				queue.pushData();
				break;
			case 4:
				queue.pullData();
				break;
			case 5:
				stack.showAllData();
				queue.showAllData();
				break;
			case 6:
				bool = false;
				break;
			}


		}
		sc.close();

	}
}
