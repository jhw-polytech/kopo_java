package shlee1993.day10.homework;

import java.util.Scanner;

public class Hw05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < str.length(); i++) {	//문자열 찍는 것과 같은 방법
			for(int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));	//문자 하나씩 출력
			}
			System.out.println();
		}
	}

}
