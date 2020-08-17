package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력 : ");
		int rad = sc.nextInt(); //반지름입력
		sc.nextLine();
		
		final double PI = 3.141592; //수정못하게 고정
		
		double area = (rad * rad * PI); // pi * r ^2
		System.out.println("원의 면적은 " + area + " 입니다.");
		
	}
}