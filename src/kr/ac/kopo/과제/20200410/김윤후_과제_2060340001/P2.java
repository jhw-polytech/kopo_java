package Assignment02;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오");
		int first =sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수를 입력하시오");
		int second =sc.nextInt();
		sc.nextLine();
		System.out.println("세번째 정수를 입력하시오");
		int third =sc.nextInt();
		sc.nextLine();
		System.out.println("네번째 정수 입력하시오");
		int fourth =sc.nextInt();
		sc.nextLine();
		// 각 정수들을 변수로 받음.

		/*
			지금 코드도 훌륭합니다. 논리 &&를 사용하지 않고도 작서할 수 있는 방법을 한번 생각해볼까요???
		*/
		if(first>second && first>third && first>fourth) {
			System.out.printf("%d, %d, %d 중 가장 큰 수 : %d",second,third,fourth,first);
			
		}
		else if(second>first && second>third && second>fourth) {
			System.out.printf("%d, %d, %d 중 가장 큰 수 : %d",first,third,fourth,second);
			
		}
		else if(third>second && third>first && third>fourth) {
			System.out.printf("%d, %d, %d 중 가장 큰 수 : %d",first,second,fourth,third);
			
		}
		else if(fourth>second && fourth>third && first<fourth) {
			System.out.printf("%d, %d, %d 중 가장 큰 수 : %d",first,second,third,fourth);
			
		}
	}
}

//각 변수들 중 변수 값을 비교하여 if문을 통해 가장 큰 값을 도출할 경우 그 값을 적도록 하였습니다. 