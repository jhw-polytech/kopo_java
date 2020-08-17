package kr.ac.jinwoo.day10.homework2;

public class ScissorsRockPaper extends WinLoseJudgeableGame {

	private final static int SCISSOR = 1, ROCK = 2, PAPER = 3;
	
	private int mine, yours;
	
	@Override
	public String makeLog(int winLose, String... str) {
		
		String logString = "";
		
		if(winLose == WIN)			logString = String.format("[승] 당신 : %s, 컴퓨터 : %s", str[0], str[1]);
		else if(winLose == DRAW)	logString = String.format("[무] 당신 : %s, 컴퓨터 : %s", str[0], str[1]);
		else						logString = String.format("[패] 당신 : %s, 컴퓨터 : %s", str[0], str[1]);
		
		return logString;
	}
	
	@Override
	public int startGame(int you, Dealer dealer) {
		
		int range[] = { 0, 33, 66, 99};		// [0 ~ 32] SCISSOR, [33 ~ 65] ROCK, [66 ~ 98] PAPER
		
		if(you == SCISSOR) {								// 상대가 가위면 내가 주먹낼  확률을 내리고 보자기 낼 확률 증가.
			range[ROCK] -= dealer.getSrpThreshold();		
		}
		else if(you == ROCK) {								// 상대가 주먹이면 내가 보자기 낼 확률을 내리고 가위 낼 확률 증가.
			range[ROCK] += dealer.getSrpThreshold();		
			range[SCISSOR] += dealer.getSrpThreshold();		
		}
		else {												// 상대가 보자기면 내가 가위 낼 확률을 내리고 주먹 낼 확률 증가.
			range[SCISSOR] -= dealer.getSrpThreshold();		// 가위 확률 내리면 주먹 확률도 올라감.
		}
		
		int ret = -1;
		int me = (int)(Math.random()*99);
		
		for(int i = 0; i < 3; i++) {
			
			if(range[i] <= me && me <range[i+1]) 
				me = i+1;	
		}
		
		mine = me;
		yours = you;
		
		// draw case
		if(me == you)
			ret = draw();
		
		// win case		// computer win		// user lose
		else if((me == SCISSOR && you == PAPER) || (me == ROCK && you == SCISSOR) || (me == PAPER && you == ROCK))
			ret = win();

		// lose case	// computer lose	// user win
		else if((me == SCISSOR && you == ROCK) || (me == ROCK && you == PAPER) || (me == PAPER && you == SCISSOR)) 
			ret = lose();
		
		
		String logString = "";
		String myString = null, yourString = null;
		
		if(mine == SCISSOR) 	myString = "SCISSOR";
		else if(mine == ROCK) 	myString = "ROCK";
		else if(mine == PAPER) 	myString = "PAPER";
		
		if(yours== SCISSOR) 	yourString = "SCISSOR";
		else if(yours == ROCK) 	yourString= "ROCK";
		else if(yours == PAPER)	yourString = "PAPER";
		
		logString = makeLog(ret, myString, yourString);
	
		addLog(logString);
		
		return ret;
	}
	
}
