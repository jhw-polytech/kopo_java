package kr.ac.jinwoo.day06.homework;

/*
 * ※ 질문
 * 
 * calulator 클래스의 질문과 같습니다.
 * 
 * iceCream이라는 객체를 고민해보았을 때 단순히 데이터만 저장하는 객체로 생각되었고
 * 
 * 입출력문 없이 데이터만 저장하는 클래스로 만드는 것이 더 독립적이라고 생각되어 main에서 입출력을 제어하게 되었습니다.
 * 
 * 객체 설계가 처음이다보니 어디까지를 경계로 잡아야할지, 무엇이 맞는지 판단하기가 참 애매한 것 같습니다.
 * 
 * 어떻게 접근하는게 좋은지 알려주시면 정말 감사하겠습니다 교수님.
 */
 /*
	==> 답변
	   그렇죠... Icecream 클래스는 이렇게 구현하는 것은 맞아요~~~~
	   그러다보니 배열은 main에 작성되자나요..
	   이걸 어떻게 쪼갤수 있는지 생각을 해보는 것이 중요할 거 같습니다
	   수업시간에 다시 얘기해볼게요
 */

public class Icecream {
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
