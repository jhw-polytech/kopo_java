package homework12.Board;

import java.util.Scanner;

public class Delete extends BoardMenu   {
	
	private String delstring="";
	Delete(){}
	public Delete(int no, String title,String writer,String date,String content) {
		this.no=no;
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.content=content;
	}
	
	@Override
	public void process(int no, BoardPost[] bp) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("삭제하고 싶은 글 번호 입력 : ");
		no = sc.nextInt();
		sc.nextLine();
		title = delstring;
		writer = delstring;
		content= delstring;
		date= delstring;
		
		bp[no-1].setTitle(title);
		bp[no-1].setWriter(writer);
		bp[no-1].setDate(date);
		bp[no-1].setContent(content);

		System.out.println("글 삭제 성공!");
		System.out.println("\n\n");
	}

}
