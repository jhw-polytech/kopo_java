package kr.ac.kopo.assignment.day06;

public class Calculator {
	
	//사칙연산 출력 메소드
	void calculation(int i, int j) {
		int add = i + j;
		int sub = i - j;	//int는 음수도 포함한다!
		int mul = i * j;
		double div = 0.0;
		// n/0을 방지하기 위해 if문 사용
		if(j != 0) {
			div = (double)i / (double)j;
		}		
		System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %.1f\n", i, j, add, i, j, sub, i, j, mul, i, j, div); //나눗셈은 소숫점 일의자리까지 표현		
	}
	
	
	//소수 체크 메소드 : 정수가 소수일 때 true 값 리턴
	boolean primeNum(int i) {
		
		if(i == 2) {
			return true;
		}else if (i == 1) {
			return false;
		}else if(i > 2) {
			for(int a = 2; a < i; a++) {
				if(i % a == 0) {
					return false;
				}else return true;
			}
		}
		return false; // 이 문장이 없으면 자꾸  this method must return a type of boolean이라고 에러가 뜹니다! ㅠ 위의 if 문안에서만 return을 포함시키면 안되는건가요?
		/*
			컴파일러가 if문을 제외한 나머지의 return을 몰라서 에러가 발생합니다. 꼭 붙여주어야 합니다
		*/
				
	}
	
	//소수 체크 출력 메소드
	void primeNumOutput(int i, int j) {
		boolean checkI = this.primeNum(i);
		boolean checkJ = this.primeNum(j);	//this로 내부 메소드 호출!
		
		System.out.printf("%d 소수 체크 : %b\n", i, checkI);
		System.out.printf("%d 소수 체크 : %b", j, checkJ);
	}
	

}
