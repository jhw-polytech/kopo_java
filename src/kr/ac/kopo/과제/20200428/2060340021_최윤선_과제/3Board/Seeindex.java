package homework12.Board;

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
	public void process(int no, BoardPost[] bp) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("조회하고 싶은 글의 번호 입력 : ");
		no = sc.nextInt();
		sc.nextLine();
		title=bp[no-1].getTitle();
		writer=bp[no-1].getWriter();
		date=bp[no-1].getDate();
		content=bp[no-1].getContent();
		//System.out.println("번호       제목\t\t글쓴이\t\t등록일\t\t내용");
		//System.out.printf(" %d    %s\t%s\t%s\t%s\n",no,title,writer,date,content);
		
		System.out.println("==================================");
		System.out.println(no+"번째 게시물");
		System.out.println("제목 : "+title);
		System.out.println("글쓴이 : "+writer);
		System.out.println("내용 : "+ content);
		System.out.println("작성 일 : "+date);
		System.out.println("==================================");
		System.out.println("\n\n");
	}

	
	
}
