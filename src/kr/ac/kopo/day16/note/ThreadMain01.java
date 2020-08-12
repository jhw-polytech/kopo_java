package kr.ac.kopo.day16.note;



class AAA extends Thread { //AAA는 쓰레드! Thread를 상속받은 AAA 쓰레드가 있는 것이다.
	
	
	// run이 생김새를 모르니 override! 
	@Override
	public void run() {

		while(true) {
			System.out.println("go!!!!!");
		}
	
	}
	
}


class BBB extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("\t\t\tstop!!!!!");
		}
	}
	
}



public class ThreadMain01 {
	public static void main(String[] args) {
		
		AAA aaa = new AAA(); // ready상태에 있는 쓰레드
		BBB bbb = new BBB();
		
		// aaa와 bbb가 번갈아가며 실행됨
		aaa.start();
		bbb.start();
		
		// 일반적으로 우리가 사용하는 메소드처럼 aaa가 실행완료된 후 bbb가 실행됨. 즉, 여기서 bbb는 실행할 수 없음.(aaa 속 실행부가 무한루프)
		aaa.run();
		bbb.run();
		
	}
}
