package kr.ac.kopo.day14.homework2;

import java.io.File;
// 상위 폴더 이동 기능 // 
public class MoveUp extends BaseUI {

	@Override
	public void execute() {
		mainUI();
		String parent;
		File file = new File(currentPath);
		if(file.getParent() != null) {// 상위폴더가 있으면 
			parent = file.getParent();// 상위폴더를 변수로 받아준 후 
			currentPath = parent;// 현재 경로를 상위폴더로 바꿔준다. 
			System.out.println("상위폴더로 이동했습니다. ");
		} else {
			System.out.println("상위폴더가 없습니다. ");
		}
	}

}
