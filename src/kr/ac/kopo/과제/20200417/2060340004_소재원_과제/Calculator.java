package exam0417;

public class Calculator {
	
	int firstNum;
	int secondNum;
	
	Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		System.out.println("정수 : " + firstNum);
		System.out.println("정수 : " + secondNum + "\n");
		add();
		sub();
		mul();
		div();
		System.out.println();
		System.out.println(isPrime(this.firstNum));
		System.out.println(isPrime(this.secondNum));
	}
	
	void add() {
		System.out.printf("%2d  + %2d =  %2d\n", firstNum, secondNum, firstNum + secondNum);
	}
	
	void sub() {
		System.out.printf("%2d  - %2d =  %2d\n", firstNum, secondNum, firstNum - secondNum);
	}
	
	void mul() {
		System.out.printf("%2d  * %2d =  %2d\n", firstNum, secondNum, firstNum * secondNum);
	}
	
	void div() {
		System.out.printf("%2d  / %2d =  %.1f\n", firstNum, secondNum, (double) firstNum / secondNum);
	}
	
	boolean isPrime(int num) {
		
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				System.out.printf("%2d 소수 체크 : ", num);
				return false;
			} else {
				i++;
			}
		}
		System.out.printf("%2d 소수 체크 : ", num);
		return true;
	}
}
