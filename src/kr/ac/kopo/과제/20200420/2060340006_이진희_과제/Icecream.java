package test;

public class Icecream {
	String 	name;   //아이스크림명 
	int		price;  //아이스크림가격

	Icecream() {}

	Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}

	String getName() {   //아이스크림명 메소드
		return name;
	}

	int getPrice() {    //아이스크림 가격 메소드
		return price;
	}

}