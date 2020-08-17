package kr.ac.kopo.day10.project.project05;

import java.util.Scanner;

/**
 * 
 * @author seung
 * 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다. 
 */

public class Prob1 {

	public static void main(String[] args) {
		// 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String string = sc.nextLine();
		System.out.println(string);
		// 사이즈를 잰다
		int idx1 = string.length();
		int idx2 = 0;
		// 인덱스를 하나씩 늘려가며 출력한다.
		// 공백이 있는 경우 인덱스를 더 늘리고 진행한다.
		while (idx2 < idx1) {
			int idx3 = 0;
			
			if (string.charAt(idx2) == ' ') { // 공백은 무시하고 증가(시키는 문제인줄 알았네요..ㅎㅎ...) 문제를 잘 읽자!
				idx2++;
			}
			
			while (idx3 < (idx2+1)) {
				System.out.print(string.charAt(idx3));	
				idx3++;
			}
			idx2++;
			System.out.println();
		}
		sc.close();
	}
}
