package homework;

import java.util.Calendar;

public class UserInfo {

	int num;
	String title;
	String Writer;
	String notice;
	
	Calendar calen = Calendar.getInstance();
	String date = Integer.toString(calen.get(Calendar.YEAR))
				+"-"+Integer.toString(calen.get(Calendar.MONTH))
				+"-"+Integer.toString(calen.get(Calendar.DATE));
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle() {
		this.title=title;
	}
	
	public String getWriter() {
		return Writer;
	}
	
	public void setWriter() {
		this.Writer=Writer;
	}
	
	public Calendar getCal() {
		return calen;
	}
	
	public void setCal() {
		this.calen=calen;
	}
	
	public String getDate() {
		return date;
	}
}
