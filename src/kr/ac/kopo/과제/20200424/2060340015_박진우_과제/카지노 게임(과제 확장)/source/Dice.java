package kr.ac.jinwoo.day10.homework2;

public class Dice extends WinLoseJudgeableGame {
	
	@Override
	public String makeLog(int winLose, String... str) {
		
		String logString = "";
		
		if(winLose == WIN) 	logString = String.format("[승] 당신 : %s, 컴퓨터 : %s", str[0], str[1]);
		else 				logString = String.format("[패] 당신 : %s, 컴퓨터 : %s", str[0], str[1]);
			
		return logString;
	}

	@Override
	public int startGame(int you, Dealer dealer) {
		
		int range[] = { 0, 20, 40, 60, 80, 100, 120 };		// [0 ~ 19] 1, [20 ~ 39] 2, [40 ~ 59] 3,
														// [60 ~ 79] 4, [80 ~ 99] 5, [100 ~ 119] 6;
		
		if(you != 6) 	range[you] += dealer.getDiceThreshold();
		else			range[you-1] -= dealer.getDiceThreshold();
		
		int me = (int)(Math.random()*120);
		
		for(int i = 0; i <= 6; i++) {
			
			if(i < 6) {
				if(range[i] <= me && me <range[i+1]) 
					me = i+1;
			}
		}
		
		int ret = -1;
		
		if(you == me) 
			ret = win();
		else
			ret = lose();
		
		String logString = "";
		String str1 = Integer.toString(you);
		String str2 = Integer.toString(me);
		logString = makeLog(ret, str1, str2);
		addLog(logString);
		
		return ret;
	}
	
}
