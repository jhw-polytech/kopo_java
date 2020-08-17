package kr.ac.yeongnam.day12.homework;

import java.util.Scanner;


public class BoardView {

	private Scanner sc;
	private static int num = 0;
	String title;
	String writer;
	
	private Board boardArr[] = new Board[100];
	
	BoardView(){
		sc = new Scanner(System.in);
	}
	
	public void start() {
		int num = 1;
		
		while(num != 0) {
			
			num = select();
			switch(num) {
			case 1:
				printAll();
				break;
			case 2:
				printNum();
				break;
			case 3:
				upload();
				break;
			case 4: 
				edit();
				break;
			case 5:
				remove();
				break;			
			case 0:
				System.out.println("종료합니다.");
			}
			
		}
	}	
	
	public int select() {
		sc = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.println("1. 전체 게시물 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.println("============================");
		
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	public void printAll() {
		System.out.println("< 전체 게시글 조회 >");
		System.out.printf("%s\t %-20s\t %s\t %s\n", "번호", "제목", "글쓴이", "등록일");
		
		if(num == 0) {
			System.out.println("조회 할 글이 없습니다.");
		} else {
			for(int cnt = 1; cnt <= num; cnt++) {
				
				System.out.printf("%d\t %-20s %s\t %s\n", 
						boardArr[cnt-1].getNum(), boardArr[cnt-1].getTitle(), boardArr[cnt-1].getWriter(), boardArr[cnt-1].getDate());
			}			
		}
		
	}
	
	public void printNum() {
		System.out.print("조회 할 글번호를 입력해주세요 : ");
		int numTmp = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("%s\t %-20s\t %s\t %s\n", "번호", "제목", "글쓴이", "등록일");

		System.out.printf("%d\t %-20s %s\t %s\n", 
				boardArr[numTmp-1].getNum(), boardArr[numTmp-1].getTitle(), boardArr[numTmp-1].getWriter(), boardArr[numTmp-1].getDate());
	}
	
	
	public void upload() {
		System.out.print("등록할 제목을 입력 : ");
		title = sc.nextLine();
		System.out.print("등록할 글쓴이를 입력 : ");
		writer = sc.nextLine();
		
		num++;
		if(num > 100) {
			System.out.println("등록할 수 있는 게시글을 초과했습니다. (100건 제한)");
		}
		
		boardArr[num-1] = new Board(num, title, writer);

		System.out.println("게시글이 등록되었습니다.");
								
	}
	
	public void edit() {
		System.out.print("수정을 원하는 글 번호를 입력하세요 : ");
		int numTmp = sc.nextInt();
		sc.nextLine();
		
		System.out.print("등록할 제목을 입력 : ");
		title = sc.nextLine();
		System.out.print("등록할 글쓴이를 입력 : ");
		writer = sc.nextLine();
		
		boardArr[numTmp-1] = new Board(numTmp, title, writer);
	}
	
	public void remove() {
		System.out.print("삭제를 원하는 글번호를 입력하세요: ");
		int numTmp = sc.nextInt();
		sc.nextLine();
		
		for(int i = numTmp ; i < num; i++) {
			boardArr[i-1] = boardArr[i];
			boardArr[i-1].setNum(boardArr[i-1].getNum() - 1);
		}
		
		boardArr[num] = null;
		num--;
		
		System.out.println(numTmp + "번 글이 삭제됐습니다.");		
	}	

}
