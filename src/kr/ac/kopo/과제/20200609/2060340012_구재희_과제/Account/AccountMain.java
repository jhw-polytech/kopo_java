package accountThread;

public class AccountMain {

	public static void main(String[] args) {
		
		Account ac = new Account("홍길동", 10000);
		
		User u1 = new User("홍길동", ac);
		User u2 = new User("어머니", ac);
		User u3 = new User("아버지", ac);
		
		u1.start();
		u2.start();
		u3.start();
		
		
	}
}
