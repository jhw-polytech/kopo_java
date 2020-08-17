package kr.ac.yeongnam.day13.homework;

public class Member {

	private String name;
	private String password;
	
	Member(String name, String password){
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
