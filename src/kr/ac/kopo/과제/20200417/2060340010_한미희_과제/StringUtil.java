package kr.ac.kopo.day6.assignment;

import java.util.Arrays;

public class StringUtil {

	//1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c) 메소드
	boolean isUpperChar(char c) {
		if ((int)'A' <= (int)c && (int)c <= (int)'Z') {		//아스키코드 이용
			return true;
		}else
			return false;
	}
	
	//2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드
	boolean isLowerChar(char c) {
		if ((int)'a' <= (int)c && (int)c <= (int)'z') {		//아스키코드 이용
			return true;
		}else
			return false;
	}
	
	//3. 두개의 숫자를 입력받아 큰수를 반환하는 max(int i, int j) 메소드
	int max(int i, int j) {
		if(i > j) {
			return i;
		}else {
			return j;
		}
	}
	
	//4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드
	int min(int i, int j) {
		if(i < j) {
			return i;
		}else {
			return j;
		}
	}
	
	//5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드
	String reverseString(String str) {
		char[] charArr = new char[str.length()];		//문자열을 담을 배열 생성 
		for(int i = 0; i < str.length(); i++) {			//배열에 문자열을 거꾸로 대입
			charArr[i] = str.charAt(str.length()-1-i);
		}
		return Arrays.toString(charArr);				//배열을 문자열로 바꿔서 반환
	}
	
	//6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드
	String toUpperString(String str) {
		char[] charArr = new char[str.length()];		//문자열을 담을 배열 생성  
		for(int i = 0; i < str.length(); i++) {			//배열에 문자열을 대문자로 바꿔 대입
			charArr[i]= (char)(str.charAt(i)-32);
		}
		return Arrays.toString(charArr);
	}
	
	//(아스키코드에서 임의의 알파벳 문자에 대해 소문자와 대문자는 32만큼 차이난다)
	
	//7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드
	String toLowerString(String str) {
		char[] charArr = new char[str.length()];		//문자열을 담을 배열 생성   
		for(int i = 0; i < str.length(); i++) {			//배열에 문자열을 소문자로 바꿔 대입
			charArr[i]= (char)(str.charAt(i)+32);
		}
		return Arrays.toString(charArr);
	}	
}
