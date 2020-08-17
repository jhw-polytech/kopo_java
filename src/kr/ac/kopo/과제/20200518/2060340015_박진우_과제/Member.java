package kr.ac.kopo.day13.homework;

public class Member {

	private String id;
	private String password;

	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() { return id; }
	public String getPassword() { return password; }
	
	public void setId(String id) { this.id = id; }
	public void setPassword(String password) { this.password = password; }

}