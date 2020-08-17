package kr.ac.jinwoo.day12.homework.BoardHomework;

public class Board extends Data {

	private String title;
	private String writer;
	private String date;
	private String contents;

	public Board() {}
	
	public Board(String line) {
		super(line);
	}
	
	public Board(String title, String writer, String date, String contents) {
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.contents = contents;
		this.setDataLine(title + "," + writer + "," + date  + ","+ contents);
	}
	// getter
	public String getTitle() { return title; }
	public String getWriter() { return writer; }
	public String getDate() { return date; }
	public String getContents() { return contents; }
	
	// setter
	public void setTitle(String title) { this.title = title; }
	public void setWriter(String writer) { this.writer = writer; }
	public void setDate(String date) { this.date = date; }
	public void setContents(String contents) { this.contents = contents; }
	
}
