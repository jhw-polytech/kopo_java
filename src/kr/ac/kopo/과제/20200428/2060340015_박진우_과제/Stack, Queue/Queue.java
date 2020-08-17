package kr.ac.jinwoo.day12.homework.StackQueue;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	private List<String> dataArr = new ArrayList<String>();
	
	public void enqueue(String data) {

		dataArr.add(data);
	}
	
	public String dequeue() {
		
		String str = null;
		
		if(!dataArr.isEmpty())
			str = dataArr.remove(0);
		
		return str;
	}
	
	public void print() {
		
		System.out.println("QUEUE\n");
		
		System.out.println("     in     \n");
		for(int i = dataArr.size()-1; i >= 0; i--) {
			
			System.out.printf("|  %3s    |\n", dataArr.get(i));
			if(i != 0)
				System.out.println("-----------");
		}
		System.out.println("\n     out     \n");
	
	}
}
