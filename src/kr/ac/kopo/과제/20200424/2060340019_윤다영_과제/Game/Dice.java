package kr.ac.kopo.assignment.day10;

public class Dice extends GameSuper implements Game {

	
	public Dice() {
		super();
	}

	//주사위 게임 로직 구현 메소드
	@Override
	public int startGame(int you) {
		
		int me = ran.nextInt(6) + 1;
		int result = 0;
		
		if(me == you) {
			result = 1;
			wins++;
		}else {
			losses++;
		}
			
		return result;
	}

	//주사위 게임 출력 메소드
	@Override
	public void printGame() {
		
		int you = 0;
		
		while(you < 1 || you > 6) {
			System.out.println("<<주사위 값 맞추기 게임입니다.>>");
			System.out.print("주사위를 선택하세요(1 ~ 6 값 중 하나를 입력하세요) : ");
			
			you = sc.nextInt();
			
			if(you < 1 || you > 6) {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		int result = startGame(you);
		printResult(result);	
		
	}

}
