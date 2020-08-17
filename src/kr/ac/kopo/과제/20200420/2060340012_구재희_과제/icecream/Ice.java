package jaeheehomework;

public class Ice {

	private String name;
	private int price;
	
	
	Ice(){
		
	}
	
	//초기화가 일어나는 변수들에 대한 생성자를 만듭니다
	// manage 클래스에서 iceArr[i] = new Ice(name, price) 형태를 쓰기 위해서 만들어줍니다
	Ice(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//Manage클래스에서 은닉성을 지켜주기 위해 다음과 같은 메소드를 만듭니다
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}
