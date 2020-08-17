package test0418;

import java.util.Arrays;

public class StringUtil {
	
	boolean isUpperChar(char c) {
		
		
		if('A' <= c && c <= 'Z') {
			
			boolean bl = true;
			return bl;
		}else {
			
			boolean bl = false;
			return bl;
		}
		
	}
	
	
	boolean isLowerChar(char c) {
		
		
		if('a' <= c && c <= 'z') {
			
			boolean bl = true;
			return bl;
		
		}else {
			
			boolean bl = false;
			return bl;
		}
		
	}
	
	void printChar(char c) {
		
		boolean bl_1 = isUpperChar(c);
		boolean bl_2 = isLowerChar(c);
		
		System.out.println(c + "는 대문자가" + bl_1);
		System.out.println(c + "는 소문자가" + bl_2);
		
	}
	
	
	int max(int i, int j) {
		
		int max =(i>j ? i : j);
		return max;
		
	}
	
	int min(int i, int j) {
		
		int max =(i>j ? j : i);
		return max;
		
	}
	
	void printmaxmin(int i, int j) {
		
		int max = max(i, j);
		int min = min(i, j);
		System.out.println("큰수는 " + max);
		System.out.println("작은수는 " + min);
		
	}
	
	void reverseString(String st) {
		
		String str = st;
		char[] chArr = new char[str.length()];
		
		for(int i = 0;i<str.length();i++) {
			
			 chArr[i] = str.charAt(i);
		}
		
		for(int i = str.length()-1;i>=0 ; i--) {
			
			System.out.print(chArr[i]);
		}
		
	}
	
	void toUpperString(String st) {
		
		String str = st;
		char[] chArr = new char[str.length()];
		
		for(int i = 0;i<str.length();i++) {
			
			 chArr[i] = str.charAt(i);
		}
		
		for(int i = 0;i<str.length();i++) {
			
			if('a' <= chArr[i] && chArr[i] <='z' ) {
				
				 int chr = chArr[i] - ' ';
				 char chra =(char)chr;
				 
				 System.out.print(chra);
				
			}else {
				
				System.out.print(chArr[i]);
			}
			
			
		}
		
	}
		
	void toLowerString(String st) {
		
		String str = st;
		char[] chArr = new char[str.length()];
		
		for(int i = 0;i<str.length();i++) {
			
			chArr[i] = str.charAt(i);
		}
		
		for(int i = 0;i<str.length();i++) {
			
			if('A' <= chArr[i] && chArr[i] <='Z' ) {
				
				int chr = chArr[i] + ' ';
				char chra =(char)chr;
				
				System.out.print(chra);
				
			}else {
				
				System.out.print(chArr[i]);
			}
			
			
		}
		
	}
		
	
	
}
	
	
	
	
	
		

