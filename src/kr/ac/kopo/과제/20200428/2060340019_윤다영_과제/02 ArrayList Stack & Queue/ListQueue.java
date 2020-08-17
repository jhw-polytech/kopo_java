package kr.ac.kopo.assignment.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ListQueue {
	
	private static ArrayList<String> list = new ArrayList<String>();

	public void push(String str) {
		list.add(str);
	}
	
	//First in First out 방식 - queue(줄)
	public void pop() {
		list.remove(0);
	}
	
	public void printList(){
		System.out.println(Arrays.toString(list.toArray()));
	}
	
}
