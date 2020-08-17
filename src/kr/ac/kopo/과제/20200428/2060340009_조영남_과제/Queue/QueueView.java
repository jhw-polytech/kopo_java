package kr.ac.yeongnam.day12.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueueView {

	private Scanner sc;
	private List<String> queue;
	
	QueueView(){
		queue = new ArrayList<>();
	}
	
	public void start() {
		int num = 0;
		
		while(num != 4) {
			
			num = select();
			switch(num) {
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				printAll();
				break;
			case 4:
				System.out.println("종료합니다.");
			}
		}		
	}
	
	public int select() {
		sc = new Scanner(System.in);
		
		System.out.println("< QUEUE >");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 전체 데이터 출력");
		System.out.println("4. 종료");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	public void push() {
		System.out.print("데이터를 입력해주세요 : ");
		String input = sc.nextLine();
		queue.add(input);		
	}
	
	public void pop() {
		System.out.println("데이터를 삭제합니다.");
		System.out.println("삭제된 데이터 : " + queue.remove(0));
	}
	public void printAll() {
		System.out.println("전체 데이터를 출력합니다.");
		for(String str : queue) {
			System.out.println(str + " ");
		}		
		System.out.println();
	}
}
