package kr.ac.kopo.assignment.day17;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account ac = new Account("홍길동", 10000);
		
		User hong = new User("홍길동", ac);
		User mom = new User("어머니", ac);
		User dad = new User("아버지", ac);
		
		hong.start();
		mom.start();
		dad.start();
		
		try {
			hong.join();
			mom.join();
			dad.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
