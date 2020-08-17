package hw.hw16;



public class HongAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account("홍길동", 10000);
		User hong = new User("홍길동", ac);
		User mother = new User("어머니", ac);
		User father = new User("아버지", ac);
		
		hong.start();
		mother.start();
		father.start();

	}

}
