package kr.ac.kopo.day12.assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PostMain {

	public static void main(String[] args) {
		
//		Board b = new Board();
//		b.execute();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 5, 10, 16, 32, 45);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy, mm, h");
		System.out.println(sdf.format(cal.getTime()));

		
	}
}
