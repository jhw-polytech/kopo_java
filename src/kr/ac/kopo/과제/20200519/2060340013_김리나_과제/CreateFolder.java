package kr.ac.kopo.day14.homework2;

import java.io.File;
// 새 폴더를 생성하는 기능 
public class CreateFolder extends BaseUI {

	@Override
	public void execute() {
		mainUI();
		String dirName = scanStr("새로운 폴더의 이름을 입력하시오. ");
		File newFile = new File(currentPath +"/" + dirName);// 원래의 디렉토리에서 새로 생성할 폴더의 이름을 더해 새로운 파일객체 생성 
		System.out.println(newFile.mkdir() ? "dir 생성 성공" : "dir 생성 실패");// mkdir() 메소드로 새 디렉토리 생성에 성공했으면 성공 출력, 실패했으면 실패 출력 
	}
}
