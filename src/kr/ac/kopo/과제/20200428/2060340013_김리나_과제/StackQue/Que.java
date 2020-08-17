package kr.ac.kopo.day12.homework.StackQue;

import java.util.ArrayList;
import java.util.List;

public class Que<T> {

	private List<T> queue;
	
	Que() {
		queue = new ArrayList<>();
	}
	// 데이터 입력 
	public boolean add(T input) {
		try {
			queue.add(input);
		} catch(IllegalStateException ise) {
			ise.printStackTrace(); // queue의 add함수는 queue가 꽉찼을경우 예외를 발생시킨다. 
		}
		System.out.println("add " + queue.get(queue.size()-1) + "성공! ");
		return true;
	}
	// 맨 앞 데이터 보기 
	public T element() {
		return queue.get(0);
	}
	// 데이터 입력 
	public boolean offer(T input) {
		return queue.add(input);
	}
	// 맨 앞 데이터를 조회하고 null일경우 null을 반환 
	public T peek() {
		return (queue.get(0) != null ? queue.get(0) : null);
	}
	// 맨 앞 데이터를 반환 및 삭제하고 null일 경우 null을 반환 
	public T poll() {
		return (queue.get(0) != null ? queue.remove(0) : null);
	}
	// 데이터 삭제 
	public void remove() {
		System.out.println("remove 완료!");
		queue.remove(0);
	}
}
