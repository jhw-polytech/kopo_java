package kr.ac.kopo.day07.exam;

public class Icecream {

	private String name;
	private int price;

	
	//기본 생성자
	public Icecream() {
		
	}
	
	Icecream(String name, int price) {
		this.name = name;
		this.price = price;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	

	
}
