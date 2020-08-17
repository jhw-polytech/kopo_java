package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 3. 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
 * 1 - 100사이의 정수를 입력 : 60
 *
 * < 1 ~ 60 정수 출력 >
 * 1 2 3 .... 60
 * 
 */
public class Homework3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100사이의 정수를 입력 : ");
		
		int num = sc.nextInt();
		
		System.out.println("< 1 ~ "+num+" 정수 출력 >");
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}

	}
}
