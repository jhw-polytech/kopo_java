package homework;

import java.util.Scanner;

public class BoardView {
	Scanner sc = new Scanner(System.in);
	BoardUtil BU = new BoardUtil();

	public void play() {
		System.out.println("1. 전체 게시물 조회\n"
						 + "2. 글 번호로 조회\n"
						 + "3. 글 등록\n" 
						 + "4. 글 수정\n"
						 + "5. 글 삭제\n"
						 + "0. 종료");
		end:while (true) {
			System.out.println("\n메뉴 중 처리할 항목을 선택하세요 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			
			case 1:
				BU.searchAll();
				break;
			case 2:
				BU.search();
				break;
			case 3:
				BU.regist();
				break;
			case 4:
				BU.update();
				break;
			case 5:
				BU.del();
				break;
			case 0:	
				System.out.println("게시판 프로그램을 종료합니다.");
				break end;
			}
			
		}
	}
}
