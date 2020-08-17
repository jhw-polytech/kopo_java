package kr.ac.kopo.day07.exam;

import java.util.Scanner;

public class HelloWorld {

	Scanner sc = new Scanner(System.in);

	String strData;

	
	/*
	 * 주어진 문자열에서 입력받은 문자가 포함된 개수를 return
	*/
	public int checkChar(String strData, char ch) {
		int cnt = -1; // 문자열 검색의 인덱스 역할을 하는 수
		int result = 0; // 개수를 세는 수

		while ((cnt=strData.indexOf(ch, cnt + 1)) != -1) {
			result++;
		}

		return result;
	}

	
	/*
	 * 주어진 문자열에서 입력받은 문자를 제거한 문자열을 return
	*/
	public String removeChar(String oriStr, char delChar) {
		String result="";
		char[] oriArr = oriStr.toCharArray();

		for (int i = 0; i < oriArr.length; i++) {
			if(oriArr[i] != delChar) {
				result += oriArr[i];
			}
		}

		return result;
	}

}
