package kr.ac.jinwoo.day02.homework;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		System.out.println("반지름을 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		
		double r;
		while(true) {
			r = sc.nextDouble();
			sc.nextLine();
			if(r > 0) 
				break;
			else 
				System.out.println("양수를 입력해주세요.");
		}
		
		double rSquare = r*r;
		double circleExtent = Math.PI * rSquare;
		
		System.out.println("-----------------");
		System.out.println("원의 넓이 : PI * r^2");
		System.out.println("-----------------");
		
		System.out.printf("원의 면적은 %.4f입니다.\n", circleExtent);
	}
}
