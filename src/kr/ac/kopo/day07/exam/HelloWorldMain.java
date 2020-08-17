package kr.ac.kopo.day07.exam;

import java.util.Scanner;

public class HelloWorldMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HelloWorld hello = new HelloWorld();

		
		
		/*
		 * 주어진 문자열에서 입력받은 문자가 포함된 개수를 return
		*/
		System.out.println("원하는 문자열을 입력하세요: ");
		String strData = sc.nextLine();
		System.out.println("찾으려는 문자를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(hello.checkChar(strData, ch));
		
		
		System.out.println();
		/*
		 * 주어진 문자열에서 입력받은 문자를 제거한 문자열을 return
		*/
		System.out.println("원하는 문자열을 입력하세요: ");
		String oriStr = sc.nextLine();
		System.out.println("제거하고 싶은 문자를 입력하세요: ");
		char delChar = sc.nextLine().charAt(0);
		System.out.println(hello.removeChar(oriStr, delChar));
		
		
	}
	
}
