package Test01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	
	private String title;
	private String writer;
	private String date;
	private SimpleDateFormat sdf;
	private Date today;
	
	public Board(String title, String writer) {
		this.title = title;
		this.writer = writer;
		today = new Date();
		sdf = new SimpleDateFormat("yyyy/MM/dd");
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
		date = sdf.format(today);
		return date;
	}
		
	
	public void setDate(String date) {
		this.date = date;
	}
}
