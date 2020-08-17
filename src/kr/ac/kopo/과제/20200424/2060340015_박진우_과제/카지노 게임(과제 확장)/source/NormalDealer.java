package kr.ac.jinwoo.day10.homework2;

public class NormalDealer extends Dealer {

	public NormalDealer() {
		super();
	}
	
	@Override
	public void setSrpThreshold() {
		super.srpThreshold = 0;
	}

	@Override
	public void setDiceThreshold() {
		super.diceThreshold = 0;
	}
	
	@Override
	public void greetingMent() {
		System.out.println("딜러 입장.\n");
		System.out.println("안녕하세요?");
		System.out.println("일반 딜러가 등장했습니다.\n");
	}

	

}
