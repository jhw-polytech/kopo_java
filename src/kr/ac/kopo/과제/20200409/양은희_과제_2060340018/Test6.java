package Homework_0409;

// 6)알파벳이 모두 몇 자 인지 화면에 출력하시오.

public class Test6 {

	public static void main(String[] args) {
       
			char first_alphabet = 'A';											// 아스키코드의 알파벳 대문자 A
			char last_alphabet = 'Z';											// 아스키코드의 알파벳 대문자 Z
			System.out.print("개수 ? " + (((int)last_alphabet - (int)first_alphabet)+1)*2);	// 두 사이의 차이값을 빼고 갯수를 세어줘야 하기 때문에 +1을 한다. 그 후 소문자도 똑같은 갯수만큼 있기 때문에 *2를 한다.
        }
	}