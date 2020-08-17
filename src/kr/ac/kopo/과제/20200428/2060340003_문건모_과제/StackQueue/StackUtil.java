package test0430;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackUtil {
	
	private int cnt;
	private Scanner sc;
	private List<String> list;
	
	public StackUtil() {
		list = new ArrayList<String>();
		sc = new Scanner(System.in);
		this.cnt = cnt;
	}
	
	public String stringStack() {
		
		String str = sc.nextLine();
		return str;
	}
	
	public List<String> getStackData() { //stack에 있는 push와 같은역할
		
		System.out.println("입력할 데이터 수를 적어주세요");
		cnt = sc.nextInt();
		sc.nextLine();
		System.out.println("데이터를 입력해주세요");
		
		for(int i = 0;i<cnt;i++) {
			list.add(stringStack()); 
		}
		
		return list;
	}
	
	
	public void removeStackData() { //stack에 있는 pop의 특성을 반영, 맨 마지막에 할당된 데이터부터 삭제
		
		
		for(int i = cnt-1;i>=0;i--) {
			System.out.println(list.get(i) + "를 삭제합니다");
			list.remove(i);
		}
		System.out.println();
		
	}
	
	public void printStackData() { //stack에 있는 pop의 역할, 맨 마지막에 할당된 데이터부터 반환한 후 삭제
				
		for(int i = cnt -1;i>=0;i--) {
			System.out.print(list.get(i) + " ");
			list.remove(i);
		}
		System.out.println();
		
	}
	

}
