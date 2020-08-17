package kr.ac.jinwoo.day07.homework;

public class Exam {

	/*
	 * 주어진 문자열에서 입력받은 문자의 개수를 return
	 * 
	 */
	public static int checkChar(String strData, char ch) {
		
		int ret = 0;
		int searchIndex = 0;
		
		while((searchIndex = strData.indexOf(ch, searchIndex+1)) != -1) {
			ret++;
		}
		
		return ret;
	}
	
	/*
	 * 주어진 문자열에서 입력받은 문자를 제거한 문자열을 return
	 * 
	 */
	public static String removeChar(String oriStr, char delChar) {
		
		StringBuffer delStr = new StringBuffer();
		char[] delCopy = oriStr.toCharArray();
				
		for(char item : delCopy) {
			if(item != delChar) 
				delStr.append(item);
		}
		
		return delStr.toString();
	}
	
	public static void main(String[] args) {
		
		String str = "Hello World Java";
		char ch = 'l';
		
		System.out.println(checkChar(str, ch));
		System.out.println(removeChar(str, ch));
	}
}
