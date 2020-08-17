package homework0420;

/*
 * 2060340017 신형재 과제 1번
 * 1. 임의의 문자열 입력
 * 2. 임의의 문자 입력
 * 3. 입력된 문자열 중 해당 문자의 갯수를 출력
 */

/*
	형재씨... 우리 checkChar() static이었던거 같은데요...
	static 메소드로 한번만 다시 작성해주세요 ^^
*/

import java.util.Scanner;

public class working {
	Scanner sc = new Scanner(System.in);
	
	String snt;
	char c;
	//문자열 입력 메서드
	void inputStr() {
		System.out.print("문자열을 입력하세요 :  ");
		snt = sc.nextLine();
	}
	//문자 입력 메서드
	void inputChar() {
		System.out.print("찾으실 문자를 입력하세요 : ");
		c = sc.next().charAt(0);
		sc.nextLine();
	}
	// 문자열 중 해당 문자가 있는 경우 result값 1씩 증가, 해당 변수 리
	int countChar(String snt, char c) {
		int countNum = -1;
		int result = 0;
		while ((countNum = snt.indexOf(c, countNum+1)) != -1) {
            result++; // 발견하면 answer을 하나 늘려준다.
        }return result;
	}
	
	public void checkChar() {
		inputStr();
//		System.out.println(snt); 확인용
		inputChar();
//		System.out.println(c); 확인용
		System.out.println(snt + " 문자열의 " + c + " 는 " + countChar(snt, c) + " 개 있습니다.");
	}
	
}
