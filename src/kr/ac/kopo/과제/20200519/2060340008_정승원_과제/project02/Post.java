
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
	
	private String title;
	private String writer;
	private String date;
	private int number;
	
	public Post() {
		
	}
	
	public Post(String title, String writer, int number) {
		this.setTitle(title);
		this.setWriter(writer);
		this.setNumber(number);
		this.setDate(today());
	}

	public String today() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
