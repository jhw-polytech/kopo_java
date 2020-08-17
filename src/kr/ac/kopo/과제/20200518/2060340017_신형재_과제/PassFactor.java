package homework0518;

import java.util.ArrayList;
import java.util.List;

public class PassFactor {
	private String id;
	private String pw;
	private List<PassFactor> list = new ArrayList<>();
	
	public PassFactor() {
		
	}
	public PassFactor(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	//getter, setter 세팅(auto-generate)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public List<PassFactor> getList() {
		return list;
	}
	public void setList(List<PassFactor> list) {
		this.list = list;
	}
	
}
