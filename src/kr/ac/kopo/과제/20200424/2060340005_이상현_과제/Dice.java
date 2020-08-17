package shlee1993.day10.homework;

public class Dice implements Game {
	int player, computer;
	
	@Override
	public int startGame(int player) {
		this.player = player;
		computer = (int) (Math.random() * 6) + 1;
		
		if (player == computer) {	//같은 경우 승리
			printWin();
			return 1;
		}
		
		else {	//다를 경우 패배
			printLose();
			return 2;
		}	
	}
	
	//아래의 코드들은 추상클래스 혹은 게임관리 클래스(super)를 만들어 관리하면 편할 것 같지만 명세서에 없기 때문에 이처럼 제작하였습니다.
	public void printLose() {
		printMessage();
		System.out.println("You lose!");
	}

	public void printWin() {
		printMessage();
		System.out.println("You win!");
	}
	
	//각각 어떤 숫자를 냈는지 확인을 위한 메소드
	public void printMessage() {	
		System.out.printf("player : %d, computer : %d ", player, computer);
	}

}
