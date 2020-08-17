package kr.ac.kopo.day14.homework2;

import java.io.File;
// 파일 이름 수정 기능 //
public class Rename extends BaseUI {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mainUI();// 파일 목록을 먼저 보여준다. 
		String what = scanStr("어떤 폴더/파일의 이름을 수정하시겠습니까? ");
		File existFile = new File(currentPath + "/" + what);// 원래의 파일 디렉토리에 수정하고자하는 파일을 더해 새로운 경로로 파일객체 생성 
		if(existFile.exists()) {
			String newName = scanStr("어떤 이름으로 수정하시겠습니까? ");
			File newFile = new File(currentPath + "/" + newName);
			System.out.println(existFile.renameTo(newFile) ? "이름이 변경되었습니다. " : "이름 수정에 실패했습니다.");// existFile을 newFile로 수정한다. 
			
		} else {
			System.out.println("존재하지 않는 폴더/파일 이름입니다. 다시 입력하세요. ");
			execute();// 존재하지 않아 수정이 안될경우 다시 함수 호출 
		}
	}

	
}
