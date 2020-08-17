package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr;
	Scanner sc;
	int visitor;		// open하는 동안 가게를 방문하는 손님의 수를 담을 변수
	int num;			// open하는 동안 팔리는 아이스크림의 개수를 담은 변수
	int sales;			// open하는 동안 총 판매액을 담을 변수

	IcecreamMarket(){
		sc = new Scanner(System.in);
	}

	int getInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	String getStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();

		return str;
	}

	void open() {
		
		String yesOrNo = "YyNn";

		String purchase = "y";
		while(purchase.equals("Y") || purchase.equals("y")) {
			visitor++;	// 구매의향이 있는 손님이 있을때마다 값을 증가시킨다.
			
			int cnt = getInt("아이스크림 몇개 구입할래? : ");
			iceArr = new Icecream[cnt];
			
			for(int i=0;i<iceArr.length;i++) {
				System.out.println("*** "+(i+1) +"번째 구매정보 입력 ***");
				String name = getStr("아이스크림명 : ");
				int price = getInt("아이스크림가격 : ");

				iceArr[i] = new Icecream(name,price);
				num++;			// 아이스크림을 구매할때마다 판매개수를 증가시킨다.
				sales +=price;	// 매출액을 증가시킨다.
			}

			print();
			
			purchase = getStr("계속구매할래?(Y/N) => "); // 다음 손님에게 구매의향을 물어본다.
			while(!yesOrNo.contains(purchase)) { // YyNn 외의 다른 값이 입력됐을 시 재입력 받게한다.
				purchase = getStr("Y또는N 을 입력하세요^^. 계속구매할래?(Y/N) => ");
			}
		}
		calculate();	// 손님들이 구매의향이 없을 때, 방문손님 수와 총 판매 개수, 매출액을 나타내는 메소드
	}

	void print() {
		System.out.println("< 총 "+iceArr.length +"개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i=0;i<iceArr.length;i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1,ice.getName(), ice.getPrice());
		}
		System.out.println();
	}
	
	void calculate() {
		System.out.println("총 "+visitor+"명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : "+num+"개");
		System.out.println("총 판매액 : "+sales);
	}
}
