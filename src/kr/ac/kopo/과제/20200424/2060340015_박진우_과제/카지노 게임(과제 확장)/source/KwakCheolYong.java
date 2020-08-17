package kr.ac.jinwoo.day10.homework2;

public class KwakCheolYong extends Dealer {

	public KwakCheolYong() {
		super();
	}
	
	@Override
	public void setSrpThreshold() {
		
		super.srpThreshold = 10;
	}

	@Override
	public void setDiceThreshold() {
		
		super.diceThreshold = 12;
	}
	
	
	@Override
	public void greetingMent() {
		System.out.println("딜러 등장.\n");
		
		System.out.println("이 시대 순정남 곽철용이 등장했습니다.\n");
	}

}
