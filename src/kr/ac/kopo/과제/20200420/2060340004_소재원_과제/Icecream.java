package exam0420;

public class Icecream {

	private String 		icecreamName;
	private int 		icecreamPrice;
	private static int 	buyCnt;
	private static int  buyPeople;
	private static int  totalSell;
	
	Icecream() {
		icecreamName = "";
		icecreamPrice = 99999;
	}
	
	Icecream(String icecreamName, int icecreamPrice) {
		this.icecreamName = icecreamName;
		this.icecreamPrice = icecreamPrice;
		Icecream.buyCnt++;
		Icecream.totalSell += icecreamPrice;
	}
	
	public static void updatePeople() {
		buyPeople++;
	}

	public static void totalSell() {
		System.out.printf("총 판매액 : %d원\n", totalSell);
	}
	
	public static void totalDaySell() {
		System.out.printf("판매된 아이스크림 총 개수 : %d개\n", Icecream.buyCnt);
	}
	
	public static void totalDayPeople() {
		System.out.printf("총 %d명의 고객이 아이스크림을 구매했습니다.\n", Icecream.buyPeople);
	}

	public String getIcecreamName() {
		return icecreamName;
	}

	public int getIcecreamPrice() {
		return icecreamPrice;
	}
	
}
