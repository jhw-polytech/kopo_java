package shlee1993.day12.homework;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<String> list;
	private int idx;

	public Stack() {
		list = new ArrayList<>();
		idx = 0;
	}

	public void push(String str) {
		idx++;
		list.add(str);
	}

	public void pop() {
		if (list.isEmpty()) {
			System.out.println("empty");
		} else {
			idx--;
			list.remove(idx);
		}
	}

	public void info() {
		if (list.isEmpty()) {
			System.out.println("empty");
		} else
			System.out.println(list.toString());
	}
}
