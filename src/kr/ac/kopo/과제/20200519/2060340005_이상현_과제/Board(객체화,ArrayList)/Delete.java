package shlee1993.day14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
	private Scanner sc;
	ArrayList<Post> boardList;

	public Delete() {}
	public Delete(ArrayList<Post> boardList) {
		this.boardList = boardList;
	}
	
	public ArrayList<Post> deletePost() {
		System.out.println("삭제를 원하는 번호 입력 : ");
		sc = new Scanner(System.in);
		int checkNum = Integer.parseInt(sc.nextLine());

		boardList.remove(checkNum);
		
		return boardList;
	}
}
