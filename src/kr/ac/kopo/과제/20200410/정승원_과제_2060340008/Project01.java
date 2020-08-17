package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
 * 
정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 클래스 
정수 3개를 입력하세요 : 12 6 22
22 12 6
 */
public class Project01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 제어문으로 모든 경우의 수를 판단한다. 
		if (a > b && b > c) { 
			System.out.printf("%d %d %d", a, b, c);
		} else if (b > a && a > c) {
			System.out.printf("%d %d %d", b, a, c);
		} else if (c > a && a > b) {
			System.out.printf("%d %d %d", c, a, b);
		} else if (a > c && c > b) {
			System.out.printf("%d %d %d", a, c, b);
		} else if (c > b && b > a)  {
			System.out.printf("%d %d %d", c, b, a);
		} else if (b > c && c > a)  {
			System.out.printf("%d %d %d", c, b, a);
		}
		
		
	}	
}
