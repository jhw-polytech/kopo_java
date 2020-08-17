package kr.ac.kopo.day06.homework;

public class StringUtil {

	// 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소드를 작성하시오 
	boolean isUpperChar(char c) {
		if(c >= 'A' && c<='Z') {
			return true;
		}
		return false;
	}

	// 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드를 작성하시오
	boolean isLowerChar(char c) {
		if( c>='a' && c<='z') {
			return true;
		}
		return false;
	}

	// 3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
	int max(int i, int j) {
		if( i>j ) {
			return i;
		}
		return j;
	}

	// 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
	int min(int i, int j) {
		if( i<j ) {
			return i;
		}
		return j;
	}

	// 5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
	String reverseString(String str) {
		int length = str.length();
		String revStr ="";
		for(int i=length -1; i>=0;i--) {
			revStr +=str.charAt(i);
		}
		return revStr;
	}
	
	// 6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
	String toUpperString(String str) {
		String upperStr ="";
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) >='a' && str.charAt(i)<='z') { // 소문자 일 때, 대문자로 변경
				upperStr+=(char)(str.charAt(i)-('a'-'A')); // 'a'와 'A'의 차이는 32, 어떤 알파벳이든 소문자와 대문자의 차이는 32이므로 소문자 일때, 32를 빼면 대문자가 나옵니다.
			}
			else {
				upperStr+=(char)str.charAt(i);
			}
		}
		return upperStr;
	}
	
	// 7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
	String toLowerString(String str) {
		String lowerStr ="";
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) >='A' && str.charAt(i)<='Z') { // 대문자 일 때, 소문자로 변경
				lowerStr+=(char)(str.charAt(i)+('a'-'A')); // 대문자에 32를 더하면 소문자가 나옵니다.
			}
			else {
				lowerStr+=(char)str.charAt(i);
			}
		}
		return lowerStr;
	}
}

