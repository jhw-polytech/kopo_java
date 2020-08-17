package kr.ac.yeongnam.day06.homework;

public class StringUtillMain {

	public static void main(String[] args) {
		
		StringUtill su = new StringUtill(); // StringUtill 객체 생성
		
		// 각 메소드를 실행합니다.
		System.out.println("=====isUpperChar=====");
		boolean result = su.isUpperChar('A');
		boolean result2 = su.isUpperChar('a');
		System.out.println("A : " + result);
		System.out.println("a : " + result2);
		System.out.println();
		
		System.out.println("=====isLowerChar=====");
		boolean result3 = su.isLowerChar('A');
		boolean result4 = su.isLowerChar('a');
		System.out.println("A : " + result3);
		System.out.println("a : " + result4);
		System.out.println();

		System.out.println("=====max=====");
		int result5 = su.max(5, 50);
		System.out.println("max(5, 50) : " + result5);
		System.out.println();
		
		System.out.println("=====min=====");
		int result6 = su.min(5, 50);
		System.out.println("min(5, 50) : " + result6);
		System.out.println();
		
		System.out.println("=====reverseString=====");
		String msg = "Hello World!!!";
		String result7 = su.reverseString(msg);		
		System.out.println(msg + " : " + result7);
		System.out.println();
		
		System.out.println("=====toUpperString=====");
		String result8 = su.toUpperString(msg);		
		System.out.println(msg + " : " + result8);		
		System.out.println();
		
		System.out.println("=====toLowerString=====");		
		String result9 = su.toLowerString(msg);		
		System.out.println(msg + " : " + result9);		
				
	}

}
