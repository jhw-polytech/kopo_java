package homework0409;

/*
 * 2060340017 신형재 과제 6번
 * 
 * 알파벳 수를 세기 위한 코드
 */

public class homework6 {
	public static void main(String[] args) {
		
		int num1 = 'z' - 'a' + 1; // a부터 z까지의 아스키 코드 차이값을 구한 뒤 1을 더하여 갯수 파악(소문자)
		int num2 = 'Z' - 'A' + 1; // a부터 z까지의 아스키 코드 차이값을 구한 뒤 1을 더하여 갯수 파악(대문자)
		
		System.out.printf("개수 ? %d", num1+num2);
	}
}
