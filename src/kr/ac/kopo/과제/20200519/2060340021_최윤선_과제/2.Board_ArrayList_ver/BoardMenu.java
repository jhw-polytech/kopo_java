package hw.hw14.Board;

import java.util.ArrayList;

public abstract class BoardMenu {
	
	public int no;
	public String title;
	public String writer;
	public String date;
	public String content;
	
	public abstract void process(int no, ArrayList<BoardPost> bp); 

}
