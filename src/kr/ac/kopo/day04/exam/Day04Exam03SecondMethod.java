package kr.ac.kopo.day04.exam;

import java.util.Scanner;

public class Day04Exam03SecondMethod {
	
	
	public static void maini(String[] args) {

		//입력값을 저장할 배열
		int[][] brr = new int[5][];
		
		//최대값을 저장할 변수
		int max=brr[0][0];
		
		//입력을 받을 때 각기 쪼개서 저장
		
		
		//-----------------------
		
		// 변수 선언

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 입력값을 저장할 배열
		int[] arr = new int[5];

		// 저장된 값을 카운트 하는 변수
		int cnt = 0;

		// 숫자를 거꾸로 출력하기 위해 입력을 문자열로 변환받아 저장할 변수
		String line = "";
		
		// 배열 생성 후 문자열을 한글자씩 저장
		char[] lineArr = new char[line.length()];

		for (int i = 0; i < lineArr.length; i++) {
			lineArr[i] = (line.charAt(i));
		}

		// 배열 생성 후 문자열을 역순으로 한글자씩 저장
		char[] reverseLine = new char[line.length()];

		int lth = lineArr.length;

		for (int i = 0; i < lth-1; i++) {
			reverseLine[i] = lineArr[lth-i-1];
		}

		String reverseArr[] = new String[5];
		cnt = 0;

		for (int i = 0; i < lth; i++) {

			if (reverseLine[i] != ' ') {
				reverseArr[cnt] += reverseLine[i];
			} else {
				cnt++;
			}
		}

		for (int i = 0; i < 5; i++) {

			// 정수로 변환해서 출력(앞에 0을 없애기 위해)
			System.out.println(Integer.parseInt(reverseArr[i]) + " ");
		}

	}

}
