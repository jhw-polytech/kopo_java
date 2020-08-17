package kr.ac.jinwoo.day12.homework.board1;

import java.util.Scanner;

public class Menu {

	BoardUtil boardUtil = new BoardUtil();
	Scanner sc = new Scanner(System.in);
	
	public void execute() {
		
		while(true) {
			
			printMenu();
			
			int cmd = inputCmd("메뉴 중 처리할 항목을 선택하세요 : ");
			
			System.out.println();
			
			if(cmd == 1)
				boardUtil.selectAll();
			
			else if(cmd == 2)
				boardUtil.selectData();
			
			else if(cmd == 3)
				boardUtil.insertData();
			
			else if(cmd == 4)
				boardUtil.updateData();
			
			else if(cmd == 5)
				boardUtil.deleteDate();
			
			else if(cmd == 0) {
				System.out.println("게시판 프로그램을 종료합니다.");
				System.exit(0);
			}
			else
				System.out.println("잘못 입력하셨습니다.");
			
		}
	}
	
	public int inputCmd(String msg) {
		
		int cmd = 0;
		
		while(true) {
			try {
				System.out.print(msg);
				cmd = Integer.parseInt(sc.nextLine());
				// 예외 안나면 break;
				break;
			}  
			catch(Exception NumberFormatException) {
				System.out.println("정수의 값이 아닙니다.\n");
			}
		}
		
		return cmd;
	}
	
	public String inputString(String msg) {
		
		System.out.print(msg);
		String str = sc.nextLine();
		
		return str;
	}
	
	private void printMenu() {
		
		System.out.println("1. 전체게시물 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글 등록");
		System.out.println("4. 글 수정");
		System.out.println("5. 글 삭제");
		System.out.println("0. 종료");
	}
}