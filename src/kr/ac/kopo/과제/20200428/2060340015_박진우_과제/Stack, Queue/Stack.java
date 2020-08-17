package kr.ac.jinwoo.day12.homework.StackQueue;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<String> dataArr = new ArrayList<String>();
	
	
	public void push(String data) {

		dataArr.add(data);
	}
	
	public String pop() {
		
		String str = null;
		
		if(!dataArr.isEmpty())
			str = dataArr.remove(dataArr.size()-1);
		
		return str;
	}
	
	public void print() {
		
		System.out.println("STACK\n");
		
		for(int i = dataArr.size()-1; i >= 0; i--) {
			System.out.printf("|   %3s    |\n", dataArr.get(i));
			System.out.println("------------");
		}
	
	}
}
