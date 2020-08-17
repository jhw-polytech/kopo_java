package kr.ac.kopo.day06.exam;

public class StringUtil {

	// ****(질문) 어차피 초기화 하면 길이는 비슷한데 이게 더 좋은건지 모르겠습니다.
	// 자료형별 전역변수 생성하여 메소드 길이 줄이기
	boolean check = false;
	int num;
	char[] charArr;
	String string;

	// 1) 입력 문자가 대문자인지 체크하는 메소드
	public boolean isUpperChar(char c) {
		boolean check = false;
		if ('A' <= c && c <= 'Z') {
			check = true;
		}
		return check;
	}

	// 2) 입력 문자가 소문자인지 체크하는 메소드
	public boolean isLowerChar(char c) {
		boolean check = false;
		if ('a' <= c && c <= 'a') {
			check = true;
		}
		return check;
	}

	// 3) 두개의 숫자를 입력받아 큰수를 반환하는 메소드
	public int max(int i, int j) {
		int num = i;
		if (i < j) {
			num = j;
		}
		return num;
	}

	// 4) 두개의 숫자를 입력받아 작은수를 반환하는 메소드
	public int min(int i, int j) {
		int num = i;
		if (i > j) {
			num = j;
		}
		return num;

	}

	// 5) 문자열을 입력받아 거꾸로 변경하는 메소드
	public String reverseString(String str) {
		String string = "";
		// 입력받은 문자열의 문자를 뒤에서부터 하나씩 string에 누적저장
		for (int i = 1; i <= str.length(); i++) {
			string += str.charAt(str.length() - i);
		}
		return string;
	}

	// 6) 문자열을 입력받아 대문자로 변경하는 메소드
	public String toUpperString(String str) {
		string = "";
		int code;

		for (int i = 0; i < str.length(); i++) {
			code = (int) str.charAt(i);
			if (97 <= code && code <= 122) { // 아스키코드 소문자는 97~122(a~z)
				code -= 32;
			}
			string += (char)code;
		}
		return string;
	}

	// 7) 문자열을 입력받아 소문자로 변경하는 메소드
	public String toLowerString(String str) {
		string = "";
		int code;

		for (int i = 0; i < str.length(); i++) {
			code = (int) str.charAt(i);
			if (65 <= code && code <= 90) { // 아스키코드 대문자는 65~90(A~Z)
				code += 32;
			}
			string += (char)code;
		}
		return string;
	}

}
