package kr.ac.jinwoo.day07.homework;

public class Icecream {
	
	private String name;
	private int price;
	
	Icecream(){}
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
