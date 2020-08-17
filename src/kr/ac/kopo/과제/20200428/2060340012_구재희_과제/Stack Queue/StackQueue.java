package jaeheehomework;

import java.util.ArrayList;
import java.util.Scanner;

public class StackQueue {
	
	ArrayList<String> arrList = new ArrayList<>();
	Scanner sc;
	int num;
	
	//입력(stack과 queue가 같은 방식)
	public void push(String str) {
		arrList.add(str);
	}
	
	//stack 삭제(가장 나중에 들어온 것을 삭제)
	public void stackPop() {
		arrList.remove(arrList.size()-1);
	}
	
	//queue 삭제(가장 처음에 들어온 것을 삭제)
	public void queuePop() {
		arrList.remove(0);
	}
	
	
	//전체 데이터 출력
	public void printAll() {
		if(arrList.size() == 0) {
			System.out.println("비어있습니다.");
		} else {
			for(int i = 0; i < arrList.size(); i++) {
				System.out.printf("[%s] ", arrList.get(i));
			}
		}
		System.out.println();
	}
	
	
	
	//open
	public void open() {
		while(true) {
			try {
				sc = new Scanner(System.in);
				System.out.println( "\n 1. STACK방식의 데이터 입력\n" +
                        " 2. STACK방식의 데이터 삭제\n" +
			            " 3. QUEUE방식의 데이터 입력\n" +
                        " 4. QUEUE방식의 데이터 삭제\n" +
			            " 5. 전체 데이터 출력\n" +
                        " 6. 종료\n" +
			            " ********선택하세요********");
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("정확한 숫자를 입력하시오!");
				sc = new Scanner(System.in);
			}
		}
	}
	
	//play
	public void play() {
		while(num != 6) {
			open();
			
			switch(num) {
			case 1:
			case 3:
				System.out.println("문자를 입력하세요");
				String str = sc.nextLine();
				push(str);
				break;
			case 2:
				if(arrList.size() == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
				} else {
					stackPop();
				}
				break;
			case 4:
				if(arrList.size() == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
				} else {
					queuePop();
				}
				break;
			case 5:
				printAll();
				break;
			case 6:
				System.out.println("종료");
				break;
			}
			
				
		}
	}

}

