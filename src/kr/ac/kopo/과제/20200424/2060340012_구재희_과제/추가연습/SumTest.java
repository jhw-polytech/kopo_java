package jaeheehomework;

import java.util.Scanner;

public class SumTest {

	int num;
	int sum;
	Scanner sc;
	
	SumTest(){
		sc = new Scanner(System.in);
	}
	
	public void sumProcess() {

		for(int cnt = 1; cnt <=3; cnt++) {
			sum = 0;
			System.out.println("숫자를 입력하세요 : ");
			num = Integer.parseInt(sc.nextLine());

			if (num % 2 == 0) {
				for (int i = 0; i <= num; i += 2) {
					sum += i;
				}
				System.out.println("결과 값 : " + sum);
			} else {
				for (int i = 1; i <= num; i += 2) {
					sum += i;
				}
				System.out.println("결과 값 : " + sum);
			}
		}
	}
	
	
	public static void main(String[] args) {
		SumTest s = new SumTest();
		s.sumProcess();
	}
}
