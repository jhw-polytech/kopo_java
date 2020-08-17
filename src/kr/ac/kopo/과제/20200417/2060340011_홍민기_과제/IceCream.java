package kr.ac.kopo.day06.homework;

public class IceCream {

	String name; // 아이스크림명
	String price; // 아이스크림가격
	
	IceCream(String name, String price){
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return this.name;
	}
	
	String getPrice() {
		return this.price;
	}
	
	void print() {
		System.out.println(getName()+"\t\t"+getPrice());
	}
}
