package Homework0420;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] icebox;
	int totalNum;
	int client;
	int totalPrice;

	Scanner sc = new Scanner(System.in);

	int getInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	String getStr(String msg) {
		System.out.print(msg);
		String name = sc.nextLine();
		return name;
	}

	void open() {
		int cnt = getInt("아이스크림 몇개 구입할래? : ");

		icebox = new Icecream[cnt];
		totalNum += cnt;
		client++;

		for (int i = 0; i < icebox.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 ***");
			String name = getStr("아이스크림명 : ");
			int price = getInt("아이스크림가격 : ");
			icebox[i] = new Icecream(name, price);
			totalPrice += price;
		}
		rebuy();
	}

	void rebuy() {
		System.out.print("계속 구매할래? (Y/N) => ");
		String answer = sc.nextLine();
		if (answer.equals("Y")) {
			open();
		}
		if (answer.equals("N")) {
			print();
		}
	}

	void print() {
		System.out.println("< 총 " + totalNum + "개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for (int i = 0; i < icebox.length; i++) {
			Icecream ice = icebox[i];
			System.out.println((i + 1) + "\t" + ice.getName() + "\t\t" + ice.getPrice());
		}
		sell();
	}

	void sell() {
		System.out.println("총 " + client + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + totalNum + "개");
		System.out.println("총 판매액 : "+totalPrice);

	}

}