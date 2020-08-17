package kr.ac.kopo.day12.homework.lotto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LottoUtil {

	public long round() {
		
		// 로또 1회차 날짜는 2002년 12월 7일 (토)
		Calendar init = new GregorianCalendar(2002,11,1); // 2002년 12월 1일 (일) ~ 2002년 12월 7일 (토) 까지 발행한 로또는 1회차
		Calendar now = Calendar.getInstance();
		
		long interval = now.getTimeInMillis() - init.getTimeInMillis();
		interval = interval / 1000; // 초로 변환
		interval = interval / 86400; // 일수로 변환
		interval = interval / 7 +1;
		
		return interval;
		
	}

	public String today() {

		String pattern = "yyyy/MM/dd (E) HH:mm:ss";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		return sdf.format(new Date());
	}

	public String lottery(){
		
		// 로또 추첨일은 그 주 토요일
		String pattern = "yyyy/MM/dd (E)";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Date date = new Date();
		
		Calendar c = Calendar.getInstance();
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, 7-week); // 토요일과 현재 요일의 차이를 현재 날에 더하면 토요일이 됨
		
		date = new Date(c.getTimeInMillis());
		return sdf.format(date);
	}
	
	public String dueDate() {
		
		// 지급기한은 추첨일 다음주 수령 가능일 부터 1년
		String pattern = "yyyy/MM/dd";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Date date = new Date();
		
		String lottery = lottery(); // 추첨일을 가져옴
		int year = Integer.parseInt(lottery.split("/")[0]); // yyyy
		int mon = Integer.parseInt(lottery.split("/")[1]); // MM
		int day = Integer.parseInt(lottery.split("/")[2].charAt(0)+""+lottery.split("/")[2].charAt(1)); // dd
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, mon-1, day);
		c.add(Calendar.DATE, 2); // 토요일이 추첨일, 수령가능일은 월요일 이므로 2를 더함
		c.add(Calendar.YEAR, 1); // 수령가능일로부터 1년이 지급기한
		date = new Date(c.getTimeInMillis());
		return sdf.format(date);
	}
}
