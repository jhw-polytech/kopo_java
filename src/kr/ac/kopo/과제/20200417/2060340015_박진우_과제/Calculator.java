package kr.ac.jinwoo.day06.homework;

/*
 * ※ 질문
 * 
 * 처음에는 과제의 출력문을 모두 해당 클래스의 메소드로 만들었습니다.
 * 
 * 하지만 계산기 객체가 가져야 할 기능 중에 출력과 입력이 있어야하는지에 대한 의문이 들었고
 * 
 * Calculator 클래스가 가져야할 기능을 구현하고 main메소드에서 콘솔창에 입출력을 하는 것이 독립적이고 바람직하다는 생각이 들어 기능구현을 위주로 하였습니다.
 * 
 * 객체 설계가 처음이라 어디까지가 경계인지 파악이 잘 안되고 구현하는데에 어색한 부분이 많은 것 같습니다. 어떻게 접근하면 되는지 알려주시면 정말 감사하겠습니다.
 * 
 */

public class Calculator {

	private int num1 = 0;
	private int num2 = 0;
	

	public void setNum1(int n) {
		num1 = n;
	}
	
	public void setNum2(int n) {
		num2 = n;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}

	public int sum() { return num1 + num2; }
	public int sub() { return num1 - num2; }
	public int mul() { return num1 * num2; }
	public double div() { return (double)num1 / (double)num2; }
	
	
	public boolean isPrime(int n) {
		boolean ret = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				ret = false;
				i = n;	// break;
			}
		}
		return ret; 
	}
}
