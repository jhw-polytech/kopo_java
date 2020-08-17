package kr.co.hana.homework06;

import java.util.Scanner;

public class RemoveChar {

	public static String removeChar(String oriStr, char delChar) {
		// 다른 방식으로 짜보고 싶었는데 마지막 결과가 동일하게 안나오네요..
		
		char newStr;
		StringBuilder sb = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		System.out.printf("입력 스트링 : ");
		oriStr = sc.nextLine();

		System.out.printf("제거할 문자 입력 :");
		delChar = sc.next().charAt(0);
		sc.close();
		
		/*
			sb = new StringBuilder(newStr); 이문장을 
			for문 밖으로 이동시키셔야합니다~~ ^^
		*/
		for (int i = 0; i < oriStr.length(); i++) {
			newStr = oriStr.charAt(i);
			if (newStr != delChar) {
				sb = new StringBuilder(newStr);
				sb = sb.append(newStr);
				System.out.print(sb); // 수정해야할 부분, append로 결과를 만드려고 하다보니 for문 내에서 출력해야 해서 결과가 원하는 대로 나오지 않음
			}
			
		}
		System.out.println(sb);
		return oriStr;
	}

}
