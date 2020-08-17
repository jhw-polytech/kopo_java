package hw.hw14.Board;

import java.util.ArrayList;
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
	public void process(int no, ArrayList<BoardPost> bp) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("삭제하고 싶은 글 번호 입력 : ");
		no = sc.nextInt();
		sc.nextLine();
		title = delstring;
		writer = delstring;
		content= delstring;
		date= delstring;
		

		bp.remove(no-1);
		

		System.out.println("글 삭제 성공!");
		System.out.println("\n\n");
	}

}
