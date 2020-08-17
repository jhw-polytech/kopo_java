package homework12.Board;

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
	public void process(int no, BoardPost[] bp) {
		System.out.println("==========< 전체 게시글 조회 >==========");
		// System.out.println("번호 제목\t\t글쓴이\t\t등록일\t\t내용");
		for (int z = 0; z < BoardView.currentindex; z++) {
			no = bp[z].getNo();
			title = bp[z].getTitle();
			writer = bp[z].getWriter();
			date = bp[z].getDate();
			content = bp[z].getContent();
			// System.out.printf(" %d %s\t%s\t%s\t%s\n",no,title,writer,date,content);
			if (title != "") {
				System.out.println(no + "번째 게시물");
				System.out.println("제목 : " + title);
				System.out.println("글쓴이 : " + writer);
				System.out.println("내용 : " + content);
				System.out.println("작성 일 : " + date);
				System.out.println("==================================");
			}
		}
		System.out.println("\n\n");
	}

}
