package shlee1993.day14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	private ArrayList<Post> boardList;
	Scanner sc;

	public Board() {
		boardList = new ArrayList<>();
		boardList.add(null);	//인덱스 값 0번지를 비워둠
	}

	public void checkAllPost() {
		Check check = new Check(boardList);
		check.checkAllPost();
	}

	public void checkPost() {
		Check check = new Check(boardList);
		check.checkPost();
	}

	public void createPost() {
		Create create = new Create(boardList);
		boardList = create.createPost();
	}

	public void modPost() {
		Modify modify = new Modify(boardList);
		boardList = modify.modPost();
	}

	public void deletePost() {
		Delete delete = new Delete(boardList);
		boardList = delete.deletePost();
	}

}
