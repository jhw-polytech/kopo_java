

import java.util.Scanner;

public class BoardController {

	private Scanner sc;
	private Board board;

	public BoardController() {
		sc = new Scanner(System.in);
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public String getStr() {
		return sc.nextLine();
	} 
	
	public int getNum() {
		return Integer.parseInt(sc.nextLine());
	}

	public void execute() {
		board = new Board();
		while(true) {
			print("1. 전체게시물 조회   \r\n" + 
					"2. 글번호 조회   \r\n" + 
					"3. 글등록   \r\n" + 
					"4. 글수정   \r\n" + 
					"5. 글삭제   \r\n" + 
					"0. 종료     ");
			switch (getNum()) {
			case 1:
				board.getAllPosts();
				break;
			case 2:
				board.getPost();
				break;
			case 3:
				board.write();
				break;
			case 4:
				board.modify();
				break;
			case 5:
				board.delete();
				break;
			case 0:
				print("프로그램을 종료합니다.");
				System.exit(0);
			}
			
		}
	}
	
}
