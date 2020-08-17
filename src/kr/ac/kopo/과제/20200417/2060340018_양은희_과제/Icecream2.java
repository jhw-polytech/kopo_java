package Homework0417;

import java.util.Scanner;

// 9. 어제 과제 아이스크림구하는 코드에 메소드를 추가해서 작성해보세요.
 // 반복되는 코드를 최소화 하기 위해 Icecream2 클래스에 메소드를 생성해준다.

	public class Icecream2 {
	
	String name;	// 아이스크림명
	int price;	// 아이스크림가격
	
	Scanner sc = new Scanner(System.in);

	void icebox(int num) {	// 메소드 생성
		
	Icecream2[] iceArr = new Icecream2[num]; // 그 개수만큼 Icecream 클래스 객체 배열 생성

	for (int i = 0; i < num; i++) {

		iceArr[i] = new Icecream2();	// 배열을 생성하여 아이스크림 구매 정보를 넣어준다.

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