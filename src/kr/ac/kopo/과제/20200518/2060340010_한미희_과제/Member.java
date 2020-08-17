package kr.ac.kopo.day13.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

	private String id;
	private String password;

	Member(){
	}
	
	Member(String id, String password){
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
