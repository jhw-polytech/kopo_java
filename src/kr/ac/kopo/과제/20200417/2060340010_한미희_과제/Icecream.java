package kr.ac.kopo.day6.assignment;

import java.util.Scanner;

public class Icecream {

	String name;	//이름
	int price;		//가격
	int order;		//순서
	/*
		미희씨 출력하는 코드를 작성하려다 보니 순서를 몰라서 여기다가 더 추가시킨거죠??? ^^
		잘하셨어요~~~ 그러나 순서는 icecream 클래스에서 정말 필요할지에 대해서는 고민을 해봐야합니다~~
	*/
	
	//생성자
	Icecream(String name, int price, int order){
		this.name = name;
		this.price = price;
		this.order = order;
	}
	
	//아이스크림 개별 구매정보 출력 메소드
 	void purchaseInformation() {
		System.out.printf("%-5d%-10s%10d\n", order , name, price);
 	}
 	
}