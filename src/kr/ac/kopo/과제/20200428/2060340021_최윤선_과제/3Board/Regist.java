package homework12.Board;

import java.util.Scanner;

public class Regist extends BoardMenu  {
	
	Regist(){}
	public Regist(int no, String title,String writer,String date,String content) {
		this.no=no;
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.content=content;
	}
	
	@Override
	public void process(int no, BoardPost[] bp) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("글의 제목 입력 : ");
		title=sc.nextLine();
		
		System.out.printf("글의 글쓴이 입력 : ");
		writer=sc.nextLine();
		System.out.printf("글의 내용 입력 : ");
		content=sc.nextLine();

		bp[BoardView.currentindex] = new BoardPost();
		bp[BoardView.currentindex].setNo((BoardView.currentindex+1));
		bp[BoardView.currentindex].setTitle(title);
		bp[BoardView.currentindex].setWriter(writer);
		bp[BoardView.currentindex].setDate();
		bp[BoardView.currentindex].setContent(content);
		System.out.println("글 등록 성공!");
		BoardView.currentindex++;
		System.out.println("\n\n");
	}

}
