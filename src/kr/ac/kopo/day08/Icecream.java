package kr.ac.kopo.day08;

public class Icecream {
	
	private static String name;
	private static int price;
	
	public Icecream() {
		
	}
	
	public Icecream(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}

}
