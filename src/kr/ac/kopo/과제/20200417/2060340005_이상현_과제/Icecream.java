package shlee1993.day06.homework;

public class Icecream {
	int num;
	String name;
	int price;
	
	void setInfo(int sNum, String name, int price) {	//보안을 위해 멤버변수에 직접 접근할 수없을 경우를 대비해 만든 setInfo
		this.num = sNum;
		this.name = name;
		this.price = price;
	}
	
	void getInfo() {	//마찬가지로 보안, 객체화를 위해 만든 출력메소드
		System.out.printf("번호 : %3d 이름 : %4s 가격 : %d\n", num, name, price);
	}
	
}
