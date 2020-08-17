package kr.ac.kopo.day07.homework;

public class Icecream {

	String name;	// 아이스크림 이름
	int price;		// 아이스크림 가격
	
	Icecream(){
		
	}
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
}
