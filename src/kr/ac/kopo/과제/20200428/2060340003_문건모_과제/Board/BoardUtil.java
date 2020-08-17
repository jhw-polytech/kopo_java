package Test01;

import java.util.Scanner;

public class BoardUtil {
	
	private Scanner sc;
	
	public BoardUtil() {
		sc = new Scanner(System.in);
	}
	
	public String inputData(String msg) {
		System.out.println(msg);
		String data = sc.nextLine();
		return data;
	}
	
	public int inputNum(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public void wholeBoard() {
		System.out.println("번호\t제목\t글쓴이\t등록일");
		for(int i = 0;i<BoardController.count;i++) {
			System.out.println((i+1) + "\t" + BoardController.boardlist[i].getTitle() + "\t"
			+ BoardController.boardlist[i].getWriter() + "\t" + BoardController.boardlist[i].getDate() );
		}
	}
	
	public void searchBoard() {
		int search = inputNum("찾을 글의 번호를 입력하세요 : ");
		System.out.println((search-1) + "\t" + BoardController.boardlist[search-1].getTitle() + "\t"
				+ BoardController.boardlist[search-1].getWriter() + "\t" + BoardController.boardlist[search-1].getDate() );
	}
				
	
	public void post() {
		String title = inputData("등록할 제목을 입력 : ");
		String writer = inputData("등록할 글쓴이를 입력 : ");
		
		BoardController.boardlist[BoardController.count] = new Board(title,writer);
		BoardController.count++;
		
	}
	
	public void adjust() {
		int adjust = inputNum("수정할 글의 번호를 입력하세요 : ");
		
		String title = inputData("등록할 제목을 입력 : ");
		String writer = inputData("등록할 글쓴이를 입력 : ");
		
		BoardController.boardlist[adjust-1] = new Board(title,writer);
	}
	
	public void delete() {
		int delete = inputNum("삭제할 글의 번호를 입력하세요 : ");
		for(int i = delete;i<BoardController.count;i++) {
			BoardController.boardlist[i-1] = BoardController.boardlist[i] ;
		}
		BoardController.count--;
	}

}
