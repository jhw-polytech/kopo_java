package kr.ac.kopo.day12.project01;

import java.util.Scanner;

public class LotteryController {

	public static void execute() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임수를 입력하세요: ");
		int numOfGame = Integer.parseInt(sc.nextLine());

		Lottery lottery = new Lottery(numOfGame);
		
		// 방식 1:
		lottery.getNumbersBySet(); 
		
		// 방식 2:'
		lottery.getNumbersByArrayList();
		
		// 방식 3:
		lottery.getNumbersByIntArray();
		
		// 방식 4:
		lottery.getNumbersByStack();
		
		sc.close();
		
	}

}
