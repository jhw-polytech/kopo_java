package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {
	List<String> stack = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);

	void pushback(String data) {

		stack.add(data);
	}

	String pop() {
		String data = "";
		if (stack.size() > 0) {
			data = stack.get(stack.size() - 1);

			stack.remove(stack.get(stack.size() - 1));

		}
		return data;

	}

	void printStack() {
		for (int i = 0; i < stack.size(); i++) {
			System.out.println("[" + (i + 1) + "]" + stack.get(i));
		}
	}

}
