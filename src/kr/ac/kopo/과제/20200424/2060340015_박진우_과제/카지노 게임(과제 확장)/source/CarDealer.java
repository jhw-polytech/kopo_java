package kr.ac.jinwoo.day10.homework2;

public class CarDealer extends Dealer {

	public CarDealer(){
		super();
	}
	
	@Override
	public void setSrpThreshold() {
		super.srpThreshold = 5;
	}

	@Override
	public void setDiceThreshold() {
		super.diceThreshold = 7;
	}

	
	@Override
	public void greetingMent() {
		System.out.println("딜러 등장.\n");
		System.out.println("엥? 자동차 딜러가 등장했습니다.\n");
	}

}
