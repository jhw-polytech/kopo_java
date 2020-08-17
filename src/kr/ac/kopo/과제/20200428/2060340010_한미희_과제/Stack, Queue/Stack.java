package kr.ac.kopo.day12.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack implements DataManipulation {
	
	ArrayList<String> list;
	Scanner sc;
	
	Stack(){
		list = new ArrayList<String>( );
		sc = new Scanner(System.in);
	}
	
	@Override
	public void push(String str) {
		list.add(str);
	}

	@Override
	public void pop() {
		list.remove(list.size()-1);
	}

	@Override
	public void lookUp() {
		System.out.println(list);
	}

	public void execute() {
		int option = 1;
		while(option != 4) {
			System.out.println("< STACK >\n1 데이터 입력\n2. 데이터 삭제\n3. 전체 데이터 출력\n\4. 종료");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
			option = sc.nextInt();
			sc.nextLine();	//정수 입력받고 버퍼 안 비워주면 에러 발생
			if(option == 1) {
				System.out.print("입력할 데이터 : ");
				String str = sc.nextLine();
				push(str);
			}else if(option == 2) {
				pop();
			}else if(option == 3) {
				lookUp();
			}
		}
		sc.close();
	}

}
