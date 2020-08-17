package hw.hw14.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Seeindex extends BoardMenu {
	Seeindex(){}
	public Seeindex(int no, String title,String writer,String date,String content) {
		this.no=no;
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.content=content;
	}
	
	@Override
	public void process(int no, ArrayList<BoardPost> bp) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("조회하고 싶은 글의 번호 입력 : ");
		no = sc.nextInt();
		sc.nextLine();

		
		title=bp.get(no-1).getTitle();
		writer=bp.get(no-1).getWriter();
		content=bp.get(no-1).getContent();
		date=bp.get(no-1).getDate();
		
		System.out.println("==================================");
		System.out.println((no)+"번째 게시물");
		System.out.println("제목 : "+title);
		System.out.println("글쓴이 : "+writer);
		System.out.println("내용 : "+ content);
		System.out.println("작성 일 : "+date);
		System.out.println("==================================");
		System.out.println("\n\n");
	}

	
	
}
