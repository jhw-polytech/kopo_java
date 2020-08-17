package shlee1993.day10.homework;

/*
 * 문제6. 반복문을 이용하여 369 게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보세요.
1 부터 99 까지만 실행하세요
 */
public class Hw06 {
	public static void main(String[] args) {
		int[] num = new int[99];

		for (int i = 0; i < 99; i++) {
			num[i] = i + 1;
			System.out.print(num[i]);
			
			//문제는 두자리까지지만 자리수가 늘어나도 가능하도록 제작
			while (num[i] != 0) {	//num[i]에 저장된 값이 1/10, 1/100 ... 0이 될때까지 진행
				if (((num[i] % 10) == 3) || ((num[i] % 10) == 6) || ((num[i] % 10) == 9))	//1의 자리수 확인
					System.out.print(" 짝");
				num[i] /= 10;
			}
			System.out.println();
		}
	}
	
}
