package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {

		StackList sl = new StackList();

		boolean run = true;
		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("<STACK>");
			System.out.println("숫자를 입력하세요.");
			System.out.println("1. 데이터 입력, 2. 데이터 삭제, 3. 전체 데이터 출력, 4. 종료");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("데이터 입력");
				String data = sc.nextLine();
				sl.push(data);
				break;

			case 2:
				sl.pop();
				break;

			case 3:
				sl.print();
				break;

			case 4:
				run = false;
			}
		}
	}

	public void excute() {
		
		
	}
}