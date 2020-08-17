package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 클래스 
1-100사이의 정수를 입력 :60
<1~60 정수 출력 > 1 2 3 ....60
 */

public class Project03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("1-100사이의 정수를 입력 : ");
		int a = sc.nextInt();
		
		System.out.printf("<1~%d 정수 출력 >\n", a); // 앞으로 출력될 숫자를 명시 
		for (int i = 1; i <= a; i++) {
			System.out.printf("%d ", i); // 하나씩 순회하며 요구사항에 맞춰 출력한다. 
		}
		
	}
}
