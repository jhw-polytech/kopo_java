package kr.co.hana.homework12.Structure;

import java.util.Scanner;
import java.util.ArrayList;

public class QueueUtill {
	private String item;
	static int front = -1;

	Scanner sc = new Scanner(System.in);
	static ArrayList<String> queue = new ArrayList<String>();

	// Queue에 데이터 입력
	public void insert(ArrayList<String> queue) {
		System.out.println("데이터를 입력하세요 : ");
		item = sc.nextLine();
		queue.add(item);
		front++;
		System.out.println(front + " 입력된 데이터 :" + item);
	}

	// Queue에 데이터 제거
	public void remove(ArrayList<String> queue) {
		if (front == -1) {
			System.out.println("큐가 비어있습니다.");
		} else {
			System.out.println(queue.get(0) + " 데이터 삭제합니다.");
			queue.remove(0);
			front--;
		}
	}

	// Queue 데이터 조회
	public void queueList(ArrayList<String> queue) {
		System.out.println("<큐 데이터 리스트>");
		for( String data : queue) {
			System.out.println(data);
		}
		System.out.println();
	}
}






