package kr.ac.kopo.day13.lotto03;

public class MC {

	private Machine machine;

	public void ment() {
		System.out.println("안녕하세요 MC 송혜 입니다.");
		System.out.println("전국~ 로또~ 자랑~~~ 시작하겠습니다~~");

		machine.start(); // 머신 가동!! (숫자 섞기)

		for (int i = 1; i <= 6; i++) throw Exception {
			
			
			// OS를 건드리기 때문에 컴파일 시점에 오류가 발생하며, 반드시 예외처리를 해야 한다.
			Thread.sleep(1000);
			
			
			Ball ball = machine.getBall();
			System.out.println(i + "번째 로또 번호는 " + i + "입니다.");
		}

	}

}
