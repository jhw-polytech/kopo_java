package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		Scanner sc=	new Scanner(System.in);
		
		System.out.println("정수를 입력하세요\n");
		int 정수 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("나눌 수를 입력하세요\n");
		int 나눌수 = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("몫 : %d\n",정수/나눌수);
		System.out.printf("몫 : %d",정수%나눌수);
		
		
	}
}

// Scanner를 이용하여 값을 받고, 모드와 나머지를 사용해서 값을 도출함