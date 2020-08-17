package kr.ac.jinwoo.day10.homework2;

public class Goni extends Dealer {

	public Goni() {
		super();
	}
	
	@Override
	public void setSrpThreshold() {
		
		super.srpThreshold = -10;
	}
	
	@Override
	public void setDiceThreshold() {
		
		super.diceThreshold = -12;
	}
	
	@Override
	public void greetingMent() {	
		System.out.println("딜러 등장.\n");
		System.out.println("싸늘한 공기와 함께 전설의 타짜 고니가 등장했습니다.\n");
	}

}
