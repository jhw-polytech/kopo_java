package algo;

import java.util.ArrayList;
import java.util.Scanner;


	class StackList {
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		public void push(String data) {
			arr.add(data);
		}

		public void pop() {
			if (arr.size() == 0) {
				System.out.println("삭제할 데이터가 없습니다.");
			}
			System.out.println(arr.remove(arr.size() - 1));
		}

		public void print() {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}
	}

