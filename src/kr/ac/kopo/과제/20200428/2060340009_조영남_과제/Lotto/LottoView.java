package kr.ac.yeongnam.day12.homework;

import java.util.Random;
import java.util.Scanner;

public class LottoView {
	
	private Scanner sc;
	private Random r;
	private int gameNum;
	private int algoNum;
	private LottoMaker lm;
	
	public void gameStart() {
		sc = new Scanner(System.in);
		r = new Random();
		
		System.out.print("게임 수를 입력하세요 : ");
		gameNum = sc.nextInt();
		sc.nextLine();
		
		algoNum = r.nextInt(4) + 1;
				
		lm = new LottoMaker();
		lm.maker(algoNum, gameNum);
		
	}

}
