package kr.co.hana.homework05;

public class StringUtil {

	// 대문자 판별
	boolean isUpperChar(char c) {
		if (65 <= c && c <= 90) {
			return true;
		}
		return false;
	}

	// 소문자 판별
	boolean isLowerChar(char c) {
		if (97 <= c && c <= 122) {
			return true;
		}
		return false;
	}

	// 대소 비교 ==> 큰수 반환
	int max(int i, int j) {
		if (i > j) {
			return i;
		} else {
			return j;
		}
	}

	// 대소 비교 ==> 큰수 반환
	int min(int i, int j) {
		if (i < j) {
			return i;
		} else {
			return j;
		}
	}

	// 문자열 거꾸로 변경

	String reverseString(String str) {
		String tmp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			tmp = tmp + str.charAt(i);
		}
		return tmp;
	}

	// 문자열 대문자로 변경

	String toUpperString(String str) {
		int tmp = 0;
		String upper = "";

		for (int i = 0; i < str.length(); i++) {
			tmp = (int) str.charAt(i);
			upper = upper + (char) (tmp - 32);
		}
		return upper;
	}

	// 문자열 소문자로 변경
	String toLowerString(String str) {
		int tmp = 0;
		String lower = "";

		for (int i = 0; i < str.length(); i++) {
			tmp = (int) str.charAt(i);
			lower = lower + (char) (tmp + 32);
		}
		return lower;
	}

}