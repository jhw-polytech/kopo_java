package Homework0417;

//- 아래의 내용을 만족하는 StringUtil 클래스를 작성합니다.

public class StringUtil {

	// 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c)메소드를 작성하시오.
	boolean isUpperChar(char c) {
		return ((65 <= c && c <= 90) ? true : false);// 아스키코드표에서 대문자는 65~90
	}

	// 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c)메소드를 작성하시오.
	boolean isLowerChar(char c) {
		return ((97 <= c && c <= 122) ? true : false) ; // 아스키코드표에서 소문자는 97~122
	}

	// 3. 두개의 숫자를 입력받아 큰수를 반환하는 max(int i, int j) 메소드를 작성하시오.
	int max(int i, int j) {
		return ((i >= j) ? i : j) ;
	}

	// 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오.
	int min(int i, int j) {
		return ((i < j) ? i : j) ;
	}

	// 5. 문자열을 입력받아 거꾸로 변경하는 reverseString(String str)메소드를 작성하시오.
	String reverseSring(String str) {

		String str_rev="";
	
		for(int i = str.length()-1  ; i >=0 ; i--) {
			str_rev += str.charAt(i);
		}
		return str_rev;
	}

	// 6. 문자열을 입력받아 대문자로 변경하는 toUpperString(String str)메소드를 작성하시오.
	String toUpperString(String str) {

		String str_large = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				str_large += (char) (str.charAt(i) - 32);
			}
			else {
				str_large += str.charAt(i);
			}
		}
		return str_large;
	}

	// 7. 문자열을 입력받아 소문자로 변경하는 toLowerString(String str)메소드를 작성하시오.
	String toLowerString(String str) {

		String str_small = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				str_small += (char) (str.charAt(i) + 32);
			}else
			{
				str_small +=str.charAt(i);
			}
		}
		return str_small;
	}
}