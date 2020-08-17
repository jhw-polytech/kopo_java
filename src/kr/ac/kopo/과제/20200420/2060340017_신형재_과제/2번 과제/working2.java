package homework0420;
/*
 * 2060340017 신형재 과제 2번
 * 1. 임의의 문자열 입력
 * 2. 임의의 문자 입력
 * 3. 입력된 문자열 중 해당 문자를 삭제한 문자열 출력
 */
import java.util.Scanner;

public class working2 {
	
	Scanner sc = new Scanner(System.in);
	
	String snt;
	char c;
	
	// 문자열 입력 메서드
	void inputSnt() {
		System.out.print("문자열을 입력하세요 : ");
		snt = sc.nextLine();
	}
	// 문자 입력 메서드
	void inputChar() {
		System.out.print("문자열에서 제거 할 문자를 입력하세요 : ");
		c = sc.next().charAt(0);
		sc.nextLine();
	}
	// 입력된 문자열 중 특정 문자를 지운 결과값(result) 출력하는 메서드
	String printResult(String snt, char c) {
		String result = "";
		// 최초 result는 아무것도 없는 String 변수
		int index1 = -1;
		//순서를 위한 index 1변수
		int index2 = 0;
		//시작점을 위한 index 2변수
		while((index1 = snt.indexOf(c, index1+1)) != -1) {
			result = result + snt.substring(index2, index1);
			index2 = index1+1;
		}result = result + snt.substring(index2);
		return result;
		
	}
	public void removeChar() {
		inputSnt();
		//문자열 입력
//		System.out.println(snt); 확인용
		inputChar();
		//삭제할 문자 입력
//		System.out.println(c); 확인용
		System.out.println(snt + " 문자열의 " + c + " 를 뺀 문자열은 " + printResult(snt, c) 
								+ " 입니다.");
		//최종 결과 출력
	}
}
