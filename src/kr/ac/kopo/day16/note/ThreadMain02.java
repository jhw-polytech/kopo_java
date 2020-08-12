package kr.ac.kopo.day16.note;

/*
 * Thread 생성하는 2가지 방식
 * 1. Thread 클래스 상속
 * 2. Runnable 인터페이스 상속
 */

class ExtendThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + "번째 인형 눈 붙이기 ...");
		}
	};
}

class ImplementThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + "번째 인형 입 만들기 ...");
		}
	};
}

public class ThreadMain02 {

	public static void main(String[] args) {
		System.out.println("현재 실행중인 스레드 개수 : "+Thread.activeCount());
		// 실행중인 스레드 수 찍어주는 문장 --> 여기서 1개가 나오는 이유는 main() method를 하나로 카운트하기 때문
		ExtendThread et = new ExtendThread();
		et.start();
		
		ImplementThread it = new ImplementThread();
		// it.start(); -- start() 메소드를 가지고 있지 않다. 이건 Thread 클래스만 가지고 있다.
		Thread t = new Thread(it); // 따라서 이렇게 생성자에 Runnable 을 상속받은 객체를 생성자에 넣어서 Thread 객체 생성
		t.start();
		// 번거로워보이지만, 사실 실제로는 Runnable 인터페이스를 상속받는 형식을 더 많이 사용한다.
		// 왜냐하면 자바는 단일상속만을 지원하기 때문에, Thread 클래스를 상속받은 클래스는 다른 클래스를 사용할 수 없기 때문이다.
		// 따라서 Runnable 인터페이스를 상속받아 다중상속을 쓰는 게 더 일반적이다.
		
		System.out.println("현재 실행중인 스레드 개수 : "+Thread.activeCount());
		System.out.println("인형작업 종료....");
		// 우리가 기대하는 건 위 et.start()와 t.start()가 실행되고 난 뒤에 이 문장이 실행되는 것이지만
		// 실제로 돌려보면 가장 맨 위에 실행되는 것을 볼 수 있다.
		
		
		// 아래 for문도 하나의 쓰레드라고 카운트된다.
		for(int i = 0; i<100; i++) {
			System.out.println(i + "번째 감독중....");
		}
		
	}

}
