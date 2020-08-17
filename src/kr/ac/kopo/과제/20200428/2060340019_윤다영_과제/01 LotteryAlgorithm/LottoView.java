package kr.ac.kopo.assignment.day12;

import java.util.Scanner;

public class LottoView {
	
	private Scanner sc;

	
	public LottoView() {
		sc = new Scanner(System.in);
	}
	

	public int startGame() {
		System.out.println("-----------로또 추천 프로그램-----------");
		System.out.print("게임 수를 입력하세요 : ");
		int result = sc.nextInt();
		
		return result;
	}
	
	public int selectAlgo() {
		System.out.print("어떤 방식의 알고리즘을 사용하시겠습니까?(1 ~ 4중 선택)");
		int result = sc.nextInt();
		
		return result;
		
	}
	
	
	
	
}
