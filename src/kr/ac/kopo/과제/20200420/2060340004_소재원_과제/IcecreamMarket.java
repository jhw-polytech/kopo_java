package exam0420;

import java.util.Scanner;

public class IcecreamMarket {
	
	Icecream ice;
	Icecream[] iceArr;
	Scanner sc;
	
	IcecreamMarket () {
		sc = new Scanner(System.in);
	}
	
	public String getIcecreamName(String msg) {
		System.out.println(msg);
		String name = sc.nextLine();
		return name;
	}
	
	public int getIcecreamPrice(String msg) {
		System.out.println(msg);
		int price = Integer.parseInt(sc.nextLine());
		return price;
	}
	
	public void orderIcecream() {
		Icecream.updatePeople();
		System.out.println("아이스크림 몇 개 구입할래? : ");
		int orderCnt = Integer.parseInt(sc.nextLine());
		iceArr = new Icecream[orderCnt];
		
		for (int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "번");
			String name = getIcecreamName("아이스크림명 : ");
			int price = getIcecreamPrice("아이스크림가격 : ");
			iceArr[i] = new Icecream(name, price);
			
		}
		printIcecreamOrder(iceArr);
		sc.close();
	}
	
	public void endOfDay() {
		Icecream.totalDayPeople();
		Icecream.totalDaySell();
		Icecream.totalSell();
	}

	public void printIcecreamOrder(Icecream[] iceArr) {
		System.out.println("****** 구매정보 ******");
		System.out.println("번호\t아이스크림명\t가격");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 +"\t"+ iceArr[i].getIcecreamName() + "\t" + iceArr[i].getIcecreamPrice());
		}
		
		System.out.println("계속 구매할래? (Y/N) : ");
		String yesOrNo = sc.nextLine();
		if(yesOrNo.equalsIgnoreCase("Y") == true) {
			orderIcecream();
		} else {
			endOfDay();
		}
		
	}
}
