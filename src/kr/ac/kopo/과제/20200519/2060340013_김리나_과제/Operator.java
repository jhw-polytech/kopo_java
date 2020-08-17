package kr.ac.kopo.day14.homework2;
// 선택지를 받고 그에 맞는 클래스 메소드를 호출하는 관리자 클래스 // 
public class Operator extends BaseUI {

	Operator(){};
	@Override
	public void  execute() {
	
		while(true) {
			BaseUI.mainUI();// 첫 파일관리자 UI 출력 
			System.out.println("[C] 폴더생성 \t [R] 이름수정 \t [D] 삭제 \t [.] 상위폴더 이동 \t [m] 하위폴더 이동 \t [q] 종료 \n");
			String choice = scanStr("선택 : ");
			
			IFileUI ui = null;
			switch(choice){
			case "c" : case "C" :
				ui = new CreateFolder();
				break;
			case "r" : case "R" :
				ui = new Rename();
				break;
			case "d" : case "D" :
				ui = new Delete();
				break;
			case "." :
				ui = new MoveUp();
				break;
			case "m" : case "M" :
				ui = new MoveDown();
				break;
			case "q" : case "Q" :
				ui = new Exit();
				break;
			default : System.out.println("잘못입력하셨습니다. ");
		}
			ui.execute();// 모든 클래스가 인터페이스를 상속받아 같은 이름의 메소드를 사용한다. 
		}
	}

	
}
