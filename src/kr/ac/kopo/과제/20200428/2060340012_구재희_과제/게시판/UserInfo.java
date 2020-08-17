package jaeheehomework;

import java.util.Calendar;

public class UserInfo {

	// field
	private int num;                       // 글번호
	private String title;                  // 제목
	private String writer;                 // 글쓴이
	private String notice;                 // 공지사항

	Calendar cal = Calendar.getInstance(); // 등록일
	private String date = Integer.toString(cal.get(Calendar.YEAR)) + "/" +
						  Integer.toString(cal.get(Calendar.MONTH) + 1) + "/" +
						  Integer.toString(cal.get(Calendar.DATE));
	
	
	// setter getter
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
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public Calendar getCal() {
		return cal;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	public String getDate() {
		return date;
	}
	

	

}
