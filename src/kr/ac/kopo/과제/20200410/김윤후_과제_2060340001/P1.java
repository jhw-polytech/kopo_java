package Assignment02;

import java.util.Scanner;

public class P1 {

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

		/*
			윤후씨 if문 조건 쓰다가 짜증안냈어요?? ^^
			else를 이해하시면 조건문안의 &&를 줄일 수 있을 거 같습니다.
			한번 다시 생각해보아용~~
		*/
		
		if (first > second && second>third && first>third ) {
			System.out.printf("%d %d %d",first,second,third);
		}
		else if(first > second && third<second && first>third) {
			System.out.printf("%d %d %d",first,third,second);
		}
		else if(first<second && second>third && third<first) {
			System.out.printf("%d %d %d", second, first, third);
			
		}
		else if(first>second && second<third && third<first) {
			System.out.printf("%d %d %d", third, first, second);
			
		}
		else if(first<second && second>third && third>first) {
			System.out.printf("%d %d %d", second, third, first);
			
		}
		else if(first<second && second<third && third>first) {
			System.out.printf("%d %d %d", third, second, first);
			
		}
		
	}
}

//세개의 경우의수를 IF문과 Else if 를 사용하여 순서를 나열하였습니다.