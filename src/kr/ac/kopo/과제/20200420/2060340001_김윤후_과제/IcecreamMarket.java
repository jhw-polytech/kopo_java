package Assignment06;

import java.util.Scanner;

public class IcecreamMarket {


	Icecream[] iceArr;//객체 선언
	Scanner sc;
	static int totalcustomer;
	static int totalitem;
	static int totalsum;
	
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
				
		int cnt = getInt("아이스크림 몇개 입력할래? : ");
		iceArr = new Icecream[cnt];
		totalitem+=cnt;
		totalcustomer++;
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 구매정보 입력 ***");
			String name = getStr("아이스크림명 : ");
			int price   = getInt("아이스크림가격 : ");
			
			iceArr[i] = new Icecream(name, price);
		}
		
		for(int i=0; i<iceArr.length;i++) {
			totalsum+=iceArr[i].price;
		}
		
		print();
		conti();
	}
	
	void print() {
		System.out.println("< 총 " + iceArr.length + "개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i = 0; i < iceArr.length; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
	}
	
	void conti() {
		System.out.println("계속 구매할래?(Y/N)");
		String conti=sc.nextLine();
		char ch=conti.charAt(0);
		if (ch=='y') {
			open();
			totalcustomer++;
		}
		else if(ch=='n') {
			System.out.println("총 "+totalcustomer+"명의 고객이 아이스크림을 구매했습니다.");
			System.out.println("총 판매된 아이스크림 수 "+totalitem);
			System.out.println("총 아이스크림 값"+totalsum);
		}
		else {
			System.out.println("잘못 입력했네");
		}
	}



}
