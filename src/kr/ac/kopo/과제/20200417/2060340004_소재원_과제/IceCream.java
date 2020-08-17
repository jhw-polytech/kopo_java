package exam0417;

import java.util.Scanner;

public class IceCream {

	String name;
	int price;
	
	IceCream() {
		name = "";
		price = 999999;
	}

	/*
		과제하느라 고생하셨어요~~ ^^
		조금 더 효율적인 코드를 만들고 싶었을 거라 생각합니다~~~
		클래스를 분리시키는 생각을 한번 해보자구요!! ^^
	*/
	void buyIceCream(int buyCnt) {
		IceCream[] iceArr = new IceCream[buyCnt];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new IceCream();
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		printIceCream(iceArr);
	}

	void printIceCream(IceCream[] iceArr) {
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", iceArr.length);
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n", i+1, iceArr[i].name, iceArr[i].price );
		}
	}

}
