package kr.ac.yeongnam.day17.homeworkTest3;

public class AccountMain {
	
	public static void main(String[] args) {
		  Account ac = new Account("홍길동", 10000);
		  
		  User user1 = new User("홍길동", ac);
		  User user2 = new User("어머니", ac);
		  User user3 = new User("아버지", ac);

		  user1.start();
		  user2.start();
		  user3.start();
	}

}


