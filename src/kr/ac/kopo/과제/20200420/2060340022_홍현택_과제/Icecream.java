package kr.co.hana.homework06;

public class Icecream {

	String name;
	int price;
	
	static int count;
	static int people;
	static int totalPrice;
	
	Icecream() {}
	
	Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
}
