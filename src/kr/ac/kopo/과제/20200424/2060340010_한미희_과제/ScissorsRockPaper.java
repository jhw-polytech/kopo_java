package kr.ac.kopo.day10.homework;

public class ScissorsRockPaper implements Game {

	final static int Scissors = 1;
	final static int Rock = 2;
	final static int Paper =  3;
	
	@Override
	public int startGame(int you) {
		//난수 1~3의 값을 구한다
		int me = (int)(Math.random() * 3 + 1);	//Math.random(): 0.0보다 크거나 같고 1.0보다 작은 난수 추출
		
		//i)비긴경우
		if(me == you) {
			System.out.println("비겼습니다");
			return -1;		//승, 패, 무 개수를 세기 위해 반환값 다르게 수정
		
		//ii)지거나 이기는 경우
		}else if(me == Scissors && you == Paper) {
			System.out.println("You lose");
			return 0;
		}else if(me == Scissors && you == Rock) {
			System.out.println("You win");
			return 1;
		}else if(me == Rock && you == Scissors) {
			System.out.println("You lose");
			return 0;
		}else if(me == Rock && you == Paper) {
			System.out.println("You win");
			return 1;
		}else if(me == Paper && you == Scissors) {
			System.out.println("You win");
			return 1;
		}else {	//(me == Paper && you == Rock) 
			System.out.println("You lose");
			return 0;
		}
	}
	
}		
	/*
	//ii)사용자가 이긴 경우
	}else if((you - me == 1) | (you - me == -2)){
		return	1;
	//iii)사용자가 진 경우
	}else {
		return 0;
	}
	*/