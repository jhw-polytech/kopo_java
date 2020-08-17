package jaeheehomework;

import java.util.Scanner;

public class Icecream {
	
	Scanner sc = new Scanner(System.in);
	
	//Icecream 클래스의 멤버 변수 생성합니다
	String name;
	int price;
	
	/*
		info() 메소드에서 입력, 출력을 다 하는 것이 효율적이지 못할거 같아요
		방금 입력했던 정보를 다시 보고 싶어요 입력을 또 해야하니깐요~~~
	*/

	void info(int num) {
		
		//각 아이스크림 별로 name과 price를 입력해야 하기 때문에, num개의 방을 갖는 배열을 만듭니다
		Icecream[] iceArr = new Icecream[num];
		
		for(int i = 0; i < num; i++) {
			
			// 배열의 각 방마다 ICecream클래스의 멤버변수인 name과 price를 입력해주기 위해, 인스턴스 객체를 만듭니다
			iceArr[i] = new Icecream();
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 ***");
			
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("< 총 "+ num + "개의 아이스크림 구매정보 출력 >");
		System.out.printf("%s\t %-10s\t %-10s\t \n", "번호", "아이스크림명", "아이스크림가격");
		
		for(int i = 0; i < num; i++) {
			System.out.printf("%d\t %-10s\t %-10d\t \n", i+1, iceArr[i].name, iceArr[i].price);
			
		}
	}

}
