package shlee1993.day14.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
	private String title;
	private String writer;
	private String date;
	private int num;	//일련번호 검색을 위한 num
	private static int sNum = 1;	//num을 순차적으로 부여하기 위해 만든 static 변수,
									//저번에 Board 클래스에 넣어 이번에는 Post에 넣어봤습니다
	public Post() {
	}
	
	public Post(String title, String writer) {
		num = sNum++;
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
