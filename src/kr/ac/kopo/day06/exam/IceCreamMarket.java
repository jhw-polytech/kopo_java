package kr.ac.kopo.day06.exam;

import java.util.Scanner;

// 비즈니스 클래스 = 서비스 클래스 = 제어 클래스 역할을 하는 IceCreamMarket 클래스를 생성했다.

public class IceCreamMarket {
	
	IcecreamSolution[] iceArr; //고객 한 명에 대한 판매정보를 기억하는 배열
	Scanner sc = new Scanner(System.in);
	
	
	int getInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	
	void open() {
		
		int cnt = getInt("아이스크림 몇개 입력할래? : ");
		iceArr = new IcecreamSolution[cnt];
		
	}

}
