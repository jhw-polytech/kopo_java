package kr.ac.jinwoo.day12.homework.BoardHomework;

// 유저의 성격
public class User extends Data{

	private String id;
	private String password;
	
	public User() {
		
	};
	
	public User(String line) {
		super(line);
	}

	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// getter
	public String getId() { return id; }
	public String getPassword() { return password; }
	// setter
	public void setId(String id) { this.id = id; }
	public void setPassword(String password) { this.password = password; }
	
}