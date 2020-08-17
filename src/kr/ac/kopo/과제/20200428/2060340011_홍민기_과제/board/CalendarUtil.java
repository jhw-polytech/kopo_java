package kr.ac.kopo.day12.homework.board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarUtil {
	
	public String today() {

		String pattern = "yyyy-MM-dd";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		return sdf.format(new Date());
	}
}
