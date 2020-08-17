package kr.ac.jinwoo.day07.homework;

import java.util.Scanner;

public class IcecreamMarket {

	private int totalIcecreamCnt = 0;
	private int totalIcecreamPrice = 0;
	private int totalCustomer = 0;
	
	private Scanner sc = new Scanner(System.in);
	private Icecream iceArr[];
	
	// 아이스크림 가격 이름 입력 메소드
	public void inputIcecreamInfo(Icecream ice) {
		
		System.out.print("아이스크림명  :" );
		ice.setName(sc.nextLine());
		System.out.print("아이스크림가격 : ");
		ice.setPrice(Integer.parseInt(sc.nextLine()));
		totalIcecreamCnt++;
		totalIcecreamPrice += ice.getPrice();
	}
	
	// 고객이 구매한 아이스크림 정보 출력 메소드
	public void printBill(Icecream[] iceArr) {
		
		System.out.println(" < 총 " + iceArr.length + "개 판매 정보 출력 >");
		System.out.println("번호\t 아이스크림명\t 아이스크림가격");
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.printf("%3d\t%-10s\t%d\n", i+1, iceArr[i].getName(), iceArr[i].getPrice());
		}
	}
	
	// 가게 영업 메소드
	public void open() {
		
		sell();
		String continueStr = "Y";
		
		while(!(continueStr.equals("N") || continueStr.equals("n"))) {
			
			System.out.print("계속 구매할래? (Y/N) => ");
			continueStr = sc.nextLine();
			System.out.println();
			
			if(continueStr.equals("Y") || continueStr.equals("y")) {
				sell();
				System.out.println();
			}
		}
	}
	
	// 아이스크림을 고객에게 판매하는 메소드
	public void sell() {
		
		System.out.print("아이스크림 몇 개 구입할래? ");
		iceArr = new Icecream[Integer.parseInt(sc.nextLine())];
		
		for(int i = 0; i < iceArr.length; i++) {
			
			iceArr[i] = new Icecream();
			System.out.println((i+1) + "번");
			inputIcecreamInfo(iceArr[i]);
		}
		
		totalCustomer++;
		System.out.println();
		printBill(iceArr);
		System.out.println();
	}
	
	// 총 거래된 아이스크림 정보 출력 메소드
	public void printTotalInfo() {
		
		System.out.println("총 " + totalCustomer + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + totalIcecreamCnt + "개");
		System.out.println("총 판매액 : " + totalIcecreamPrice);
	}
}
