package shlee1993.day14.homework;

import java.util.Scanner;

public class BoardController {
	private Board board = new Board();
	private Scanner scNum;
	
	public void exe() {
		branch: while (true) {
			System.out.println("1.전체 게시물 조회\n2.글 번호로 조회\n3.글등록\n4.글수정\n5.글삭제\n0.종료");
			scNum = new Scanner(System.in);
			int select = Integer.parseInt(scNum.nextLine());

			switch (select) {
			case 1:
				board.checkAllPost();
				break;
			case 2:
				board.checkPost();
				break;
			case 3:
				board.createPost();
				break;
			case 4:
				board.modPost();
				break;
			case 5:
				board.deletePost();
				break;
			default:
				break branch;
			}
		}
	scNum.close();
	}
}
