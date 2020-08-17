package shlee1993.day14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Modify {
	private Scanner sc;
	ArrayList<Post> boardList;

	public Modify() {}
	public Modify(ArrayList<Post> boardList) {
		this.boardList = boardList;
	}
	
	public ArrayList<Post> modPost() {
		System.out.println("수정을 원하는 번호 입력 : ");
		sc = new Scanner(System.in);
		int checkNum = Integer.parseInt(sc.nextLine());

		System.out.println("수정할 제목을 입력 : ");
		sc = new Scanner(System.in);
		String change = sc.nextLine();
		boardList.get(checkNum).setTitle(change);
		
		return boardList;
	}

}
