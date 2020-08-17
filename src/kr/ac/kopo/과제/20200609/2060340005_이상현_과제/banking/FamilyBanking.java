package day0609.homework.banking;

public class FamilyBanking {

	public static void main(String[] args) {
		Account account = new Account();
		User me = new User("홍길동", account);
		User mom = new User("어머니", account);
		User dad = new User("아버지", account);

		me.start();
		mom.start();
		dad.start();
		
		try {
			me.join();
			mom.join();
			dad.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료합니다...");
	}

}