package exam0424;

import java.util.Scanner;

public class GameMain {
	
	//구지 이 메소드를 안써도 큰 차이는 없을 것 같은데 써봤습니다
	public static int resultPrint(Game instance, int inputNum) {
		
		if (instance instanceof Game) {
			return instance.startGame(inputNum);
		} 
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'Z';
		int cnt = 0, win = 0, draw = 0, inputNum = 0, result = 0;
		
		while(ch != 'C') {
			System.out.println("게임을 선택하세요.\nA.가위바위보\nB.주사위 값 맞추기\nC.종료");
			ch = sc.nextLine().charAt(0);
			
			while(((int) ch < 65) || ((int) ch > 67 )) {
				System.out.println("다시 입력하세요.");
				ch = sc.nextLine().charAt(0);
			}
			
			if (ch == 'C') {
				break;
			}
			
			cnt += 1;
			
			if (ch == 'A') {
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보중 하나를 선택하세요.\n(1:가위,2:바위,3:보)");
				inputNum = Integer.parseInt(sc.nextLine());

				while((inputNum < 1) || (inputNum > 3)) {
					System.out.println("다시 입력하세요.");
					inputNum = Integer.parseInt(sc.nextLine());
				}
				Game srp = new ScissorsRockPaper();
				result = resultPrint(srp, inputNum);
				if (result == 1) { 
					System.out.println("\nYou win!!\n");
					win += 1;
				} else if (result == 2) {
					draw += 1;
				} else {
					System.out.println("\nYou lose..\n"); 
				}
			}
	
			else if (ch == 'B') {
				
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요. (1~6값 중 하나) : ");
				inputNum = Integer.parseInt(sc.nextLine());
				while( (1 > inputNum) && ( inputNum > 6)) {
					System.out.println("다시 입력하세요.");
					inputNum = Integer.parseInt(sc.nextLine());
				}
				
				Game dice = new Dice();
				result = dice.startGame(inputNum);
				if( result == 1) {
					win += 1;
				}
			}
		}
		System.out.println("\n게임을 종료합니다.");
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.", win, cnt-win-draw, draw);
	}
}

	
