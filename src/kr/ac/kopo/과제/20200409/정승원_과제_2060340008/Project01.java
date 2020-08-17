package kr.ac.kopo.day02.project;

/**
 * 
 * @author tess
 *  영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하는 클래스 
  	A = 65
	E = 69
	I = 73
	O = 79
	U = 85
	
 */
public class Project01 {

	public static void main(String[] args) {
		
		char[] charArray = {'A', 'E', 'I', 'O', 'U'}; // 아스키 코드 값으로 변환할 char타입을 가진 char배열 선언 
		
		for(char alphabet : charArray) { // 하나씩 순환 
			System.out.printf("%c = %d\n", alphabet, (int) alphabet); // char타입을 int타입으로 명시적 형변환하여 출력 
		}

	}
}
