package jaeheehomework;

import java.util.Scanner;

public class StringUtilMain {

	// 실행 클래스이므로 메인 메소드 만듭니다
	public static void main(String[] args) {
		
		//1
		// 객체 인스턴스화
		StringUtil su = new StringUtil();
		Scanner sc = new Scanner(System.in);
		
		// 알파벳 입력 
		System.out.println("대문자 알파벳을 입력하시오 : ");
		char alphabet = sc.next().charAt(0);
		
		//메소드 이용해서 리턴값 받기
		boolean bool = su.isUpperChar(alphabet);
		System.out.println(bool);
		
		
		//2
		System.out.println("소문자 알파벳을 입력하시오 : ");
		char alphabet2 = sc.next().charAt(0);
		
		//메소드 이용해서 리턴값 받기
		boolean bool2 = su.isLowerChar(alphabet2);
		System.out.println(bool2);
		
		
		//3
		System.out.println("두 수를 입력하시오. 큰 수를 반환합니다");
		//여기서 num1 = Integer.parseInt(sc.nextLine());을 사용하면 예외가 발생하는데 왜 그런지 모르겟습니다ㅠ
		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = Integer.parseInt(sc.nextLine());
		int maxNum = su.max(num1, num2);
		System.out.println(maxNum);
		
		
		//4
		System.out.println("두 수를 입력하시오. 작은 수를 반환합니다");
		int num3 = Integer.parseInt(sc.nextLine());
		int num4 = Integer.parseInt(sc.nextLine());
		int minNum = su.min(num3, num4);
		System.out.println(minNum);
		
		
		//5
		System.out.println("문자열을 입력하시오. 거꾸로 변환합니다");
		String str = sc.nextLine();
		char[] strRev = su.stringReverse(str);
		System.out.println(strRev);
		
		
		//6
		System.out.println("문자열을 입력하시오. 대문자로 변환합니다");
		String str2 = sc.nextLine();
		String strBig = su.stringBig(str2);
		System.out.println(strBig);
		
		
		//7
		System.out.println("문자열을 입력하시오. 소문자로 변환합니다");
		String str3 = sc.nextLine();
		String strSmall = su.stringSmall(str3);
		System.out.println(strSmall);
	}
}
