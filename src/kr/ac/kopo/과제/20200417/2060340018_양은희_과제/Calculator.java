package Homework0417;

// 8. 사칙연산을 수행하는 Calculator 클래스 작성

public class Calculator {

	int plus(int x, int y) { // 매개변수 x,y를 받는 더하기 메소드
		int p_result = x + y;
		return p_result;
	}

	int minus(int x, int y) { // 매개변수 x,y를 받는 뻬기 메소드
		int mi_result = x - y;
		return mi_result;
	}

	int multi(int x, int y) { // 매개변수 x,y를 받는 곱하기 메소드
		int mu_result = x * y;
		return mu_result;
	}

	double divide(int x, int y) { // 매개변수 x,y를 받는 나누기 메소드
		double d_result = (double) x / (double) y;
		return d_result;
	}

	boolean prime(int num) { // 소수 판별
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
