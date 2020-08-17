package homework0409;

/*
 * 2060340017 신형재 과제 1번
 * 
 * A, E, I, O, U 알파벳(char)을 아스키 코드값(int)로 변환하여 출력하도록 하겠습니다.
 * 
 */

public class homework1 {
	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("영문자 모음의 아스키 코드 값");
		System.out.println("--------------------");
		
		/*
		 *  A라는 알파벳의 아스키 코드를 출력하기 위해 정수형 변수 설정한 후(int A), 
		 *  해당 변수에 문자형 값('A')을 입력한다.
		 *  다른 알파벳도 모두 동일
		 */
		
		int A = 'A';
		System.out.println("A = "+A);
		int E = 'E';
		System.out.println("E = "+E);
		int I = 'I';
		System.out.println("I = "+I);
		int O = 'O';
		System.out.println("O = "+O);
		int U = 'U';
		System.out.println("U = "+U);
		System.out.println("--------------------");
	}
}
