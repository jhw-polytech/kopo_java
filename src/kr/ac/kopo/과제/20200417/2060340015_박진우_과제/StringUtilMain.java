package kr.ac.jinwoo.day06.homework;

public class StringUtilMain {

	public static void main(String[] args) {
	
		StringUtil strUtil = new StringUtil();
		
		char c = 'i';
		
		boolean t = strUtil.isLowerChar(c);
		
		int i = 3, j = 5;
		
		int max = strUtil.max(i, j);
		int min = strUtil.min(i, j);
		
		System.out.println(t);
		System.out.println(max);
		System.out.println(min);
		
		String str = "Hello";
		
		String ret = strUtil.reverseString(str);
		
		System.out.println(ret);
		
		String str3 = "dasDsadfEEE";
		System.out.println(strUtil.toUpperString(str3));
		
		String str4 = "DSdsafDE";
		System.out.println(strUtil.toLowerString(str4));
		
	}
	
	
}
