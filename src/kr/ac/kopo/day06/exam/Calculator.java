package kr.ac.kopo.day06.exam;

public class Calculator {

	// 결과값을 반환할 전역변수 선언
	int result;

	public void calculator(int i, int j) {

		System.out.printf("%d + %d = %d\n", i, j, plus(i, j));
		System.out.printf("%d - %d = %d\n", i, j, minus(i, j));
		System.out.printf("%d * %d = %d\n", i, j, multiple(i, j));
		System.out.printf("%d / %d = %d\n", i, j, devide(i, j));

		System.out.println("");
		System.out.printf("%d의 소수여부: %b", i, isItPrime(i));
		System.out.println("");
		System.out.printf("%d의 소수여부: %b", j, isItPrime(j));
	}

	// 사칙연산 메소드
	public int plus(int i, int j) {
//		result = i + j;
//		return result;

//		교수님은 아예 return i + j; 형태로 적으셨음.
		return i + j;
	}

	public int minus(int i, int j) {
		result = i - j;
		return result;
	}

	public int multiple(int i, int j) {
		result = i * j;
		return result;
	}

	public int devide(int i, int j) {
		result = i / j;
		return result;
	}

	// 소수 판별 메소드
	public boolean isItPrime(int k) {
		// 나눠지는 수가 있을 경우 false 를 반환
		//교수님 설명: 원래는 2~(k-1)이 아니라 k/2 까지만 체크해도 됨(가장 작은수가 2이므로)
		//그래서 조건문을 for(int i =2; bool && i <= num/2; i++)처럼 써줘도 됨
		for (int l = 2; l < k; l++) {
			if (k % l == 0) {
				return false;
			}
		}

		// 나눠지는 수가 없을 경우 true 를 반환
		return true;
	}

}
