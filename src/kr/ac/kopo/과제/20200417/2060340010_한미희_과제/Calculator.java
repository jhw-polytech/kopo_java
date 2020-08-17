package kr.ac.kopo.day6.assignment;

public class Calculator {
	
	//더하기 메소드
	public int add(int i, int j) {
		return i + j;
	}
	
	//빼기 메소드
	public int substract(int i, int j) {
		return i - j;
	}
	
	//곱하기 메소드
	public int multiply(int i, int j) {
		return i * j;
	}
	
	//나누기 메소드
	public double divide(int i, int j) {
		return ((double)i / (double)j);
	}
	
	//소수 판별 메소드
	boolean prime(int num) {
		int count = 0;
		//약수의 개수 세기
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) { 
				count += 1;
			}			
		}
		//약수가 2개이면 소수(소수는 1과 자기자신으로만 나누어 떨어짐) 
		if(count == 2) {
			return true;
		}else {
			return false;
		}
	}

	
}
