package task;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		StringUtil jin = new StringUtil();
		Scanner scan = new Scanner(System.in);
//1		
		System.out.println("문자를 입력하세요.");
		
		String s = scan.next();// STRING으로 한글자를 입력받음
		char c = s.charAt(0);//숫자로 변환하기 위해서 CHAR에 다시 담음
		//char c = 'A';
		if(jin.isUpperChar(c)) {//대소문자 구분하는 메소드
			System.out.println("true");
	
		}else {
			System.out.println("false");
}
		
//2	
	   System.out.println("문자를 입력하세요.");
		String str = scan.next();//한 글자 입력받음
		char b = str.charAt(0);//CHAR로 변환
		if(jin.isLowerChar(b)) {//메소드 호출
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	

//3	
	System.out.println("숫자 1 입력:");
	System.out.println("숫자 2 입력:");
	int i=scan.nextInt();
	int j=scan.nextInt();
	System.out.println("max:"+ jin.max(i , j)); //가장 큰값을 반환하는 메소드
		
		
//4		
	System.out.println("숫자 1 입력:");
	System.out.println("숫자 2 입력:");
	int x=scan.nextInt();
	int y=scan.nextInt();
	System.out.println("min:"+jin.min(x, y)); //가장 작은값을 반환하는 메소드
	
//5
	System.out.println("문자열을 입력해주세요:");
	String data = scan.next();
	System.out.println(jin.reverseString(data)); //문자열을 역으로 하는 메소드 
	
//6
	System.out.println("문자열을 입력해주세요:");
	String str1 = scan.next();
	System.out.println(jin.toUpperString(str1)); //대문자로 바꾸는 메소드
	
	
//7
	System.out.println("문자열을 입력해주세요:");
	String str2 = scan.next();
	System.out.println(jin.toLowerString(str2)); //소문자로 바꾸는 메소드	
	
		
	}	
}
