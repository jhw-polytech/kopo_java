package Test01;

import java.util.Scanner;

public class BoardController {
	
	static Board[] boardlist = new Board[100];
	static int count = 0;
	private Scanner sc;
	private BoardUtil util;
	
	public BoardController() {
		sc = new Scanner(System.in);
		util = new BoardUtil();
	}
	
	public void execute() {
	loop : while(true) {
		
		System.out.println("---------------------");
		System.out.println("1.전체게시물 조회");
		System.out.println("2.글번호 조회");
		System.out.println("3.글등록");
		System.out.println("4.글수정");
		System.out.println("5.글삭제");
		System.out.println("0.종료");
		System.out.println("---------------------");
		
		int choice = sc.nextInt();
		sc.hasNextLine();
		
		switch(choice) {
		case 1 :
			util.wholeBoard();
			break;
		case 2 :
			util.searchBoard();
			break;
		case 3 :
			util.post();
			break;
		case 4 :
			util.adjust();
			break;
		case 5 :
			util.delete();
			break;
		case 0 :
			break loop;
		}
		
	}
  }
}