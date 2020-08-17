package kr.ac.kopo.day12.homework.datastructure;

import java.util.Scanner;

public class DataStructureController {

	private Scanner sc;
	private MyQueue<String> que;
	private MyStack<String> st;

	public DataStructureController() {
		sc = new Scanner(System.in);
		que = new MyQueue<String>();
		st = new MyStack<String>();
	}

	public void execute() {
		while(true) {
			System.out.print("선택하세요\n1.STACK   2.QUEUE   3.종료 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice ==1 ) {
				choiceStack();
			}
			else if(choice ==2) {
				choiceQueue();
			}
			else if( choice ==3) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	private void choiceStack() {
		System.out.println("< STACK >");
		while(true) {
			menu();
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				System.out.print("데이터를 입력하세요 : ");
				st.add(sc.nextLine());
			}
			else if(choice == 2) {
				if(!st.pop()) {
					System.out.println("데이터가 없습니다");
				}
				else {
					System.out.println("데이터를 삭제했습니다");
				}
			}
			else if(choice == 3) {
				if(st.info()) {
				}
				else {
					System.out.println("데이터가 없습니다");
				}
			}
			else if(choice == 4) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다");
			}
		}
		
	}

	private void choiceQueue() {
		System.out.println("< QUEUE >");
		while(true) {
			menu();
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				System.out.print("데이터를 입력하세요 : ");
				que.add(sc.nextLine());
			}
			else if(choice == 2) {
				if(!que.poll()) {
					System.out.println("데이터가 없습니다");
				}
				else {
					System.out.println("데이터를 삭제했습니다");
				}
			}
			else if(choice == 3) {
				if(que.info()) {
				}
				else {
					System.out.println("데이터가 없습니다");
				}
			}
			else if(choice == 4) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다");
			}
		}
	}

	private void menu() {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 전체 데이터 출력");
		System.out.println("4. 이전메뉴");
	}
}
