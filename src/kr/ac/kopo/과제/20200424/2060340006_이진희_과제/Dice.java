package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Dice implements Game{

	@Override
	public int startGame(int you) {
		int re = 0;
		int r = (int)(Math.random() * 6) + 1;
		System.out.println("치트키 : " + r);
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위를 선택하세요 (1~6 값 중 하나)");
		int me = 0;
		while(true) {
			me = GameMain.scan.nextInt();
			if(me >= 1 && me <= 6) {
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		if(me == r) {
			System.out.println("You win");
			re = 1;
		}else {
			System.out.println("You lose");
		}		
		return re;		
	}

}