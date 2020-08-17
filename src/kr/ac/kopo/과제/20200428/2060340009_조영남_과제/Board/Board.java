package kr.ac.yeongnam.day12.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {

	private int num;
	private String title;
	private String writer;
	private String date;
	static String pattern = "yyyy.MM.dd";
		
	public Board(int num, String title, String writer){
						
		this.num = num;
		this.title = title;
		this.writer = writer;
		SimpleDateFormat simpleDF = new SimpleDateFormat(pattern);
		this.date = simpleDF.format(new Date());
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
		this.date = date;
	}

}
