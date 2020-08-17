package homework0410;

/*
 * 2060340017 신형재 과제 10번
 * 
 * *****
 * -****
 * --***
 * ---**
 * ----*
 * ---**
 * --***
 * -****
 * *****
 * 
 * 출력하기
 * 반복문 3개, 조건문 3개
 * 
 * 
 */


public class n10 {
	public static void main(String[] args) {
		
			for(int i =1; i<=9; i++) {
				if(i<=5){
				for(int j = 1; j <= 5; j++) {
					if(j<i) {
				System.out.print("-");
			}else {
				System.out.print("*");
				}
			}System.out.print("\n");
			// 여러가지 대입하다보니 결과가 나왔는데, 잘 모르겠습니다.
			} else {
				for(int j = 10; j >= 6; j--) {
					if(j-1>i) {
				System.out.print("-");
			}else {
				System.out.print("*");
			}
			}System.out.print("\n");
	}
}
	}
}