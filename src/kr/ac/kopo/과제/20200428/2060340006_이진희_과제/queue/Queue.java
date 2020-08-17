package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue {
	List<String> queue = new ArrayList<String>();
	void enQueue(String data) {
		queue.add(data);
	}
	void deQueue() {
		 if(queue.size() > 0) {
			 // 큐는 맨처음 값이 삭제된다.  
			 queue.remove(queue.get(0));
		 }
	}
	void printQueue() {
		for(int i = 0; i < queue.size(); i++) {
			System.out.println("[" + (i+1) + "]" + queue.get(i));
		}
	}
	
	
}
