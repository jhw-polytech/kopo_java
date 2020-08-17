package kr.co.hana.homework08;

import java.util.Scanner;

public class Answer {
	Scanner sc = new Scanner(System.in);

	void answer() {
		System.out.println("계속 진행할까요? (y/n)");
		String ans = sc.nextLine();
		if (ans.equalsIgnoreCase("y")) {
			Input input = new Input();
			input.getInput();
		} else {
			close();
		}
	}

	void close() {
		System.out.println("종료");
	}
}
