package kr.ac.kopo.day02.project;

import java.util.Scanner;

/**
 * 
 * @author tess
 * 화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 클래스 
 *
 */
public class Project07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alphabet = (int) sc.nextLine().charAt(0);
		System.out.println();
		
		if ((60 <= alphabet) && (alphabet <= 90)) { // 소문자는 60~90
			System.out.printf("변경된 값 : %c", (char) (alphabet+32)); // 32를 더하고, 형변환을 해주면 대문자가 출력 
		} else if ((97 <= alphabet) && (alphabet <= 122 )) { // 대문자는 97~122
			System.out.printf("변경된 값 : %c", (char) (alphabet-32)); // 32를 빼고, 형변환을 해주면 소문자가 출력 
		} 
	}

}
