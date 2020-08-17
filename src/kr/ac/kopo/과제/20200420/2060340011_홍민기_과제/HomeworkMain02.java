package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class HomeworkMain02 {
	
	public static String removeChar(String oriStr, char delChar) {
		StringBuffer removedStr = new StringBuffer(); // delChar 문자를 제외할 문자열
		
		for(int i=0;i<oriStr.length();i++) {
			if(oriStr.charAt(i)!=delChar) {		// oriStr문자열에서 처음부터 끝까지 탐색하여 delChar와 일치하지 않으면
				removedStr.append(oriStr.charAt(i)); //  removedStr에 문자를 담는다.
			}
		}
		return removedStr.toString();	// StringBuffer타입이므로 String타입으로 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String oriStr = sc.nextLine();
		System.out.print("문자를 입력하세요 : ");
		char delChar = sc.nextLine().charAt(0);
		
		System.out.println(oriStr+" 문자열에서 "+delChar+"을 제거하면 "+removeChar(oriStr,delChar)+"입니다.");
	}

}
