package exam0409;

import java.util.Scanner;

public class no6 {
	/*
		재원씨.. 입력받은 문자열의 개수가 아니라 대문자 소문자의 알파벳 개수를 구하는 문제입니다.
		한번만 다시 해주세요~ ^^
	 * length() 메소드로 쉽게 계산할 수 있다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 아무렇게나 연달아 입력하세요.");
		String alphabet = sc.nextLine();
		sc.close();
		
		System.out.printf("개수  ? : %d", alphabet.length());
	}
}

