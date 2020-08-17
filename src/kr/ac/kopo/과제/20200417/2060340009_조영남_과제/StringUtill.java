package kr.ac.yeongnam.day06.homework;

import java.util.Arrays;

public class StringUtill {
		
	/**
	 * 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 메소드
	 * @param c
	 * @return
	 */
	boolean isUpperChar(char c){		
		
		if(c >= 65 && c <= 90) {
			return true;
		}		
		return false;
	}
		
	/**
	 * 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 메소드
	 * @param c
	 * @return
	 */
	boolean isLowerChar(char c) {
		if(c >= 97 && c <= 122) {
			return true;
		}		
		return false;
	}
	
	/**
	 * 두개의 정수를 입력받아 큰수를 반환하는 메소드
	 * @param i
	 * @param j
	 * @return
	 */
	int max(int i, int j) {
		if(i >= j) {
			return i;
		} else {
			return j;
		}		
	}

	/**
	 * 두개의 정수를 입력받아 작은수를 반환하는 메소드
	 * @param i
	 * @param j
	 * @return
	 */
	int min(int i, int j) {
		if(i >= j) {
			return j;
		} else {
			return i;
		}		
	}
		
	/**
	 * 문자열을 입력받아 거꾸로 변경하는 메소드
	 * @param str
	 * @return
	 */
	String reverseString(String str) {
		
		String reverseString = "";
		for(int i = str.length()-1; i >= 0; i--) {				
			reverseString += str.charAt(i);
		}				
		return reverseString;		
	}
		
	/**
	 * 문자열을 입력받아 대문자로 변경하는 메소드
	 * @param str
	 * @return
	 */	
	String toUpperString(String str) {
		
		String upperStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				 upperStr += (char) (str.charAt(i) - 32);
			} else {
				upperStr += str.charAt(i);
			}			
		}		
		return upperStr;		
	}
		
	/**
	 * 문자열을 입력받아 소문자로 변경하는 메소드
	 * @param str
	 * @return
	 */
	String toLowerString(String str) {		
		
		String lowerStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				lowerStr += (char) (str.charAt(i) + 32);
			} else {
				lowerStr += str.charAt(i);
			}			
		}
		return lowerStr;		
	}		
}
