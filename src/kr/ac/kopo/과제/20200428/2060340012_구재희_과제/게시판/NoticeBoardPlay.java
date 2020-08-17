package jaeheehomework;

import java.util.Scanner;

public class NoticeBoardPlay {
	Scanner sc = new Scanner(System.in);
	NoticeBoard nb = new NoticeBoard();

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
				nb.searchAll();
				break;
			case 2:
				nb.search();
				break;
			case 3:
				nb.register();
				break;
			case 4:
				nb.update();
				break;
			case 5:
				nb.delete();
				break;
			case 0:	
				System.out.println("게시판 프로그램을 종료합니다.");
				break end;
			}
			
		}
	}
}
