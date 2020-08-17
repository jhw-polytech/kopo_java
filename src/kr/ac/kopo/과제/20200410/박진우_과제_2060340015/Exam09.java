package kr.ac.jinwoo.day03.homework;

/*
 * 구구단을 한 라인에 3단씩 출력하는 코드를 작성하시오.
 * (반복문은 최대 3개만 사용합니다.)
 * 
 * ※ 9단은 출력하지 말라고 하셨는데 출력 예시에는 9단이 적혀있길래 10단을 말씀하신줄 알고 10단을 안나오게 하였습니다.
 * 
 */

public class Exam09 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9;) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
				System.out.printf("%d * %d = %d\t", i+1, j, (i+1)*j);
				
				if(i != 8)
					System.out.printf("%d * %d = %d\n", i+2, j, (i+2)*j);
				else
					System.out.println();
			}
			System.out.println();
			i += 3;
		}
	}
}
