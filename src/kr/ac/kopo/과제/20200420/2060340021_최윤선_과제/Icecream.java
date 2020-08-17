package homework08;

public class Icecream {
	String name;
	int price;
	static int ice_cnt1;//총갯수
	static int ice_cnt2;//지금 입력받는갯수
	static int ice_total_price;
	
	Icecream(){}
	
	Icecream(String name, int price){
		this.name = name;
		this.price=price;
		//Icecream.ice_cnt++;
		//Icecream.ice_total_price++;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}

}
