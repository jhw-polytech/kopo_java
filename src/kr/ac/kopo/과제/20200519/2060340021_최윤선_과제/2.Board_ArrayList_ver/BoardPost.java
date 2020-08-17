package hw.hw14.Board;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BoardPost {
	private int no;
	private String title;
	private String writer;
	private String date;
	private String content;
	
	BoardPost(){}
	
	BoardPost(int no, String title, String writer, String date, String content){
		this.no=no;
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.content=content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate() {
		SimpleDateFormat format1 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String format_time1 = format1.format(time.getTime());
		this.date = format_time1;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
