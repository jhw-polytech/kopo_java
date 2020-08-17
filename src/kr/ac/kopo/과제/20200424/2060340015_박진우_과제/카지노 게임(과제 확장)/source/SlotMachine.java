package kr.ac.jinwoo.day10.homework2;

import java.util.Random;

public class SlotMachine extends LoggableGame implements Game{

	String slot[] = new String[3];
	int slotMoney = 50000;
	int prizeLevel = 0;
	
	int prize[] = { 1_000_000, 500_000, 100_000, 50_000, 10_000 };
			
	private String convert(int num) {
		String s = "";
		if(num == 0) s = "7";
		else if(num == 1) s = "S";
		else if(num == 2) s = "A";
		else if(num == 3) s = "B";
		else if(num == 4) s = "C";
		
		return s;
	}
	
	private void calcPrize(String s) {
		
		if(s.equals("7")) prizeLevel = 0;
		else if(s.equals("S")) prizeLevel = 1;
		else if(s.equals("A")) prizeLevel = 2;
		else if(s.equals("B")) prizeLevel = 3;
		else if(s.equals("C")) prizeLevel = 4;
	}
	
	public int getPrizeLevel() {
		return prizeLevel;
	}

	public int getUserPrize() {
		return prize[prizeLevel];
	}
	
	public int slotMachineCharge(Player p) {
		
		int ret = 0;
		
		if(p.getMoney() > slotMoney) {
			System.out.println("슬롯머신에 "+ Casino.convertMoneySign(slotMoney) +"원을 투입하셨습니다.");
			p.setMoney(p.getMoney() - slotMoney);
			ret = slotMoney;
		}
		
		return ret;
	}
	
	@Override
	public String makeLog(int winLose, String... str) {
		
		String logString = "";
		String place = "";
		if(winLose == 1) {
			if(str[0] == "7") 		place = "1등!";
			else if(str[0] == "S") 	place = "2등!";
			else if(str[0] == "A") 	place = "3등!";
			else if(str[0] == "B") 	place = "4등!";
			else 					place = "5등!";	
		} 	
		else
			place = " 꽝!";
		
		logString = String.format("[%s]  [ %s ] [ %s ] [ %s ]", place, str[0], str[1], str[2]);
		
		return logString;
	}
	
	public String sendLog() {

		return getLastLog();
	}
	
	// No arguments required.
	@Override
	public int startGame(int you, Dealer dealer) {
		
		System.out.println("\n슬롯머신 게임입니다.");
		System.out.println();
		
		Random r = new Random();
		int ret = 0;
		
		String s1, s2, s3;
		
		s1 = convert(r.nextInt(5));
		s2 = convert(r.nextInt(5));
		s3 = convert(r.nextInt(5));
		
		if(s1.equals(s2) && s1.equals(s3)) {
			ret = 1;
		}
		
		String logString = "";
		if(ret == 1)
			calcPrize(s1);
		
		logString = makeLog(ret, s1, s2, s3);
		addLog(logString);
		printLog();
		
		return ret;
	}
	
}
