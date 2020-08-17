package kr.ac.kopo.day12.homework.datastructure;

import java.util.LinkedList;
import java.util.List;

public class MyStack<T>{
	
	private List<T> list;
	private int size;
	
	public MyStack(){
		list = new LinkedList<T>();
		size =0;
	}
	
	public void add(T str) {
		size++;
		list.add(str);
	}
	
	public boolean pop() {
		if(list.isEmpty()) {
			return false;
		}
		list.remove(--size);
		return true;
	}
	
	public boolean info() {
		if(list.isEmpty()) {
			return false;
		}
		System.out.println(list.toString());
		return true;
	}

}
