package kr.ac.jinwoo.day10.homework2;

import java.util.Scanner;

public abstract class Dealer {
	
	Game game = null;
	
	ScissorsRockPaper srpGame = new ScissorsRockPaper();
	Dice diceGame = new Dice();

	int bettingMoney;
	
	protected int srpThreshold;
	protected int diceThreshold;
	
	private Scanner sc = new Scanner(System.in);
	
	public Dealer() {
		
		setSrpThreshold();
		setDiceThreshold();
		greetingMent();
	}
	
	// 딜러마다 퍼센테이지를 다르게 한다.
	public abstract void setSrpThreshold();
	public abstract void setDiceThreshold();
	// 딜러마다 등장인사를 설정
	public abstract void greetingMent();
	
	public int getSrpThreshold() {
		return srpThreshold;
	}
	public int getDiceThreshold() {
		return diceThreshold;
	}
	
	public int betting(Player p) {
		
		System.out.println("당신의 돈 : " + Casino.convertMoneySign(p.getMoney()));
		System.out.printf("얼마를 배팅하시겠습니까? : ");
		int money = Integer.parseInt(sc.nextLine());
		
		while(money < 0 || p.getMoney() < money) {
			System.out.printf("잘못 입력하셨습니다. 다시 배팅해주세요 : ");
			money = Integer.parseInt(sc.nextLine());
		}
		
		bettingMoney = money;
		p.setMoney(p.getMoney() - bettingMoney);
		System.out.println();
		System.out.println(Casino.convertMoneySign(bettingMoney) + "원 배팅하셨습니다.");
		
		return bettingMoney;
	}
	
	public String sendLog(LoggableGame logGame) {
		
		String logString = "";
		
		if(logGame instanceof ScissorsRockPaper)
			logString = srpGame.getLastLog();
		
		else if(logGame instanceof Dice)
			logString = diceGame.getLastLog();

		return logString;
	}
	
	public int srpGameStart() {
		
		int ret;
		System.out.println("\n가위바위보 게임입니다.");
		int you;
		while(true) {
			System.out.print("가위바위보 중 하나를 선택하세요.");
			System.out.print("(1:가위, 2:바위, 3:보) : ");
			you = Integer.parseInt(sc.nextLine());
			System.out.println();
			if(0 < you && you <= 3)
				break;
			System.out.print("다시 입력하세요 : ");
			System.out.println();
		}
		
		game = srpGame;
		ret =  game.startGame(you, this);
		// printLog() 메소드도 game으로 호출하고 싶다..
		srpGame.printLog();
		
		return ret;
	}
	
	public int diceGameStart() {
		
		int ret;
		int you;
		System.out.println("\n주사위 게임입니다.");
		while(true) {
			System.out.print("주사위를 선택하세요(1~6 값중 하나) : ");
			you = Integer.parseInt(sc.nextLine());
			System.out.println();
			if(0 < you && you <= 6)
				break;
			System.out.println("다시 입력하세요.");
			System.out.println();
		}
		game = diceGame;
		ret = game.startGame(you, this);
		diceGame.printLog();
		
		return ret;
	}
}
