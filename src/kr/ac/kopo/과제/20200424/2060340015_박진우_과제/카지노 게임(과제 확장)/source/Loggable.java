package kr.ac.jinwoo.day10.homework2;

public interface Loggable {

	public String makeLog(int winLose, String... str);
	
	public void addLog(String log);
	
	public void printLog();
	
//	public void totalGameLogPrint();
	
	public String getLastLog();
	
}
