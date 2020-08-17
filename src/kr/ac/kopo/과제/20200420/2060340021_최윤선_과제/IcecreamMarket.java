package homework08;

import java.util.*;

public class IcecreamMarket {
	Scanner sc = new Scanner(System.in);
	Icecream[] iceArr = new Icecream[100];
	
	int getInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String getStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	void open(Icecream[] iceArr) {
		System.out.println("Icecream.ice_cnt2 = "+Icecream.ice_cnt2);
		System.out.println("Icecream.ice_cnt1 = "+Icecream.ice_cnt1);
		
		int cnt = getInt("아이스크림 몇 개 입력하고싶니? : ");
		Icecream.ice_cnt1 +=cnt; //총갯수
		
		for(int i = Icecream.ice_cnt2; i < Icecream.ice_cnt1  ; i++) {
			System.out.println("*** " + (i+1) + "번째 구매정보 입력 ***");
			String name = getStr("아이스크림명 : ");
			int price   = getInt("아이스크림가격 : ");
			
			iceArr[i] = new Icecream(name, price);
			Icecream.ice_total_price += price;
			Icecream.ice_cnt2++;
		}
		
		String ipt = getStr("더 많은 정보를 입력하고싶은가요? Y 혹은 N로 답하세요");
		
		if( (ipt.charAt(0) =='Y')     ||  ( ipt.charAt(0) =='y')  ) {
			open(iceArr);
		}
		else {
			print(iceArr);
		}
	}
	
	void print(Icecream[] iceArr) {
		System.out.println("< 총 " + Icecream.ice_cnt1+ "개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i = 0; i < Icecream.ice_cnt1; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
		System.out.println("총 아이스크림 갯수 : "+Icecream.ice_cnt1);
		System.out.println("총 아이스크림 가격 : "+Icecream.ice_total_price);
	}
	
}
