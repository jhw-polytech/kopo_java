package day0409;
//1번 문제 아스키 코드 값을 출력형식 맞추어 화면에 출력 

public class task01 { // 클래스
	public static void main(String[] args) { // 메소드 블록
		char ch = 'A';
		System.out.printf("%d\n", (int) ch);  // %d= 10진수로 추출 ,ch=A
		char ch1 = 'E';
		System.out.printf("%d\n", (int) ch1);
		char ch2 = 'I';
		System.out.printf("%d\n", (int) ch2);
		char ch3 = 'O';
		System.out.printf("%d\n", (int) ch3);
		char ch4 = 'U';
		System.out.printf("%d\n", (int) ch4);
	}
}

//2번째 방법
//	public static void main(String[] args) {  메소드 블록		
//	char c1 = 'A';     문자 A를 저장
//		int uniCode = c1;  c1의 유니코드 얻기
//		System.out.println(uniCode); 유니코드 추출 
		// AEIOU반복

//다른 사람의 코드 3번째 방법 
//		Scanner sc = new Scanner(System.in);  scanner사용 
//		String str = "AEIOU"; 
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i) +" = "+ (int)str.charAt(i));
//		}
//	}
//}
