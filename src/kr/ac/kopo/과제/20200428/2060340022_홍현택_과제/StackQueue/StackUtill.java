package kr.co.hana.homework12.Structure;

import java.util.Scanner;
import java.util.ArrayList;

public class StackUtill {
	private String item;
	static int top = -1;

	Scanner sc = new Scanner(System.in);
	static ArrayList<String> stack = new ArrayList<String>();

	// Stack에 데이터 입력
	public void push(ArrayList<String> stack) {
		System.out.print("데이터를 입력하세요 : ");
		item = sc.next();
		stack.add(item);
		top++;
		System.out.println(top +"입력된 데이터 : " + item);
	}

	// Stack 가장 위의 데이터 제거
	public void pop(ArrayList<String> stack) {
		if (top == -1) {
			System.out.println("스택이 비어있습니다");
		} else {
			System.out.println(stack.get(top) + " 데이터 삭제합니다");
			stack.remove(top);
			top--;
		}
	}

	// 데이터 조회

	public void stackList(ArrayList<String> stack) {
		System.out.println("<스택 데이터 리스트>");
		for (String data : stack) {
			System.out.println(data);
		}
		System.out.println();
	}

}
