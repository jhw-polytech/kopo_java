package kr.ac.jinwoo.day10.homework2;

import java.util.ArrayList;

public abstract class LoggableGame implements Loggable {

	protected ArrayList<String> logArr = new ArrayList<String>();
	
	@Override
	public void addLog(String log) {
		logArr.add(log);
	}
	
	@Override
	public void printLog() {
		
		int i = logArr.size();
		System.out.println(logArr.get(i-1));
		System.out.println();
	}

//	@Override
//	public void totalGameLogPrint() {
//		
//		System.out.println("===================================");
//		System.out.println("게임 로그");
//		
//		for(int i = 0; i < logArr.size(); i++) {
//			System.out.println((String)logArr.get(i));
//		}
//		
//		if(logArr.size() == 0) {
//			System.out.println("로그 없음.");
//		}
//		System.out.println("===================================");
//	}
	
	@Override
	public String getLastLog() {
		
		return logArr.get(logArr.size()-1);
	}
}
