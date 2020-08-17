package kr.ac.kopo.day06;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-9 사이의 단을 입력: ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		Gugudan gu = new Gugudan();
		gu.print();
		
	}
	
	
	
	
	
}
