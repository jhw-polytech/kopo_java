package day0409;

/*
 * 알파벳이 모두 몇 자 인지 화면에 출력하시오
 * 소문자 26+대문자26
 */
  public class task6 {
	 public static void main(String[] args) {
		 
		
				
				int small = 'z' - 'a' +1;    //소문자 개수
				int big = 'Z' - 'A' + 1;     //대문자 개수 
				
				System.out.printf("개수 ? %d", small + big);   // 정수로 표현 소문자+대문자
	 }
  } 