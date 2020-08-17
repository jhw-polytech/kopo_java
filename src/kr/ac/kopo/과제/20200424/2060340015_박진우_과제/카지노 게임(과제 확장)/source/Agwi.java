package kr.ac.jinwoo.day10.homework2;

public class Agwi extends Dealer {

	public Agwi() {
		super();
	}
	
	@Override
	public void setSrpThreshold() {
		super.srpThreshold = -5;
	}
	
	@Override
	public void setDiceThreshold() {
		super.diceThreshold = -8;
	}

	@Override
	public void greetingMent() {
		System.out.println("딜러 등장\n");
		System.out.println("오함마와 함께 아귀가 등장했습니다.\n");
	}
	
	public void ment1() {
		System.out.println("동작 그만. 밑장 빼기냐?");
	}
	
}
