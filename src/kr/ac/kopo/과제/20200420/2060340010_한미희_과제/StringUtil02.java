package kr.ac.kopo.day7.assignment;

public class StringUtil02 {
	
	String strData;
	char ch;
	String oriStr;
	char delChar;
	
	
	//1. 문자열에서 특정 문자 찾기
	public static int checkChar(String strData, char ch) {
		int count = 0;
		for(int i = 0; i < strData.length(); i++) {
			if ( strData.charAt(i) == ch ) {
				count++ ;
			}
		}
		return count;
	}	

	
	//2. 문자열에서 특정 문자 제거
	public static String removeChar(String strData, char ch) {
		char[] cArr = new char[strData.length()];
		int count = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) != ch) {
				cArr[count] = strData.charAt(i);
				count++;
			}	
		}	
		return (String.valueOf(cArr)).substring(0, count);
	}		
	
		
		
		
	
	
}
