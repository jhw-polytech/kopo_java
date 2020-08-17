package jaeheehomework;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	//field
	private String id;
	private String pwd;
	
	private static List<Member> memberList = new ArrayList<>();
	
	
	public Member() {
		
	}

	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	//getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
		
	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
}
