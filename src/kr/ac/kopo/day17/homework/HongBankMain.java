package kr.ac.kopo.day17.homework;

public class HongBankMain {

	public static void main(String[] args) {

		HongAccount hongAcc = new HongAccount("홍길동", 10000);

		HongFamily gildong = new HongFamily("홍길동", hongAcc);
		HongFamily mother = new HongFamily("어머니", hongAcc);
		HongFamily father = new HongFamily("아버지", hongAcc);

		try {
			gildong.start();
			mother.start();
			father.start();
			gildong.join();
			
			System.out.println();
			System.out.println("최종 잔액>> "+hongAcc.getBalance()+"원 입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
