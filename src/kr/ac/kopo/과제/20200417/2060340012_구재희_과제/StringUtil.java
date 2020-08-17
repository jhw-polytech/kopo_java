package jaeheehomework;

public class StringUtil {

	// 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c) 메소드
	boolean isUpperChar(char c) {
		if ((int) c >= 'A' && (int) c <= (int) 'Z') {
			return true;
		} else {
			return false;
		}
	}

	// 2. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c) 메소드
	boolean isLowerChar(char c) {
		if ((int) c >= 'a' && (int) c <= (int) 'z') {
			return true;
		} else {
			return false;
		}
	}

	// 3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드
	int max(int num1, int num2) {
		return (num1 > num2) ? num1:num2;
	}
	
	// 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드
	int min(int num3, int num4) {
		return (num3 < num4) ? num3:num4;
	}
	
	//5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드
	char[] stringReverse(String str) {
		
		// 받은 문자열과 크기가 같은 캐릭터 배열을 만듭니다
		char[] reverseArr = new char[str.length()];
		
		// for문을 이용해서 str의 가장 뒤에 있는 char부터 배열에 넣습니다 
		for(int i = 0; i < str.length(); i++) {
			reverseArr[i] =  str.charAt(str.length() - i - 1);
		}
		return reverseArr;
	}
	
	//6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를
	String stringBig(String str) {
		
		//빈 String을 만듭니다
		String strUp = "";
		
		//빈 string에 하나씩 캐릭터를 더합니다
		for(int i = 0; i < str.length(); i++) {
			
			// 소문자이면, 대문자와 소문자 차이만큼 값을 빼줍니다
			if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) {
				strUp += (char) ( str.charAt(i) - ((int) 'a' - (int) 'A') );
			} else {
				strUp += str.charAt(i);
			}
		}
		return strUp;
	}
	
	
	//7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를
	String stringSmall(String str) {
		String strDown = "";
		for(int i = 0; i < str.length(); i++) {
			if( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ) {
				strDown += (char) ( str.charAt(i) + ((int) 'a' - (int) 'A') );
			} else {
				strDown += str.charAt(i);
			}
		}
		return strDown;
	}
}
