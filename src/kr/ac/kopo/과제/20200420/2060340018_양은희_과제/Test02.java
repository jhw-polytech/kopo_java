package Homework0420;

import java.util.Scanner;

// 주어진 문자열에서 특정 문자 제거하기

public class Test02 {

	public static String removeChar(String oriStr, char delChar) {
	
		StringBuilder str= new StringBuilder();
		
			/*
				charAt(i)로 조건식을 사용하면 굳이 toCharArray()로 배열로 만들필요가 없을거 같네요...
			*/
	       char[] charArray= oriStr.toCharArray();
	       
	       for (int i=0; i<charArray.length; i++){
	           if (charArray[i]!=delChar) {
	               str.append(charArray[i]);
	           }
	       }
	       return str.toString();
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String strData = sc.nextLine();
		
		System.out.print("삭제할 문자를 입력하세요 : ");
		char delChar = sc.nextLine().charAt(0);
		
		String str = removeChar(strData, delChar);
		
		System.out.println(strData + "에서 " + delChar + "(을)를 삭제하면 " + str + "입니다.");
	}
}
