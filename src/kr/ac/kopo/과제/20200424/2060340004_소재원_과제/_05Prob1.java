package exam0424.etc;

import java.util.Scanner;

public class _05Prob1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 > ");
		String str = sc.nextLine();
		sc.close();
		
		for( int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++ ) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
