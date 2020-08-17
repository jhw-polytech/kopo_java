package homework0410;

/*
 * 2060340017 신형재 과제 12번
 * 
 * 여러가지 방법으로 해 보고, 다른 학생들 과제로 따라도 해 봤는데
 * 명확한 해답을 잘 모르겠습니다.
 * 
 */


public class n12 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			// 행의 범위 9까지 반복
			// 5행의 *표시 우선 반영
			if(i==5) {
				for(int j=1; j<=9; j++) {
				System.out.print("*");
				}
			// 1~4행까지의 조건문 생성
			if(i<5) {
				for(int j = 1; j < i; j++) {
				// 열이 1~5까지
					System.out.print("*");
				}
			}
				for(int j = 9-i; i<j; j--) {
					System.out.print("-");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
		}
		if(i>5) {
			for(int j = i; j<=9; j++) {
				System.out.print("*");
			}
			for(int j = 11-i; j<i; j++) {
				System.out.print("-");
			}
			for(int j = i; j<=9;j++) {
				System.out.print("*");
			}
		}System.out.print("\n");
		}
}
}
