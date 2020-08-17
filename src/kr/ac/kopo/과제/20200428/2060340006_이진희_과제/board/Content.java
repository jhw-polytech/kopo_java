package board;

public class Content{
	static int lastNum = 0;
	int num;
	String subject;
	String writer;
	String date;
	
	public Content(int num, String subject, String writer, String date) {		
		this.num = num;
		this.subject = subject;
		this.writer = writer;
		this.date = date;
	}

	void setData(int num, String subject, String writer, String date) {
		this.num = num;
		this.subject = subject;
		this.writer = writer;
		this.date = date;
	}

	void print() {
		String print = ""; 
		print += (num + 1) + "\t";
		print += subject + "\t";
		print += writer + "\t";
		print += date + "\t";				
		System.out.println(print);
	}
}