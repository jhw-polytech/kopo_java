package kr.ac.kopo.day15.homework;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board implements Serializable {
	
	private int num;
	private String 	title;
	private String 	name;
	private String date;
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

	public Board(int num, String title, String name) {
		this.num = num;
		this.title = title;
		this.name = name;
		this.date = sdf.format(new Date());
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return num +"\t"+ title+"\t\t"+ name+"\t\t"+date;
	}


	
}
