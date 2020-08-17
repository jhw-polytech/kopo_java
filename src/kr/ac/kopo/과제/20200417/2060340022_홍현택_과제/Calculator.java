package kr.co.hana.homework05;

public class Calculator {

	int add(int i, int j) {
		return i + j;
	}

	int sub(int i, int j) {
		return i - j;
	}

	int mul(int i, int j) {
		return i * j;
	}

	double div(int i, int j) {
		return (double) i / j;
	}

	void fourcal(int i, int j) {
		System.out.printf("%d + %d = %d\n", i, j, add(i, j));
		System.out.printf("%d - %d = %d\n", i, j, sub(i, j));
		System.out.printf("%d * %d = %d\n", i, j, mul(i, j));
		System.out.printf("%d / %d = %f\n", i, j, div(i, j));
	}

	boolean isPrime(int num) {

		for (int k = 2; k < num; k++) {
			if (num % k == 0) {
				return false;
			}
		}
		return true;

	}
}
