package shlee1993.day12.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
	private String title;
	private String writer;
	private String date;
	private int num;

	public Post() {
	}
	
	public Post(String title, String writer) {
		setNum(Board.num);
		Board.num++;	//객체를 만들고 다음 값을 저장하기 위해 num을 증가시켜둠
		setTitle(title);
		setWriter(writer);
		this.date = setDate();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String setDate() {	 //날짜 생성
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getNum() {
		return num;
	}

	public String getDate() {
		return date;
	}

}
