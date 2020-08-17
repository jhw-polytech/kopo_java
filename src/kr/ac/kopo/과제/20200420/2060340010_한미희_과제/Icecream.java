package kr.ac.kopo.day7.assignment;

public class Icecream {
	
	//멤버변수 선언
	String name;
	int price;
	
	
	//생성자
	Icecream(){}
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	//멤버변수의 값을 전달하는 메소드
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	
}
