package shlee1993.day07.homework;

import java.util.Scanner;

/*
	상현씨... 클래스명 대문자로 쓰는거 주의해주세요 ~  ^^
	checkChar, removeChar() 메소드를 StringUtil클래스에 만들어놓고... main()에서 호출을 해보세요..
	같은 클래스내에서는 static메소드이건, non-static메소드이건 호출이 동일하니깐요.. 연습삼아서요...
*/

public class checkAndDelCharMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 안에 해당 문자의 개수 찾기");
		System.out.println("문자열 입력 : ");
		String strData = sc.nextLine();

		System.out.println("삭제하고싶은 문자를 입력하세요.");
		char ch = sc.nextLine().charAt(0);

		System.out.println(ch + "는 " + checkChar(strData, ch) + "개 있습니다");

		System.out.println("문자열 안에 해당 문자 전부 지우기");
		System.out.println("문자열 입력 : ");
		String oriStr = sc.nextLine();

		System.out.println("삭제하고싶은 문자를 입력하세요.");
		char delChar = sc.nextLine().charAt(0);

		System.out.println(removeChar(oriStr, delChar));
		sc.close();
	}

	public static int checkChar(String strData, char ch) {
		int cnt = 0;	//개수를 세기 위한 변수
		int index = -1;	//무한 루프를 빠져나오기 위한 숫자

		while ((index = strData.indexOf(ch, index + 1)) != -1) {	
			cnt++;	//발견하면 answer을 하나 늘려준다.
		}

		return cnt;
	}

	public static String removeChar(String oriStr, char delChar) {
		StringBuffer str = new StringBuffer();	//문자열이 변화하기 때문에 StringBuffer를 활용

		for (int i = 0; i < oriStr.length(); i++) {
			if (oriStr.charAt(i) != delChar)	//지울 문자와 같지 않다면 값을 저장
				str.append(oriStr.charAt(i));
		}

		return str.toString();
	}

}
