package shlee1993.day14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Create {
	private Scanner sc;
	ArrayList<Post> boardList;

	public Create() {}
	public Create(ArrayList<Post> boardList) {
		this.boardList = boardList;
	}
	
	public ArrayList<Post> createPost() {
		System.out.println("제목을 입력 : ");
		sc = new Scanner(System.in);
		String title = sc.nextLine();

		System.out.println("작성자를 입력 : ");
		sc = new Scanner(System.in);
		String writer = sc.nextLine();

		boardList.add(new Post(title, writer));
		return boardList;
	}
}
