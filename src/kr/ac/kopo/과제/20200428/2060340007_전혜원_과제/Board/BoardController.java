package kr.ac.kopo.boardVer1;

import java.util.Scanner;

public class BoardController {
	
	private Scanner sc;
	private BoardUtil util;
	
	
	BoardController() {
		
		sc = new Scanner(System.in);
		util = new BoardUtil();
		
	}	
	

	// 게시판 기능메뉴 출력
	public void boardMenus() {
		
		System.out.println("-----------------------------");
		System.out.println("메뉴 중 처리할 항목을 선택하세요 : ");
		System.out.println("1. 전체게시물 조회   \r\n" + 
				"2. 글번호 조회   \r\n" + 
				"3. 글등록   \r\n" + 
				"4. 글수정   \r\n" + 
				"5. 글삭제   \r\n" + 
				"0. 종료  ");
		System.out.println("-----------------------------");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		executeBoard(choice);
	}
	
	
	// 게시판 기능 수행
	public void executeBoard(int choice) {
		
		
		switch(choice) {
		case 1:
			util.showAllPostings();
			boardMenus();
			break;
		case 2:
			util.getIndexOfPosting();
			boardMenus();
			break;
		case 3:
			util.uploadPosting();
			boardMenus();
			break;
		case 4:
			util.editPosting();
			boardMenus();
			break;
		case 5:
			util.deletePosting();
			boardMenus();
		case 6:
			util.exit();
			break;
		}
		
	}
	

}
