package kr.ac.kopo.assignment.day10;

import java.util.Random;
import java.util.Scanner;

public class GameSuper {
	
	protected Random ran;
	protected Scanner sc;
	
	//전적 계산을 위한 static
	protected static int wins;
	protected static int losses;
	protected static int draws;
	
	
	
	public GameSuper() {
		ran = new Random();
		sc = new Scanner(System.in);
	}

	
	//게임 결과 출력하는 메소드
	public void printResult(int result) {
		
		if(result == 1) {
			System.out.println("YOU WIN");
		}else if(result == 0) {
			System.out.println("YOU LOSE");
		}
	}
	
	
	//게임의 총 결과를 출력하는 메소드
	public void finalResult() {
		
		System.out.println("<<게임을 종료합니다>>");
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무입니다.", wins, losses, draws);		
	}

}
