package kr.ac.kopo.assignment.day07;

public class IceCream {
	
	private String	name;
	private int		price;
	
	//private 멤버변수를 입출력할 수 있게 하는 메소드
	public void inputName(String name) {
		this.name = name;
	}
	
	public void inputPrice(int price) {
		this.price = price;
	}
	
	public String outputName() {
		return this.name;
	}
	
	public int outputPrice() {
		return this.price;
	}

}
