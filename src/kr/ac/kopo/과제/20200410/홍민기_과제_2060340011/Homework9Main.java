package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
 * 반복문은 최대 3개만 사용합니다.
 * 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
 * 2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
 * ...
 * 5 * 1 = 5 6 7
 * ...
 * 8 9
 *
 * for(int dan = 2; dan <= 9; ) {
 * } 
 * 
 */
public class Homework9Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int i = 2;i<=8;i+=3) { // 구구단의 1열을 보면, 2단이 먼저 나오고 그다음 5단, 그다음 8단이 나오므로 i의 증가량은 +3씩 해준다.
			for(int j=1;j<=9;j++) {
				
				// 한라인에 3단씩 출력하므로, print문을 3개 써준다. 이 때, 곱하기 왼쪽에 있는 인수는 i, i+1, i+2로 설정하면 된다. 
				
				// 		i   i+1   i+2
				// 		2    3     4
				// 		5    6     7
				// 		8    9    10
				
				// 또한 9단은 나오면 안되므로 i+1 (=9) 과 i+2 (=10) 에 조건을 걸어 출력이 되지 않게 한다.
				
				System.out.printf("%d * %d = %2d  ", i,j,i*j);
				if(i+1<9) {
					System.out.printf("%d * %d = %2d  ", i+1,j,(i+1)*j);
					System.out.printf("%d * %d = %2d", i+2,j,(i+2)*j);
				}
				
				System.out.println();
			}

		}
	}
}
