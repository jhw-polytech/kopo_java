package Homework0422;

 // 교수님 질문있습니다! 만약 question메소드를 끊임없이 호출하고 싶으면 어떻게 해야하나요?

public class figureMain {

	public static void main(String[] args) {
		
		figure f = new figure();
		
		/*
			while(true) {
		*/
		f.question();	// 메소드 호출
		/*
			}
			이렇게 돌리시다가 question()에서 종료하는 System.exit(0); 로 프로그램을 종료하는 코드를 추가하실 수 있습니다
		*/
	}
}
