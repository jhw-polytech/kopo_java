package kr.ac.kopo.assignment.day10;

public class ScissorsRockPaper extends GameSuper implements Game {
	
	private final static int SCISSOR = 1;
	private final static int ROCK = 2;
	private final static int PAPER = 3;
	
	
	//기본생성자
	public ScissorsRockPaper() {
		super();
	}
	
	
	//게임 로직 메소드
	@Override
	public int startGame(int you) {
				
		int me = ran.nextInt(3)+1;
		
		/*
		 <<가위바위보 규칙 "you(유저) - me(컴퓨터) = ?">>
		 승리 : -2, 1 / 패배 : -1, 2 / 무승부 : 0
		 */
		
		int i = you - me;
		int result = 0;
		
		if(i == 0) {
			result = -1;
			System.out.println("비겼습니다.");
			draws++;
		}else if(i == -2 || i == 1) {
			result = 1;
			wins++;
		}else if(i == -1 || i == 2){
			result = 0;
			losses++;
		}
		
		return result;
	}
	
	
	
	//게임 출력 메소드
	@Override
	public void printGame() {
		
		int you = 0;		
		
		//가위바위보 이외의 선택지를 선택할 경우 반복
		while(you < 1 || you > 3) {
			
			System.out.println("<<가위바위보 게임입니다.>>");
			System.out.println("가위바위보 중 하나를 선택하세요.");
			System.out.println("1.가위  2.바위  3.보");
			
			you = sc.nextInt();
			sc.nextLine();
			
			if(you < 1 || you > 3) {
				System.out.println("다시 입력하세요.");
			}
		}
		
		int result = startGame(you);
		
		printResult(result);
		
	}
	
}
