package kr.co.hana.homework02;

public class Exam11 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < i - 1; j++) {
				System.out.print("-");
			}
			
			for (int k = 1; k <= 11 - 2*i; k++) {

				System.out.print("*");
			}

			System.out.println("");

		}
	}
}
