package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~100 사이의 정수 입력 : ");
		int num1 = sc.nextInt(); 
		sc.nextLine();
		
		for (int i=1 ; i<=num1 ; i++) {
			System.out.printf("%d ", i);
		}
		
	}
}