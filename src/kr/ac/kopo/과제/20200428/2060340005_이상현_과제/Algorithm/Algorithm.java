package shlee1993.day12.homework;

import java.util.Scanner;

public class Algorithm {
	Scanner sc;
	private Stack stack;
	private Queue queue;

	public void exe() {
		System.out.print("1.STACK 2.QUEUE\n");

		sc = new Scanner(System.in);
		int select = Integer.parseInt(sc.nextLine());

		switch (select) {
		case 1:
			stack = new Stack();
			stack: while (true) {
				System.out.println("<STACK>\n1.push stack\n2.pop stack\n3.전체 데이터 출력\n4.종료");
				sc = new Scanner(System.in);
				int selectS = Integer.parseInt(sc.nextLine());

				switch (selectS) {
				case 1:
					System.out.println("입력하고 싶은 데이터 : ");
					sc = new Scanner(System.in);
					String str = sc.nextLine();
					stack.push(str);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					System.out.println("<전체 데이터 출력>");
					stack.info();
					break;
				default:
					break stack;
				}
			}
			break;

		case 2:
			queue = new Queue();
			queue: while (true) {

				System.out.println("<QUEUE>\n1.enqueue\n2.dequeue\n3.전체 데이터 출력\n4.종료");
				sc = new Scanner(System.in);
				int selectQ = Integer.parseInt(sc.nextLine());

				switch (selectQ) {
				case 1:
					System.out.println("입력하고 싶은 데이터 : ");
					sc = new Scanner(System.in);
					String str = sc.nextLine();
					queue.enqueue(str);
					break;
				case 2:
					queue.dequeue();
					break;
				case 3:
					System.out.println("<전체 데이터 출력>");
					queue.info();
					break;
				default:
					break queue;
				}
			}
			break;

		default:
			break;
		}
	}
}
