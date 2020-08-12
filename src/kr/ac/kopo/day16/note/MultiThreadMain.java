package kr.ac.kopo.day16.note;

class Calculator {
	private int count = 0;


	/*
	 * synchronized가 적용되지 않으면 count를 모두 끝내고 난 다음의 값이 20000이 아니라
	 * 계속 숫자가 손실된 형태로 매번 다른 숫자가 나오는 것을 확인할 수 있다.
	 * 이유: 스레드가 서로 count 변수의 값을 변경시키고 있는데,
	 * 		값을 저장하기 전에 큐를 뺏기는 경우 다시 큐에 돌아왔을 때 직전에 기억했던 값을 기준으로 저장하고,
	 * 		이 과정에서 수의 손실이 생긴다.
	 */
	
	
	public /* synchronized */ void sum() {
		
		/* synchronized(this) { */
		// this를 쓰는 이유는 Object형이 아닌 기본자료형이 오면 에러가 나기 때문 <-????
		// this의 의미는, 현재 돌아가고 있는 Calculator 객체를 의미한다.
		for (int i = 0; i < 10000; i++) {		
			/* synchronized(this) { */		
			count++;
			/* } */
		}
		/* } */
	}

	public int getCount() {
		return count;
	}
}

class MultiThread extends Thread {
	private Calculator cal;

	public MultiThread(Calculator cal) {
		this.cal = cal;
	}
}

public class MultiThreadMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		MultiThread mt = new MultiThread(cal);
		MultiThread mt2 = new MultiThread(cal);
		
		mt.start();
		mt2.start();
		
		try {
			// join()은 마지막에 cal.getCount()를 찍기 위한 것.
			// 만약 join을 쓰지 않으면 main()을 포함한 세 개의 스레드가 함께 돌며 count가 0이 찍힐것임
			mt.join();
			mt2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cal.getCount());
	}
}
