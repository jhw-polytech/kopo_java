package shlee1993.day10.homework;

public class ScissorsRockPaper implements Game {
	final static int SCISSORS = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	int player, computer;	//결과값 출력에 각각 뭐를 냈는 지 확인할 수 있는 기능을 추가하기 위해 만들었습니다.

	@Override
	public int startGame(int player) {
		this.player = player;
		computer = (int) (Math.random() * 3) + 1;

		switch (computer) {	//여기서는 필요없지만, 혹시 스태틱 변수 가위바위보 값에 저장된 값과, 입력 값이 다를 경우를 대비해 넣어뒀습니다
		case 1:
			computer = SCISSORS;
			break;
		case 2:
			computer = ROCK;
			break;
		default:	//case 3으로 해도 되지만, computer 값이 1, 2, 3밖에 나올수 없기 때문에 디폴트로 하였습니다
			computer = PAPER;
			break;
		}

		int result = (player + 3 - (computer % 3)) % 3;
		// if(player == 3 && computer == 2) || (player == 2 && computer == 1)...이런식의 조건문으로
		// 해도 되지만 너무 긴거 같아 규칙을 잡았습니다. player + 3을 한 이유는 player가 computer보다 작을 경우 음수가 나오기 때문입니다.
		// player + 3 - (computer % 3)가 1 or 4인 경우 player 승
		// player + 3 - (computer % 3)가 2 or 5인 경우 player 패
		// player + 3 - (computer % 3)가 0 or 3 or 6인 경우 비김

		switch (result) {
		case 0:
			printDraw();
			return 0;	//비기면 0을 출력
		case 1:
			printWin();
			return 1;	//이기면 1을 출력
		case 2:
			printLose();
			return 2;	//지면 2를 출력
		default:
			System.out.println("오류 발생 다시 시작하세요");
			return 0;
		}

	}
	
	//아래의 코드들은 추상클래스 혹은 게임관리 클래스(super)를 만들고 오버라이딩하면 편할 것 같지만 명세서에 없기 때문에 이처럼 제작하였습니다.
	//각각 뭐를 냈는지 확인을 위한 메소드
	public void printMessage() {	
		System.out.printf("player : %s, computer : %s. ", getSrp(player), getSrp(computer));
	}
	
	//printMessage()에 가위바위보 출력 위한 메소드
	public String getSrp(int srp) {
		if (srp == 1)
			return new String("가위");
		else if (srp == 2)
			return new String("바위");
		else if (srp == 3)
			return new String("보");
		else
			return new String("에러");
	}
	
	public void printLose() {
		printMessage();
		System.out.println("You lose!");
	}

	public void printWin() {
		printMessage();
		System.out.println("You win!");
	}

	public void printDraw() {
		printMessage();
		System.out.println("draw!");
	}
	
}
