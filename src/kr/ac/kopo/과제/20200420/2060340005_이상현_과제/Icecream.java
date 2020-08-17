package shlee1993.day07.homework;

public class Icecream {
	private int num;
	private String name;
	private int price;
	
	public void setInfo(int sNum, String name, int price) {	//보안을 위해 멤버변수에 직접 접근할 수없을 경우를 대비해 만든 setInfo
		this.num = sNum;
		this.name = name;
		this.price = price;
	}
	
	public void getInfo() {	//마찬가지로 보안, 객체화를 위해 만든 출력메소드
		System.out.printf("번호 : %3d 이름 : %4s 가격 : %d\n", num, name, price);
	}
	
	public int getPrice() {	//가격 값을 위한 메소드
		return price;
	}

	
	public int getSerial() {	//시리얼 넘버를 리턴하기 위한 메소드
		return num;
	}
	
}
