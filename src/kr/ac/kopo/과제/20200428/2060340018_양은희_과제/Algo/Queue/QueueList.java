package algo;

import java.util.ArrayList;

public class QueueList {

	ArrayList<String> arr2 = new ArrayList<String>();

	public void enqueue(String data) {
		arr2.add(data);
	}

	public void dequeue() {
		if (arr2.size() == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
		}
		System.out.println(arr2.remove(arr2.size() - 1));
	}
	
	public void print() {
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
	}
}
