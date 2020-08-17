package jaeheehomework;

public class PwdChangeMain {
	public static void main(String[] args) {
		
		//이 유저들 회원가입 되어져있다고 가정.
		Member m1 = new Member("Kang", "1234");
		Member m2 = new Member("Kim", "1111");
		Member m3 = new Member("Park", "2222");
		Member m4 = new Member("Lee", "3333");
		
		
		Member m = new Member();
		m.getMemberList().add(m1);
		m.getMemberList().add(m2);
		m.getMemberList().add(m3);
		m.getMemberList().add(m4);
		
		
		
		
		ChangePwd cp = new ChangePwd();
		cp.printAll();
		cp.open();
		
	}

}
