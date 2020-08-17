package jaeheehomework;

import java.util.Scanner;

public class BatMan {
	public static void main(String[] args) {

		System.out.println("문자열을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sArr = s.split("");

		for (int i = 0; i < sArr.length; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print(sArr[j]);
			}
			System.out.println();
		}
	}
}
