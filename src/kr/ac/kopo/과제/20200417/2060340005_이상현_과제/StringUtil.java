package shlee1993.day06.homework;

/*
1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소드를 작성하시오
2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true 를 반환하는 isLowerChar(char c) 메소드를 작성하시오
3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
*/

public class StringUtil {
	boolean isUpperChar(char c) {	//1
		return ('A' <= c) && (c <= 'Z') ? true : false;	//삼항연산자를 사용
	}

	boolean isLowerChar(char c) {	//2
		if (('a' <= c) && (c <= 'z'))
			return true;	//if문을 사용
		else
			return false;
	}

	int max(int i, int j) {	//3
		return i > j ? i : j;
	}

	int min(int i, int j) {	//4
		return i < j ? i : j;
	}

	String reverseString(String str) {	//5
		char[] c = new char[str.length()];
		int j = 0;	//c배열의 인덱스 값
		for (int i = str.length() - 1; i >= 0; i--) {
			c[j++] = str.charAt(i);	//저장하면서 c의 인덱스를 증가시킴
		}
		String print = new String(c);
		return print;
	}

	String toUpperString(String str) {	//6
		char[] c = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);	//str문자열의 문자를 하나씩 c배열에 저장
			if ('a' <= c[i] && c[i] <= 'z')
				c[i] -= 'a' - 'A';	//소문자일경우 대소문자의 아스키코드 값의 차이(소문자-대문자)만큼 빼줘서 대문자로 만들어줌
		}
		String print = new String(c);
		return print;
	}

	String toLowerString(String str) {	//7
		char[] c = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);	//str문자열의 문자를 하나씩 c배열에 저장
			if ('A' <= c[i] && c[i] <= 'Z')
				c[i] += 'a' - 'A';	//대문자일경우 대소문자의 아스키코드 값의 차이(소문자-대문자)만큼 빼줘서 소문자로 만들어줌
		}
		String print = new String(c);
		return print;
	}

}
