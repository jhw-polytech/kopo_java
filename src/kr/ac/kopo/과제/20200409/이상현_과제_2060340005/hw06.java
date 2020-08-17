package shlee1993.day02.homework;

import java.util.Scanner;

/*
6. 입력받은 문자열에서 알파벳이 모두 몇 자 인지 화면에 출력
ex)개수 : 52
*/

//length메소드를 활용해 입력받은 문자열의 길이를 확인 한 후, 변수(cnt)를 두고 아스키코드 값을 이용해 알파벳일 경우에만 (A~Z, a~z) 1씩 증가하도록 작성
//length나 다른 메소드를 사용하지 않고 강의 시간에 배운 내용과 charAt 메소드만으로는 완벽하게 해결을 하지 못하였습니다.

/*
	6번 문제는요 입력받은 알파벳의 개수가 아니라 소문자, 대문자를 합친 알파벳의 개수가 몇개인지를 코드로 작성하는 문제였습니다
	다시 한번 해주시겠어요???
*/

public class hw06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		int stringLength = inputStr.length(); // 다른 방법을 생각해보려고 했으나, 받아온 문자열의 길이나 끝을 알 수 있는 다른 방법을 찾지 못했습니다.
		int i = 0, cnt = 0;

		while (i < stringLength) {
			if (('A' <= inputStr.charAt(i) && inputStr.charAt(i) <= 'Z')
					|| ('a' <= inputStr.charAt(i) && inputStr.charAt(i) <= 'z'))
				cnt++; // 알파벳일때(a~z, A~Z에만 cnt 개수 증가)
			i++;	//인덱스 증가, 입력받은 문자열의 개수 - 1을 해야함(인덱스는 0부터 시작하므로)
		}
		System.out.println("개수 : " + cnt);
	}
}
