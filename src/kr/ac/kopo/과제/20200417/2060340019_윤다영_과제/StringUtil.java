package kr.ac.kopo.assignment.day06;

public class StringUtil {
	
	/*
		다영씨.... 1, 2번 왜 static 썼어요??? 그냥 궁금해서요...
	*/

	//1번 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 메소드
	static boolean isUpperChar(char c) {		
		if(c >= 65 && c <= 90) {
			return true;
		}else return false;		
	}
	
	//2번 문자를 입력받아 해당 문자가 소문자면 true를 반환하는 메소드
	static boolean isLowerChar(char c) {		
		if(c >= 97 && c <= 122) {
			return true;
		}else return false;
	}
	
	//3번 두개의 숫자를 입력받아 큰 수를 반환하는 메소드
	int max(int i, int j) {
		if(i > j) {
			return i;
		}else {
			return j;
		}
	}
	
	//4번 두개의 숫자를 입력받아 작은 수를 반환하는 메소드
	int min(int i, int j) {
		if(i < j) {
			return i;
		}else {
			return j;
		}
	}
	
	//5번 문자열을 입력받아 거꾸로 변경하는 메소드
	String reverseString(String str) {
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;		
	}
	
	//6번 문자열을 입력받아 대문자로 변경하는 메소드
	String toUpperString(String str) {
		String upper = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				upper += (char)(str.charAt(i) - 32);
			}else upper += str.charAt(i);
		}
		return upper;		
	}
	
	//7번 문자열을 입력받아 소문자로 변경하는 메소드
	String toLowerString(String str) {
		String lower = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				lower += (char)(str.charAt(i) + 32);
			}else lower += str.charAt(i);
		}
		return lower;		
	}
	
	
}
