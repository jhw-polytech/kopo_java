package exam0428.Board;

import java.util.Scanner;

public class BoardManage {

	private static int num = 0;
	private String title;
	private String name;
	private int selectNum;
	private Board boardArr[] = new Board[50];
	private Scanner sc = new Scanner(System.in);
	
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
				throw new IncorrectException("올바르지 않은 숫자입니다. 종료합니다.");
			}
			switch(selectNum) {
			case 0: System.exit(0);
			case 1: printAll(); break;
			case 2: 
				System.out.println("조회를 원하는 글 번호를 입력하세요.");
				int writingNum = Integer.parseInt(sc.nextLine());
				print(writingNum); break;
			case 3:	register(); break;
			case 4: 
				System.out.println("수정을 원하는 글 번호를 입력하세요.");
				int alterNum = Integer.parseInt(sc.nextLine());
				alter(alterNum); break;
			case 5: 
				System.out.println("삭제를 원하는 글 번호를 입력하세요.");
				int deleteNum = Integer.parseInt(sc.nextLine());
				delete(deleteNum); 
			
			}
			
		}
	}
	
	public void printAll() {

		System.out.println("============= 전체 게시글 조회 =============");
		System.out.printf("%2s\t %s\t\t %s\t\t  %s\n", "번호", "제목", "글쓴이" ,"등록일");
		for (int i = 0; i < num; i++) {

			System.out.printf("%2d\t %s\t\t %s\t %s\n",
				boardArr[i].getNum(), boardArr[i].getTitle(),
				boardArr[i].getName(), boardArr[i].getDate());
		}	
	}
	
	public void print(int num) throws IncorrectException {
		try {
		System.out.printf("%s\t %s\t %s\t %s\n", "번호", "제목", "글쓴이" ,"등록일");
		System.out.printf("%d\t %s\t %s\t %s\n",
				boardArr[num].getNum(), boardArr[num].getTitle(),
				boardArr[num].getName(), boardArr[num].getDate());
		} catch (Exception e) {
			throw new IncorrectException("해당 번호는 존재하지 않습니다.");
		}
	}
	
	public void register() {
		if (num >= 50) {
			System.out.println("게시글 수가 꽉 차서 글을 쓸 수 없습니다.");
		} else {
			System.out.println("등록할 제목 입력 : ");
			title = sc.nextLine();
			System.out.println("글쓴이 입력 :");
			name = sc.nextLine();
			boardArr[num] = new Board(num, title, name);
			num++;
			System.out.println("게시들이 등록되었습니다.\n");
		}
	}
	
	public void alter(int num) throws IncorrectException {
		try {
			System.out.println("수정할 제목 입력 : ");
			title = sc.nextLine();
			boardArr[num].setTitle(title);
			System.out.println("글쓴이 입력 :");
			name = sc.nextLine();
			boardArr[num].setName(name);
			System.out.println("게시들이 수정되었습니다.\n");
		} catch(Exception e) {
			throw new IncorrectException("해당되는 글 번호를 찾을 수 없습니다.");
		} 
	}
	
	public void delete(int num) {
		
		for(int i = num; i < boardArr.length - 1; i++) {
			boardArr[i] = boardArr[i+1];
		}
		System.out.println("삭제가 완료되었습니다.");
	}
}
