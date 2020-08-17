package kr.ac.kopo.day12.project02;

import java.util.Scanner;

public class AlgorithmController {

	private Scanner sc;
	private StackQueueUtil dataList;

	public AlgorithmController() {
		sc = new Scanner(System.in);
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public int getNum() {
		return Integer.parseInt(sc.nextLine());
	}

	public void execute() {
		print("<< 1) STACK 2) QUEUE 3) STACK & QUEUE 중에 선택하세요. >>");

		switch (getNum()) {
		case 1:
			executeStack();
			break;
		case 2:
			executeQueue();
			break;
		case 3:
			executeStackAndQueue();
			break;

		}

	}

	private void executeStack() {
		dataList = new StackQueueUtil();
		while (true) {
			print("    < STACK>\r\n" + 
					"   1. 데이터 입력\r\n" + 
					"   2. 데이터 삭제\r\n" + 
					"   3. 전체 데이터 출력( [0] ~ [size()-1]\r\n" + 
					"   4. 종료");
			switch(getNum()) {
				case 1:
					dataList.stackAdd();
					break;
				case 2:
					dataList.stackPop();
					break;
				case 3:
					dataList.print();
					break;
				case 4:
					System.exit(0);
			}
		}
	}

	private void executeQueue() {
		dataList = new StackQueueUtil();
		while (true) {
			print("    < QUEUE>\r\n" + 
					"   1. 데이터 입력\r\n" + 
					"   2. 데이터 삭제\r\n" + 
					"   3. 전체 데이터 출력\r\n" + 
					"   4. 종료");
			switch(getNum()) {
			case 1:
				dataList.queueAdd();
				break;
			case 2:
				dataList.queuePop();
				break;
			case 3:
				dataList.print();
				break;
			case 4:
				System.exit(0);
			}
		}
	}

	private void executeStackAndQueue() {
		dataList = new StackQueueUtil();
		while (true) {
			print("   1. STACK방식의 데이터 입력\r\n" + 
					"   2. STACK방식의 데이터 삭제\r\n" + 
					"   3. QUEUE방식의 데이터 입력\r\n" + 
					"   4. QUEUE방식의 데이터 삭제\r\n" + 
					"   5. 전체 데이터 출력\r\n" + 
					"   6. 종료");
			switch(getNum()) {
			case 1:
				dataList.stackAdd();
				break;
			case 2:
				dataList.stackPop();
				break;
			case 3:
				dataList.queueAdd();
				break;
			case 4:
				dataList.queuePop();
				break;
			case 5:
				dataList.print();
				break;
			case 6:
				System.exit(0);
			}
		}
	}

}
