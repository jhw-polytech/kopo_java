package homework12.QueueNStack;

import java.util.ArrayList;
import java.util.Scanner;

public class RealizationView {
	
	private ArrayList<String> stack;
	private ArrayList<String> queue;
	private int ipt1;
	static int top=-1; // stack은 비어있을 시 -1임
	static int rear=-1; //front와 rear를 -1로 초기화하여 큐가 empty임을 나타낸다.
	static int front=-1; 
	
	
	
	RealizationView(){
		stack = new ArrayList<String>();
		queue = new ArrayList<String>();
	}


	public void execute() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		loop: while (true) {
			System.out.printf("\n원하는것을 선택하세요\n");
			System.out.println("1. STACK방식의 데이터 입력");
			System.out.println("2. STACK방식의 데이터 삭제");
			System.out.println("3. STACK방식의 데이터 출력");
			System.out.println("4. QUEUE방식의 데이터 입력");
			System.out.println("5. QUEUE방식의 데이터 삭제");
			System.out.println("6. QUEUE방식의 데이터 출력");
			System.out.println("7. 종료");
			ipt1 = sc.nextInt();
			sc.nextLine();

			Realization real = new Realization();

			switch (ipt1) {
			case 1:
				real.PushStack(stack);
				break;
			case 2:
				real.PopStack(stack);
				break;
			case 3:
				real.seeAllStack(stack);
				break;
			case 4:
				real.enqueue(queue);
				break;
			case 5:
				real.dequeue(queue);
				break;
			case 6:
				real.seeAllQueue(queue);
				break;
			case 7:
				break loop;
			}
		}
	}

}
