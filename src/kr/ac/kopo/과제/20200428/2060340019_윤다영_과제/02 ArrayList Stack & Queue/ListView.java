package kr.ac.kopo.assignment.day12;

import java.util.Scanner;

public class ListView {
	
	private Scanner sc;
	
	public ListView() {
		sc = new Scanner(System.in);
	}
	
	public int menuSelect() {
		
		System.out.print("어떤 방식으로 데이터를 입력하시겠습니까?(1.STACK 2.QUEUE)");
		int select = sc.nextInt();
		sc.nextLine();
		
		return select;
		
	}
	
	public int PrintListMenu(String str) {
		
		System.out.println("<" + str + "방식입니다>");
		System.out.println("원하는 항목을 선택하세요.");
		System.out.println("1.데이터 입력 \n2.데이터 삭제\n3.전체 데이터 출력\n4.종료");
		int select = sc.nextInt();
		sc.nextLine();
		
		return select;	
		
	}
	
	

}
