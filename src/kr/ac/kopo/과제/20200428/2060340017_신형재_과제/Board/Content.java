package homework0428_Board;

public class Content {
	int num=0;
	String subject;
	String writer;
	String date;
	
	static int checkpoint=0;
	
	public Content(int num, String subject, String writer,
			String date) {
		this.num=num;
		this.subject=subject;
		this.writer=writer;
		this.date=date;
	}
	
	public void setContent(int num, String subject, String writer,
			String date) {
		this.num=num;
		this.subject=subject;
		this.writer=writer;
		this.date=date;
	}
	public void showContent(){
		System.out.println((num+1) + "\t" + subject + "\t"
					+ writer + "\t" + date);
	}
}
