package kr.ac.kopo.day12.project02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackQueueUtil implements StackInterface, QueueInterface{

	private List<String> arrayList;
	private Scanner sc;
	
	public StackQueueUtil() {
		arrayList = new ArrayList<String>();
		sc = new Scanner(System.in);
	}

	public String getData() {
		System.out.print("데이터를 입력해주세요. :");
		return sc.nextLine();
	}

	public void print() {
		System.out.println(arrayList.toString());
	}
	@Override
	public void queuePop() {
		arrayList.remove(0);
	}

	@Override
	public void queueAdd() {
		arrayList.add(getData());
	}

	@Override
	public void stackPop() {
		arrayList.remove((arrayList.size()-1));	
	}

	@Override
	public void stackAdd() {
		arrayList.add(getData());
		
	}
}
