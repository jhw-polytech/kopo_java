package kr.ac.kopo.day16.note;

class Data {

	public synchronized void a() {
		try {
			notify(); // 땡을 먼저 해줌(서로 block에 있으면 안되니까!) --> 만약 notify()를 먼저 해주지 않으면 dead lock에 빠짐
			// notify()는 block에 있는 쓰레드 중 아무거나 랜덤으로 깨우지만,
			// 현재 a() 또는 b()만 있는 상태에서 순서가 섞이기 전에 wait()가 걸어지므로 괜찮다.
			System.out.println("a() 메소드 호출...");
			wait(); // 얼음!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void b() {
		try {
			notify(); // notifyAll();은 또 다른 결과를 낼 것이다.
			System.out.println("b() 메소드 호출...");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class NotifyThread01 extends Thread {
	private Data data;

	public NotifyThread01(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			data.a();
		}
	}
}

class NotifyThread02 extends Thread {
	private Data data;

	public NotifyThread02(Data data) {		
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			data.b();
		}
	}
}

public class NotifyMain {

	public static void main(String[] args) {

		Data data = new Data();

		NotifyThread01 nt01 = new NotifyThread01(data);
		NotifyThread02 nt02 = new NotifyThread02(data);

		nt01.start();
		nt02.start();
	}
}
