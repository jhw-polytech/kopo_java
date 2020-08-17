package kr.ac.kopo.day06;

public class Gugudan {
	
	void print(int dan) {
		
		
		for(int i=0; i<9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i+1, dan*(i+1));
		}
		
		
		return;
	}
	
	
	void print() { // 같은 print라는 이름으로 오버로딩
//	void printAll() {
		for(int dan = 2; dan<= 9; dan++) {
			print(dan);
		}
	}

}
