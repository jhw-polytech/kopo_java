package kr.ac.kopo.assignment.day13;

public class Member {
	
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	

}
