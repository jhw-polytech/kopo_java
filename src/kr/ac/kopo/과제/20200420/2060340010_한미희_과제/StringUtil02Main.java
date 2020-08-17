package kr.ac.kopo.day7.assignment;

public class StringUtil02Main {

	public static void main(String[] args) {
		
//		1. checkChar(String strData, char ch)메소드
//		a. ch = 'o'인 경우  => 2 리턴
			System.out.println(StringUtil02.checkChar("Hello World Java", 'o'));
//		b. ch = 'W'인 경우 => 1 리턴 
			System.out.println(StringUtil02.checkChar("Hello World Java", 'W'));
		
//		2. removeChar(String strData, char ch) 메소드	
//		a. dalChar = 'l'인 경우 => Heo Word Java 리턴
			System.out.println(StringUtil02.removeChar("Hello World Java", 'l'));	
//		b. dalChar = 'o'인 경우 => Hell Wrld Java 리턴
			System.out.println(StringUtil02.removeChar("Hello World Java", 'o'));		
	
			
	}
}
