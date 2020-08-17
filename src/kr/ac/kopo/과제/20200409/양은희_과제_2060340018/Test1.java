package Homework_0409;

// 1)영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오.


public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("-------------------");
		System.out.println("영문자 모음의 아스키 코드 값");
		System.out.println("-------------------");
		
		// 문자형의 변수를 선언해준다.
			char a = 'A' ;
			char e = 'E' ;
			char i = 'I' ;
			char o = 'O' ;
			char u = 'U' ;
		
		// 형변환을 통해 아스키코드값을 출력해준다.
		System.out.println(a +" = "+ (int)a);
		System.out.println(e +" = "+ (int)e);
		System.out.println(i +" = "+ (int)i);
		System.out.println(o +" = "+ (int)o);
		System.out.println(u +" = "+ (int)u);

		System.out.println("-------------------");
	}

}
