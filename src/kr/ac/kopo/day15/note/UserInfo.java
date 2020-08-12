package kr.ac.kopo.day15.note;


/*
	VO 클래스(Value Obj) : 실제로 어떤 값들을 저장하는 클래스. 기능을 하지 않는다.
	
	
	< 단축키 꿀팁 >
	
	alt + shift + s
	
	+ c	: 기본생성자
	+ o : 매개변수 포함한 생성자
	+ r : getter/setter
	+ s : toString() overriding
	+ v : ovveride 메소드 자동완성
*/

public class UserInfo {
	private String name;
	private int age;
	private String addr;
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

}
