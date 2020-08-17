package kr.ac.kopo.assignment.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ListStack {
	
	private static ArrayList<String> list = new ArrayList<String>();
	
	public void push(String str) {
		list.add(str);		
	}
	
	//Last in First out 방식 stack
	public void pop() {
		int arrLength = list.size();
		list.remove(arrLength-1);
		
	}
	
	public void printList() {
		System.out.println(Arrays.toString(list.toArray()));
		
	}

}
