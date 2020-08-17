package shlee1993.day12.homework;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	private List<String> list;
	private int idx;

	public Queue() {
		list = new ArrayList<>();
		idx = 0;
	}

	public void enqueue(String str) {
		idx++;
		list.add(str);
	}

	public void dequeue() {
		if (list.isEmpty())
			System.out.println("empty");
		else {
			list.remove(0);
			idx--;
		}
	}

	public void info() {
		if (list.isEmpty())
			System.out.println("empty");
		else
			System.out.println(list.toString());
	}
}
