package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {
	
	public static void main(String[] args) {
		
		Game game1 = new ScissorsRockPaper();
		Game game2 = new Dice();
		ScissorsRockPaper sci = (ScissorsRockPaper)game1;  // 인터페이스의 상속받은 가위바위보 게임 멤버변수 draw를 사용하기 위한 명시적 형변환
		
		System.out.println("<Console 창>");
		Scanner sc = new Scanner(System.in);
		char ch = 'D';
		int cnt = 0;
		int cnt2 = 0;
		int win = 0;
		int totalwin = 0;
		int win2 = 0;
		int totalwin2 = 0;
		int draw = 0;
		int lose1 = 0;
		int lose2 = 0;
		
	
		while(ch != 'C') {
			
			System.out.println("게임을 선택하세요");
			System.out.println("A.가위바위보\nB.주사위 값 맞추기\nC.종료");
			ch = sc.next().charAt(0);
			
			if(ch == 'A'){
				System.out.println("가위바위보 게임입니다\n가위바위보중 하나를 선택하세요");
				System.out.println("1:가위, 2:바위, 3:보");
				
				cnt++;
				int you = sc.nextInt();
				sc.nextLine();
				if(you<1 || you>3) {
					System.out.println("다른 수를 입력하세요");
				}
				
				win+=game1.startGame(you);
				draw = sci.draw;
				
				totalwin = win;
				lose1 = cnt - totalwin - draw;
				
			}else if(ch == 'B'){
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요(1~6) 값 중 하나");
				
				cnt2++;
				int you2 = sc.nextInt();
				sc.nextLine();
				if(you2<1 || you2>6) {
					System.out.println("다른 수를 입력하세요");
				}
				
				win2+=game2.startGame(you2);
				
				totalwin2 = win2;
				lose2 = cnt2 - totalwin2;
				
			}else if(ch == 'C'){
				System.out.println("게임을 종료합니다");
				System.out.println("총 전적 " + (totalwin + totalwin2) +" 승 " + draw + " 무 " + (lose1 + lose2) +" 패 " );
				break;
			}else {
				System.out.println("다시입력하세요");
			}
			
		} 
	}
	
}
			

				
			
	    
		
	  
		
