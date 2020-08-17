package board;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarUtil implements Serializable{
	
	public String today() {

		String pattern = "yyyy-MM-dd";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		return sdf.format(new Date());
	}
}
