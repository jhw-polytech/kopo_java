package kr.ac.yeongnam.day02.homework;

/*
	alphabet 변수가 다 넣으면서 이건 아닐꺼야 생각하셨죠????? ^^
	유니코드를 이용해서 구하실 수 있어요.. 한번 생각해보세요

	===> 알파벳 순서대로 ASCII 코드가 구성돼 있는 것을 활용해서 코드를 수정해봤습니다. 
	===> 대문자와 소문자 사이에 기타 문자가 끼어있어서, Z와 A 길이의 2배로 문제의 답을 구해봤습니다.
	===> 피드백 주셔서 감사합니다^^
*/

/*
6. 알파벳이 모두 몇 자 인지 화면에 출력하시오.
      개수 ? 52 
 */

public class Problem6 {

	public static void main(String[] args) {

		// ASCII 코드로 변환
		int upperA = (int) 'A';
		int upperZ = (int) 'Z';
		int lowwerA = (int) 'a';
		int lowwerZ = (int) 'z';
		
		// 알파벳 순서대로 ASCII 코드가 구성돼있음.
		// 따라서, 알파벳의 전체 길이는 (Z 아스키코드 - A 아스키코드 + 1) * 2
		
		int alphabetLength = (upperZ - upperA + 1) * 2;		
		System.out.println("개수: " + alphabetLength);

		/*
		 * 기존 코드
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int alphabetLength = alphabet.length(); // length 메소드로 문자열의 길이를 구함
		
		System.out.println("개수 : " + alphabetLength);		
		*/
	}
}
