package Homework_0413;

import java.util.Scanner;

/* 1) 다음의 결과를 보이는 프로그램을 작성하시오.
  아이스크림을 몇개 구입할래? 3
 
*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 메로나
아이스크림가격 : 1000

*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘
아이스크림가격 : 2000

*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅
아이스크림가격 : 800

< 총 3개의 아이스크림 구매정보 출력 >
번호	아이스크림명	아이스크림가격
1	메로나		1000
2	월드콘		2000
3	비비빅		800
*/
public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림을 몇개 구입할래? ");

		int num = Integer.parseInt(sc.nextLine()); // 아이스크림 구입 개수를 num으로 설정
		System.out.println();
		
		Icecream[] iceArr = new Icecream[num]; // 그 개수만큼 Icecream 클래스 객체 배열 생성

		for (int i = 0; i < num; i++) {

			iceArr[i] = new Icecream();	// 배열을 생성하여 아이스크림 구매 정보를 넣어준다.

			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 ***");

			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();	// String형의 name 입력

			System.out.print("아이스크림가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());	// int형의 price 입력
			System.out.println();
		}

		System.out.println("< 총 3개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "\t" + iceArr[i].name + "\t\t" + iceArr[i].price); // 출력시 줄을 맞추기 위해 \t
		}
	}
}
