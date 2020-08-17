package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class StringUtilMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력값을 받을 변수를 생성하여 계속 재활용
		String inputStr;
		int inputInt1;
		int inputInt2;

		
		//메소드가 담긴 StringUtil 클래스의 인스턴스 생성
		StringUtil stringUtil = new StringUtil();
		
		
		
		
		// 1) 하나의 문자를 입력받아 해당 문자가 대문자인지 확인
		System.out.println("하나의 문자를 입력하세요.");
		inputStr = sc.nextLine();
		System.out.println("대문자인가? : " + stringUtil.isUpperChar(inputStr.charAt(0)));
		
		
		// 2) 하나의 문자를 입력받아 해당 문자가 소문자인지 확인
		System.out.println("하나의 문자를 입력하세요.");
		inputStr = sc.nextLine();
		System.out.println("소문자인가? : " + stringUtil.isLowerChar(inputStr.charAt(0)));
		
		
		// 3) 두 개의 숫자를 입력받아 큰 수를 반환
		System.out.println("첫 번째 숫자를 입력하세요.");
		inputInt1=sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		inputInt2=sc.nextInt();
		sc.nextLine();		
		System.out.println("큰 수는? : " + stringUtil.max(inputInt1, inputInt2));
		
		
		// 4) 두 개의 숫자를 입력받아 작은 수를 반환
		System.out.println("첫 번째 숫자를 입력하세요.");
		inputInt1=sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		inputInt2=sc.nextInt();
		sc.nextLine();		
		System.out.println("작은 수는? : " + stringUtil.min(inputInt1, inputInt2));
		
		
		// 5) 문자열을 입력받아 거꾸로 변경
		System.out.println("문자열을 입력하세요.");
		inputStr = sc.nextLine();
		System.out.println("문자열을 거꾸로 출력합니다: "+stringUtil.reverseString(inputStr));
		

		// 6) 문자열을 입력받아 대문자로 변경
		System.out.println("문자열을 입력하세요.");
		inputStr = sc.nextLine();
		System.out.println("대문자로 변경되었습니다 : "+stringUtil.toUpperString(inputStr));		
		
		
		// 7) 문자열을 입력받아 소문자로 변경
		System.out.println("문자열을 입력하세요.");
		inputStr = sc.nextLine();
		System.out.println("소문자로 변경되었습니다 : "+stringUtil.toLowerString(inputStr));		
		
		
		sc.close();
	}

}
