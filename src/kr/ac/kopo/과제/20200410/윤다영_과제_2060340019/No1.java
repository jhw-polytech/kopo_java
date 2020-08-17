package kr.ac.kopo.assignment.day03;

import java.util.Scanner;

public class No1 {
	/*
	 정수 3개를 입력 받아 큰 수에서 작은 수 순으로 출력하는 코드를 작성하시오
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();
		
		// a, b, c 숫자 비교하기
		//a가 제일 클 때
		if(a >= b && a >= c){
			if(b >= c) System.out.println(a+" "+b+" "+c);
			else System.out.println(a+" "+c+" "+b);
		}
		//b가 제일 클 때
		else if(b >= a && b >= c) {
			if(a >= c) System.out.println(b+" "+a+" "+c);
			else System.out.println(b+" "+c+" "+a);
			
		}
		//c가 제일 클 때
		else{
			if(a >= b) System.out.println(c+" "+a+" "+b);
			else System.out.println(c+" "+b+" "+a);
			
		}	
		
	}

}
