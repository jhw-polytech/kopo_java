package shlee1993.day02.homework;

/*
1. 영문자모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오 영문자 모음의 아스키 코드
A = 65
E = 69
I = 73
O = 79
U = 85
*/

public class hw01 { 

	public static void main(String[] args) {
		System.out.printf("%c = %d\n", 'A', (int) 'A');
		System.out.printf("%c = %d\n", 'E', (int) 'E');
		System.out.printf("%c = %d\n", 'I', (int) 'I');
		System.out.printf("%c = %d\n", 'O', (int) 'O');
		System.out.printf("%c = %d\n", 'U', (int) 'U');
		// 문자서식 문자 %c와 4바이트 정수서식문자 %d를 이용하고,
		// 형 변환(int)을 이용해 문자를 아스키코드 값의 정수로 변환
	}
}
