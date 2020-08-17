package kr.ac.kopo.day15.homework;

import java.util.Scanner;

public class BoardManage {

	private int selectNum;
	private Scanner sc = new Scanner(System.in);
	
	private BoardUtil boardUtil = new BoardUtil();
	
	BoardManage() {
	
	}

	public void start() throws IncorrectException {

		while(true) {
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글 등록");
			System.out.println("4. 글 수정");
			System.out.println("5. 글 삭제");
			System.out.println("0. 종료");
			System.out.println("원하는 항목의 숫자를 입력하세요 : ");
			selectNum = Integer.parseInt(sc.nextLine());
				
			if ((selectNum < 0) || (selectNum > 5)) {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		
			switch(selectNum) {
				
			case 0: System.exit(0);
			
			case 1: boardUtil.printAll(); 
					break;
			case 2: 
					System.out.println("조회를 원하는 글 번호를 입력하세요.");
					int writingNum = Integer.parseInt(sc.nextLine());
					boardUtil.print(writingNum); 
					break;
					
			case 3:	boardUtil.register(); 
					break;
			case 4: 
					System.out.println("수정을 원하는 글 번호를 입력하세요.");
					int alterNum = Integer.parseInt(sc.nextLine());
					boardUtil.alter(alterNum); 
					break;
			case 5: 
					System.out.println("삭제를 원하는 글 번호를 입력하세요.");
					int deleteNum = Integer.parseInt(sc.nextLine());
					boardUtil.delete(deleteNum); 
			}
		}
	}
}
