package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
	
	public static List<Post> users;

	public final static int MAX_SIZE = 100;
	private BoardUtil util;
	private Scanner sc;
	public static int rows = 0;

	public Board() {
		sc = new Scanner(System.in);
		util = new BoardUtil();
	}

	public int getNum(String msg) {

		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public void open() {
		while(true) {
			menu();
			int choice = getNum("메뉴 중 처리할 항목을 선택하세요 : ");
			if(choice == 1) {
				util.select();
			}
			else if(choice ==2) {
				int num = getNum("몇번 게시물을 조회하시겠습니까? : ");
				util.select(num);
			}
			else if(choice == 3) {
				
				util.insert();
			}
			else if(choice == 4) {
				int num = getNum("몇번 게시물을 수정하시겠습니까? : ");
				util.update(num);
			}
			else if (choice ==5) {
				int num = getNum("몇번 게시물을 삭제하시겠습니까? : ");
				util.delete(num);
			}
			else if (choice == 0) {
				System.out.println("종료합니다");
				FileExecute.save();
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다");
			}
		}
	}

	public void menu() {
		System.out.println("=============================");
		System.out.println("1. 전체게시물 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.println("=============================");
	}

}
