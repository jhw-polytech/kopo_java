package kr.ac.kopo.day12.homework.StackQue;

import java.util.ArrayList;
import java.util.List;

public class Stk<T> {
	
	private List<T> stack;
	
	// 제너릭을 이용하여 들어온 타입으로 list를 생성 
	Stk() {
		stack = new ArrayList<>();
	}
	// Top 데이터 입력 
	public void push(T input) {
		stack.add(input);
		System.out.println("push" + stack.get(stack.size()-1) + "완료!");
	}
	// Top 데이터 추출 
	public T pop() {
		return stack.remove(stack.size()-1);
	}
	// Top 데이터 보기 
	public T peek() {
		return stack.get(stack.size()-1);
	}
	// 데이터 유무 
	public boolean empty() {
		return stack.size() == 0;
	}
	// 데이터의 인덱스 반환 
	public int search(T input) {
		return stack.indexOf(input);
	}
	
}
