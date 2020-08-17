package kr.ac.jinwoo.day12.homework.BoardHomework;

import java.util.Scanner;

public class Menu {

	boolean bLogin = false;
	Scanner sc = new Scanner(System.in);
	int cmd;
	UserUtil userUtil = new UserUtil();
	BoardUtil boardUtil = new BoardUtil();
	User user;
	
	public void execute() {
		
		while(true) {
			if(!bLogin)
				printLoginMenu();
			else 
				printBoardMenu();
			
			try {
				cmd = Integer.parseInt(sc.nextLine());
			}  catch(Exception NumberFormatException) {
				System.out.println("잘못 입력하셨습니다.\n");
				continue;
			}
			
			if(!bLogin) {
				if(cmd < 0 || 4 < cmd ) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
			}
			else {
				if(cmd < 0 || 8 < cmd ) {
					System.out.println("잘못 입력하셨습니다.\n");
					continue;
				}
			}
			System.out.println();
			
			if(!bLogin) {
				if(cmd == 1) {
					user = userUtil.login();
					if(user != null)
						bLogin = true;
				}
				else if(cmd == 2) {
					userUtil.signup();
				}
				else if(cmd == 3) {
					boardUtil.printAllBoard();
				}
				else if(cmd == 4) {
					boardUtil.printBoard();
				}
				else if(cmd == 0) {
					System.exit(0);
				}
			}
			else {
				if(cmd == 1) {
					boardUtil.printAllBoard();
				}
				else if(cmd == 2) {
					boardUtil.printMyBoard(user);
				}
				
				else if(cmd == 3) {
					boardUtil.printBoard();
				}
				else if(cmd == 4) {
					boardUtil.registration(user);
				}
				else if(cmd == 5) {
					boardUtil.modifyBoard(user);
				}
				else if(cmd == 6) {
					boardUtil.deleteBoard(user);
				}
				else if(cmd == 7) {
					user = userUtil.logout(user);
					if(user == null)
						bLogin = false;
				}
				else if(cmd == 8) {
					
					String deleteUserName = user.getId();
					
					user = userUtil.secession(user);
					if(user == null) {
						bLogin = false;
						boardUtil.deleteUserBoard(deleteUserName);
					}
						
				}
				else if(cmd == 0) {
					System.exit(0);
				}
			}
		}
	}
	
	public void printLoginMenu() {
		System.out.println("----------------------------------");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 전체 영화 게시물 조회");
		System.out.println("4. 글번호 조회");
		System.out.println("0. 종료");
		System.out.println("----------------------------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
	}
	
	public void printBoardMenu() {
		System.out.println("----------------------------------");
		System.out.println("1. 전체 영화 게시물 조회");
		System.out.println("2. 내가 등록한 영화 게시물 조회");
		System.out.println("3. 글번호 조회");
		System.out.println("4. 영화 게시물 등록");
		System.out.println("5. 영화 게시물 수정");
		System.out.println("6. 영화 게시물 삭제");
		System.out.println("7. 로그아웃");
		System.out.println("8. 회원탈퇴");
		System.out.println("0. 종료");
		System.out.println("----------------------------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
	}
	
}
