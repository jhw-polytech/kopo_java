package kr.ac.yeongnam.day06.homework;

public class Calculator {
	
	/**
	 * 사칙연산을 수행하는 메소드
	 * @param i
	 * @param j
	 */	
	void fourOperation(int i, int j) {
		System.out.println(i + " + " + j + " = " + (i + j));
		System.out.println(i + " - " + j + " = " + (i - j));
		System.out.println(i + " * " + j + " = " + (i * j));
		System.out.println(i + " / " + j + " = " + ((double) i / (double) j));
		System.out.println();
	}
	
	/**
	 * 소수인지 체크하는 메소드
	 * @param i
	 * @param j
	 */	
	void primeCheck(int i, int j) {
		boolean resultFirst = true;
		boolean resultSecond = true;
		
		if(i >= 2) {
			for(int num = 2; num < i; num++) {
				if(i % num == 0) {
					resultFirst = false;
				}
			}			
		} else {
			resultFirst = false;			
		}
		
		if(j >= 2) {
			for(int num = 2; num < j; num++) {
				if(j % num == 0) {
					resultSecond = false;
				}
			}			
		} else {
			resultSecond = false;			
		}		
		
		System.out.println(i + " 소수체크 : " + resultFirst);
		System.out.println(j + " 소수체크 : " + resultSecond);
	}
}
