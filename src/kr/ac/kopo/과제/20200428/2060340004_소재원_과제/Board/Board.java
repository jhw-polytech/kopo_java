package exam0428.Board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	
	private int num;
	private String 	title;
	private String 	name;
	private String date;
	static String pattern = "yyyy.MM.dd";


	public Board(int num, String title, String name) {
		this.num = num;
		this.title = title;
		this.name = name;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		this.date = sdf.format(new Date());
	}

	public int getNum() {
		return num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	
	
}
