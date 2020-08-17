package day0518.homework;

public class Member {
	private String id;
	private String pw;
	
	public Member() {}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {	//id는 바뀌지 않으므로 set 미구현
		this.pw = pw;
	}

}
