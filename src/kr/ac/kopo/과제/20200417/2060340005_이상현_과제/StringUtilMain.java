package shlee1993.day06.homework;

public class StringUtilMain {
	public static void main(String[] args) {
		char testC = 't';	//단순 확인을 위한 임의의 값으로 초기화
		int testNum1 = 10;	//단순 확인을 위한 임의의 값으로 초기화
		int testNum2 = 2;	//단순 확인을 위한 임의의 값으로 초기화
		String testString = "String TEST!!!";	//단순 확인을 위한 임의의 값으로 초기화
		
		StringUtil sTest = new StringUtil();
		
		System.out.println("1번 : " + sTest.isUpperChar(testC));
		System.out.println("2번 : " + sTest.isLowerChar(testC));
		System.out.println("3번 : " + sTest.max(testNum1, testNum2));
		System.out.println("4번 : " + sTest.min(testNum1, testNum2));
		System.out.println("5번 : " + sTest.reverseString(testString));
		System.out.println("6번 : " + sTest.toUpperString(testString));
		System.out.println("7번 : " + sTest.toLowerString(testString));
		
	}
}
