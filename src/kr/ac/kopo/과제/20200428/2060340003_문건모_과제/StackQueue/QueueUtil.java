package test0430;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QueueUtil {
	
	private Scanner sc;
	private List<String> list;
	private int size;
	
	public QueueUtil() {
		sc = new Scanner(System.in);
		list = new ArrayList<>();
		this.size = size;
	}
	
	public String stringQueue() {
		
		String str = sc.nextLine();
		return str;
	}
	
	public List<String> getQueueData(){ //Queue에서 add의 역할
		
		System.out.println("입력할 데이터 수를 적어주세요");
		size = sc.nextInt();
		sc.nextLine();
		System.out.println("데이터를 입력해주세요");
		
		for(int i = 0;i<size;i++) {
			list.add(stringQueue());
		}
		
		return list;
	}
	
	public void removeQueueData() {
		
		int cnt = 0;
		while(cnt<size) {
			System.out.println(list.get(0) + "를 삭제합니다");
			list.remove(0);
			cnt++;
		}
		System.out.println();
	}
	
	public void printQueueData() { //Queue에서 poll의 역할
		
		int cnt = 0;
		while(cnt<size) {
			System.out.print(list.get(0) + " ");
			list.remove(0);
			cnt++;
		}
		System.out.println();
	}
	
	

}
