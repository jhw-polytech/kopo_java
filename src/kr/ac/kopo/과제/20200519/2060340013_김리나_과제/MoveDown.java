package kr.ac.kopo.day14.homework2;
// 하위폴더로 이동 // 
public class MoveDown extends BaseUI {

	@Override
	public void execute() {
		mainUI();
		String child = scanStr("어느 폴더로 이동하시겠습니까?");
		currentPath = currentPath + "/" + child;// 현재 경로를 원하는 하위폴더 경로로 바꿔주고 
		System.out.println("하위폴더로 이동했습니다. ");// Base UI에서 MainUI에 보여주는 파일관리자가 하위폴더로 변경된다. 
	}

}
