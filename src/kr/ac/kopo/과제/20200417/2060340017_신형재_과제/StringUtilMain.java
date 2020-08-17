package homework0417;

/*
 * 2060340017 신형재 과제 1번~7번
 */

import java.util.Scanner;

public class StringUtilMain {
	public static void main(String[] args) {
		
		StringUtil su = new StringUtil();
		//StringUtil 클래스를 쉽게 불러오기 위해 su로 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요.(대문자의 경우 true)");
		char ch1=sc.nextLine().charAt(0);
		//문자열을 입력 받고, 해당 문자열의 첫번째 문자를 isUpperChar 메서드로 이동
		boolean result1 = su.isUpperChar(ch1);
		System.out.println(ch1+"는 대문자입니까?  " + result1);
		
		System.out.println("문자를 입력하세요.(소문자의 경우 true)");
		char ch2=sc.nextLine().charAt(0);
		//문자열을 입력 받고, 해당 문자열의 첫번째 문자를 isLowerChar 메서드로 이동
		boolean result2 = su.isLowerChar(ch2);
		System.out.println(ch2+"는 소문자입니까?  " + result2);
		
		System.out.println("숫자 두개를 입력하세요.(두개 중 큰 수 출력)");
		int num3_1=sc.nextInt();
		sc.nextLine();
		int num3_2=sc.nextInt();
		sc.nextLine();
		// 숫자 2개를 입력 받고, 해당 숫자 2개 모두 max 메서드로 이동, 결과값 출력
		int max = su.max(num3_1,num3_2);
		System.out.println("큰 수는?  " + max);
		
		System.out.println("숫자 두개를 입력하세요.(두개 중 작은 수 출력)");
		int num4_1=sc.nextInt();
		sc.nextLine();
		int num4_2=sc.nextInt();
		sc.nextLine();
		// 숫자 2개를 입력 받고, 해당 숫자 2개 모두 min 메서드로 이동, 결과값 출력
		int min = su.min(num4_1,num4_2);
		System.out.println("큰 수는?  " + min);
		
		System.out.println("문자열를 입력하세요.(문자열을 반대로 출력)");
		String str5=sc.nextLine();
		// 문자열을 입력 받고, 해당 문자열 모두 reverseString 메서드로 이동, 결과값 출력
		String result5 = su.reverseString(str5);
		System.out.println("<" + result5 + ">");
		
		System.out.println("문자열를 입력하세요.(소문자 문자열을 대문자로 출력)");
		String str6=sc.nextLine();
		// 문자열을 입력 받고, 해당 문자열 모두 toUpperString메서드로 이동, 결과값 출력
		String result6 = su.toUpperString(str6);
		System.out.println("<" + result6 + ">");
		
		System.out.println("문자열를 입력하세요.(대문자 문자열을 소문자로 출력)");
		String str7=sc.nextLine();
		// 문자열을 입력 받고, 해당 문자열 모두 toLowerString메서드로 이동, 결과값 출력
		String result7 = su.toLowerString(str7);
		System.out.println("<" + result7 + ">");
		
		
	}
}
