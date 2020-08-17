package kr.co.hana.homework01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		
		char input1;
		char input2;
		
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 알파벳 입력
		System.out.println("첫번째 알파벳을 입력하세요! : ");
		input1 = sc.next().charAt(0);
		
		// 두번째 알파벳 입력
		System.out.println("두번째 알파벳을 입력하세요! : ");
		input2 = sc.next().charAt(0);
		int count = (int)input2 - (int)input1 + 1;
		
		/*
			대문자, 소문자의 통합 개수를 구하시면 됩니다. ^^
			문제를 잘못이해하신 듯 혀요..
			다시한번 풀어주세요 수고하셨습니다 ^^
		*/

		if (input1 < 90 && input2 >97) {
			System.out.println("두개의 알파벳 사이에는 " + ((int)count - 6) + " 자가 있습니다.");
		}
		else {
		System.out.println("두개의 알파벳 사이에는 " + (int)count + " 자가 있습니다.");
		}
		sc.close();
		
		
	}
}
