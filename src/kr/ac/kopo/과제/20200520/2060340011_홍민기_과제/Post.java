package board;

import java.io.Serializable;

public class Post implements Serializable{

	private String title;
	private String writer;
	private String date;
	private CalendarUtil util = new CalendarUtil();
	
	public Post(String title, String writer) {
		this.title = title;
		this.writer = writer;
		this.date = util.today();
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

	public void setDate(String date) {
		this.date = util.today();
	}
	
}
