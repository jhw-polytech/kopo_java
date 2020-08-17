package exam0417;

public class StringUtil {

	boolean isUpperChar(char c) {
		return ((65 <= (int) c) && ((int) c <= 90)) ? true : false;
	}
	
	boolean isLowerChar(char c) {
		return ((97 <= (int) c) && ((int) c <= 122)) ? true : false;
	}
	
	int max(int i, int j) {
		return i > j ? i : j;
	}
	
	int min(int i, int j) {
		return i > j? j : i;
	}
	
	String reverseString(String str) {
		char[] reverseStr = new char[str.length()];
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr[str.length()-i-1] = str.charAt(i);
		}
		String revStr = new String(reverseStr);
		return revStr;
	}
	
	String toUpperCase(String str) {
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			
			if ((97 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 122)) {
				ch[i] = (char) ((int) str.charAt(i) - 32);
			} 
			
			else if ((65 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 90)) {
				ch[i] = (char) ((int) str.charAt(i));
			}
		}
		String returnStr = new String(ch);
		return returnStr;
	}
	
	String toLowerCase(String str) {
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			
			if ((97 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 122)) {
				ch[i] = (char) ((int) str.charAt(i));
			} 
			
			else if ((65 <= (int) str.charAt(i)) && ((int) str.charAt(i) <= 90)) {
				ch[i] = (char) ((int) str.charAt(i) + 32);
			}
		}
		String returnStr = new String(ch);
		return returnStr;
	}
}
