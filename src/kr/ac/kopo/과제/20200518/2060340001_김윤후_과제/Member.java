package Homework0518;

public class Member {

	private String Id;
	private String Pw;
	
	public String getId() {
		return this.Id;
	}
	
	public String getPw() {
		return this.Pw;
	}
	
	public void SetId(String Id) {
		
		this.Id=Id;
	}
	
	public void SetPw(String Pw) {
		this.Pw=Pw;
	}
	
	public Member(String Id, String Pw) {
		this.Id=Id;
		this.Pw=Pw;
	}
}
