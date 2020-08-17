package kr.co.hana.homework12.Board;

import java.util.Scanner;

public class BoardView {
	static void controller() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 관리 프로그램");
		System.out.println("-----------------------");
		System.out.println("1. 전체게시물 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		boolean flag = false;

		for (;;) {
			int num = sc.nextInt();
			BoardUtill bu = new BoardUtill();
			switch (num) {
			case 1:
				bu.list();
				controller();
				break;
			case 2:
				bu.num();
				controller();
				break;
			case 3:
				bu.add();
				controller();
				break;
			case 4:
				bu.modify();
				controller();
				break;
			case 5:
				bu.delete();
				controller();
				break;
			case 0:
				flag = true;
				break;
			default:
				System.out.println("0~5 사이의 숫자를 입력하세요.");
				controller();
				break;
			}
			if(flag == true) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}
}
