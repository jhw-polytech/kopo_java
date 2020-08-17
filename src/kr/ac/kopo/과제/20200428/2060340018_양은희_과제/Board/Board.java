package board;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

	public class Board {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   private int num;
	   private String title;
	   private String writer;
	   private String date;
	   private Board arr[] = new Board[100];
	   
	   
	   public Board(int num, String title, String name) {
		   this.num = num;
		   this.title = title;
		   this.writer = writer;
		   SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		   Calendar time = Calendar.getInstance();
		   String time1 = format.format(time.getTime());
	   }

	   public int getNum() {
		   return num;
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

		public void setWriter(String name) {
			this.writer = name;
		}

		public String getDate() {
			return date;
		}
	   
	   
	
}
