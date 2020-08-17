package kr.ac.yeongnam.day06.homework;

import java.util.Scanner;

/*
	영남씨 info()에서 입력도 받고 출력도 하는 코드는 비효율적일거 같아요~~
	다시한번 출력해볼려고 해도 입력을 또 받아야하니깐요~~
	어떻게 분리시킬수 있을지 생각한번 해보세요

	===> 오늘 수업을 듣고, IO 클래스, 컨트롤 클래스, 실행 클래스로 분리해봤습니다.
	===> 피드백 주셔서 감사합니다^^
*/

public class Icecream {
	
	String name;
	int price;
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}


	/*
	String name;
	int price;
	
	void info(int cnt) {		
		Scanner sc = new Scanner(System.in);
		
		Icecream[] iceArr = new Icecream[cnt]; // Iceream 타입의 배열을 생성한다.		
		for(int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new Icecream(); // 배열에 객체를 할당한다.
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 ***");
			System.out.print("아이스크림명 : ");			
			iceArr[i].name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());	
			System.out.println();
		}
		
		System.out.println("< 총 " + cnt + "개의 아이스크림 구매정보 출력 >");		
		System.out.print("번호   " + "아이스크림명   " + "아이스크림가격\n");
		//System.out.printf("%s\t %s\t %s\n", "번호", "아이스크림명", "아이스크림가격");
		for(int i = 1; i <= cnt; i++) {
			System.out.printf("%3d  %7s  %15d\n", i, iceArr[i-1].name, iceArr[i-1].price);
		}		
	}
	*/
	
}
