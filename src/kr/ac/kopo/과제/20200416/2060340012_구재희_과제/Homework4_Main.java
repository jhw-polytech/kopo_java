package jaeheehomework;

import java.util.Scanner;

public class Homework4_Main {
/*1. 다음의 결과를 보이는 프로그램을 작성하시오

아이스크림을 몇개 구입할래? 3 (입력)

*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 메로나 (입력)
아이스크림가격 : 1000 (입력)

*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘 (입력)
아이스크림가격 : 2000 (입력)

*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅 (입력)
아이스크림가격 : 800 (입력)

< 총 3개의 아이스크림 구매정보 출력 >
번호 아이스크림명 아이스크림가격
1 메로나 1000
2 월드콘 2000
3 비비빅 800
 */

/*
	재희씨 과제 잘하셨어요
	근데 아이스크림을 추상화시킨 클래스명이 Homework4_Class라니.... 슬프지 않아요???
	Icecream이라는 이름이 더 이해하기 편하지 않을까요??? ^^
*/

	//실행 클래스이므로 main메소드를 써줍니다
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//아이스크림 구매 개수를 받습니다
		System.out.println("아이스크림을 몇개 구입할래? ");
		int num = Integer.parseInt(sc.nextLine());
		
		//Homework4_Class를 배열로 만듭니다
		Homework4_Class[] iceCream = new Homework4_Class[num];
		
		//for문을 통해 출력물을 작성하고, 비어있는 배열의 변수에 값을 채웁니다
		for(int i = 0; i < num; i++) {
			
			//배열의 각 방에 값을 입력할때마다, class를 사용하겠다는 객체 인스턴스화를 진행하고, 값을 입력받습니다 
			iceCream[i] = new Homework4_Class();
			
			System.out.println("***" + (i+1) + "번째 아이스크림 구매정보 ***");
			
			System.out.print("아이스크림명 : ");
			iceCream[i].name = sc.nextLine();
			
			System.out.print("아이스크림가격 : ");
			iceCream[i].price = Integer.parseInt(sc.nextLine());	
		}
		//출력
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.printf("%s\t %-10s\t %-10s\t \n", "번호", "아이스크림명", "아이스크림가격");
		
		for(int i = 0; i < num; i++) {
			System.out.printf("%d\t %-10s\t %-10d\t \n", i+1, iceCream[i].name, iceCream[i].price);
		}
	}
}
