package kr.ac.kopo.homework11.StackQueue;

public class StackView extends StackQueueView{
	private StackUtil stackUtil;
	
	// Stack 프로그램이 실행될 때 가장먼저 보이게끔 생성자에 출력문 넣었습니다!
	public StackView() {
		stackUtil = new StackUtil();
		System.out.println("===========================================");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 삭제");
		System.out.println("3. 스택의 맨위의 객체 가져오기 (peek())");
		System.out.println("4. 전체 데이터 출력");
		System.out.println("5. 이전페이지로");
		System.out.println("6. 종료");
		System.out.println("===========================================\n\n");
		stackExecute();
	}
	
	//4를 클릭하게되면, 부모의 execute()파일이 실행된다.
	private void stackExecute() {
		while(true) {
			int ver = scanInt("원하는 동작을 선택하세요 (1,2,3,4,5,6 중 입력 가능) : ");
			if(ver == 6) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			switch(ver) {
			case 1:
				stackUtil.push();
				break;
			case 2:
				stackUtil.pop();
				break;
			case 3:
				stackUtil.peek();
				break;
			case 4:
				stackUtil.print();
				break;
			case 5:
				super.execute();
				break;
			default:
				System.out.println("잘못입력했습니다. (1,2,3,4,5 중 입력 가능)");
				break;
			}
		}
	}
}
