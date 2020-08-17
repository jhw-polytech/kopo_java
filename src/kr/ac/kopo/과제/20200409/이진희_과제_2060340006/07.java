package day0409;

import java.util.Scanner;

/*
 * 화면에서 알파벳을 입력받아 대문자를 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오.
 * 입력(알파벳): a
 * 변경된 값: A
 * 참고> 화면에서 받은 문자열에서 한 문자 가져오기
 */
 public class task7 {
	 public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("입력(알파벳):");
		 String str = sc.nextLine();

		 System.out.print("변경된 값 :");

		if(Character.isLowerCase(str.charAt(0))){         // 문자가 소문자일 경우
			System.out.print((char)(str.charAt(0)-32));     // 대문자-소문자:32
		}
		else {                                           // 문자가 대문자일 경우
			System.out.print((char)(str.charAt(0)+32));
		}
	 }	
 }
