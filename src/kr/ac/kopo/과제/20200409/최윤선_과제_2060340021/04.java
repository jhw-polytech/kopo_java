package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("나눌 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("몫 : "+ (num1/num2)); //몫은 나누기
		System.out.println("나머지 : "+ (num1%num2)); // %d은 나머지연산
		
	}
}