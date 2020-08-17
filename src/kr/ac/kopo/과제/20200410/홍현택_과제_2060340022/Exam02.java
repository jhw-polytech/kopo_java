package kr.co.hana.homework02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	/*
		만일 사용자가 입력한 정수가 음수면 이 코드는 올바른 결과가 안나오자나요....
		이럴때는 for문에 if문을 이용해서 코드를 고치는 것이 더 좋을 거 같습니다. 
	*/

		int num;
		int max = -1;
		
		System.out.println("4개의 정수를 입력하세요 : ");
		
		for (int i = 0; i < 4; i++) {
			num = sc.nextInt();
			
			if (num > max) {
				max = num;
			}
			// ~중 큰수 : 
		}
		System.out.printf("중 큰수 : %d", max);
		
		sc.close();
	}
}
