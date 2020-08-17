package kr.ac.jinwoo.day06.homework;

public class StringUtil {
	
	char[] stringCopyToChar(String str) {
		char[] ret;
		ret = new char[str.length()];
		str.getChars(0, str.length(), ret, 0);
		
		return ret;
	}
	
	char convertChar(char c) {
		if(isUpperChar(c))
			c += 32;
		else if(isLowerChar(c))
			c -= 32;
		return c;
	}
	
	boolean isUpperChar(char c) {
		return ('A' <= c && c <= 'Z') ? true : false;
	}
	
	boolean isLowerChar(char c) {
		return ('a' <= c && c <= 'z') ? true : false;
	}
	
	int max(int i, int j) {
		return (i > j) ? i : j;
	}
	
	int min(int i, int j ) {
		return (i < j) ? i : j;
	}
	
	String reverseString(String str) {

		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = chArr.length-1; i >= 0; i--)
			ret += chArr[i];
		
		return ret;
	}
	
	String toUpperString(String str) {
		
		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = 0; i < chArr.length; i++)
			ret += (isUpperChar(chArr[i]) ? convertChar(chArr[i]) : chArr[i]);
		
		return ret;
	}
	 
	String toLowerString(String str) {
		
		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = 0; i < chArr.length; i++)
			ret += (isLowerChar(chArr[i]) ? convertChar(chArr[i]) : chArr[i]);
		
		return ret;
	}
}
