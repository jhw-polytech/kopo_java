package test;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr;
	Scanner sc;
	
	IcecreamMarket() {
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

			int cnt = getInt("아이스크림 몇개 구입할래? : ");
			iceArr = new Icecream[cnt];

/*
			진희씨.... for문 에러안났어요???? 42줄에서 ArrayIndexOutOfBoudsException 발생할 거 같은데요....
*/
			for (int i = 1; i <= iceArr.length; i++) {
				System.out.println("*** " + i + "번째 구매정보 입력 ***");
				String name = getStr("아이스크림명 : ");
				int price = getInt("아이스크림가격 : ");

				iceArr[i] = new Icecream(name, price);
				num++; // 아이스크림을 구매할때마다 판매개수를 증가시킨다.
				sales += price; // 매출액을 증가시킨다.
			}
	}

	void print() {
		System.out.println("< 총 " + iceArr.length + "개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i = 0; i < iceArr.length; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
		System.out.println("계속 구매할래? (Y/N) => ");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') open(); // 계속 구매하겠다-> open()을 반복 
		else end(); // 구매 안하겠다 -> 마지막 출력문을 출력하고 종료 
	}

	void end() {
		System.out.println("총 " + iceArr.length + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + num + "개");
		System.out.println("총 판매액 : " + sales);
	}
}
