package shlee1993.day03.homework;

/*
9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
반복문은 최대 3개만 사용합니다.
ex)	2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
	2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
	...
 	5 * 1 = 5 6 7
	...
 	8 9
 	
 	for(int dan = 2; dan <= 9; ) {
 	} 
 */

//한 줄에 세 개의 단을 출력해야 하므로, 하나 출력 후 단을 커지게 하는 것을 두번 반복 후 세번째 열 출력 후에 -2를 해줘,
//다음 행에서 윗 행과 같은 단이 입력되도록 작성, 9단이 나오면 안되기 때문에 8단까지 작성

public class hw09 {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 8; dan += 3) {
			for (int i = 1; i < 10; i++) {
				if (dan < 9) // 9단이 나오면 안되기 때문
					System.out.printf("%d * %d = %d\t", dan, i, dan * i);
				dan++;
				if (dan < 9)
					System.out.printf("%d * %d = %d\t", dan, i, dan * i);
				dan++;
				if (dan < 9)
					System.out.printf("%d * %d = %d", dan, i, dan * i);
				System.out.println();
				dan -= 2; // -2를 해줘야 윗 행과 같은 단의 값으로 돌아갈 수 있음
			}
			System.out.println();
		}
	}

}
