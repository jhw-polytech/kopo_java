package homework0409;

/*
 * 2060340017 신형재 과제 7번
 * 
 * 입력된 알파벳을 대<->소문자 변경
 * 
 */

import java.util.Scanner;

public class homework7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* a~z , A~Z까지의 아스키 코드값을 확인, 소문자 -32 = 대문자 인 것을 확인
		int a = 'a';
		System.out.println(a);
		int z = 'z';
		System.out.println(z);
		int A = 'A';
		System.out.println(A);
		int Z = 'Z';
		System.out.println(Z);
		*/
		
		// 사용자 문자열 입력을 위해 String 타입의 변수 inp 생성, nextLine메서드 이용
		System.out.print("입력(알파벳) : ");
		String inp = sc.nextLine();
			
		// for 문을 통해, 사용자가 입력한 inp 변수가 아스키 코드로 변환되어 출력되도록
		// inp의 길이 만큼 변수 con을 형성하게 하고(문자열을 변수화), 이를 다시 code변수로 아스키 코드로 변환
		
		System.out.print("변경된 값 : ");
		for(int i = 0; i<inp.length(); i++) {
			char con = inp.charAt(i);
			int code = (int)con;
			//System.out.println(code); 입력한 알파벳이 아스키 코드로 변환되는지 중간 확인
			if(96 < code && code < 123) {
				System.out.printf("%s", (char)(code - 32));
			}else if(64 < code && code < 91) {
				System.out.printf("%s", (char)(code + 32));
			}else {
				System.out.print("알파벳을 입력해 주십시오.");
				// 오류 사항을 입력했을 때, 그 길이만큼 위 "알파벳을 입력해 주십시오."가 출력되는 문제가 있음
				// 해결방법 고민 필요
			}
		}
	}

}
