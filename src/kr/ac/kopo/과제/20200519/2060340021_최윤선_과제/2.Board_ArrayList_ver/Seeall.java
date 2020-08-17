package hw.hw14.Board;

import java.util.ArrayList;

public class Seeall extends BoardMenu {

	Seeall() {
	}

	public Seeall(int no, String title, String writer, String date, String content) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.content = content;
	}

	@Override
	public void process(int no, ArrayList<BoardPost> bp) {
		System.out.println("==========< 전체 게시글 조회 >==========");
		int i=0;
		for (int z = 0; z < bp.size(); z++) {
			no=bp.get(z).getNo();
			title=bp.get(z).getTitle();
			writer=bp.get(z).getWriter();
			content=bp.get(z).getContent();
			date=bp.get(z).getDate();

			if (title != "") {
				System.out.println(i+1 + "번째 게시물");
				System.out.println("제목 : " + title);
				System.out.println("글쓴이 : " + writer);
				System.out.println("내용 : " + content);
				System.out.println("작성 일 : " + date);
				System.out.println("==================================");
			}
			i++;
		}
		System.out.println("\n\n");
	}

}
