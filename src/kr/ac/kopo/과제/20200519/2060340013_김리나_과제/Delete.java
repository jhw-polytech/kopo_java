package kr.ac.kopo.day14.homework2;

import java.io.File;
import java.util.List;
// 파일 삭제 기능 // 
public class Delete extends BaseUI {

	@Override
	public void execute() {
		mainUI();
		String delFile = scanStr("삭제할 폴더/파일 이름을 입력하세요. ");
		File file = new File(currentPath + "/" + delFile);// 삭제할 파일로 새로운 경로로 파일객체 생성 
		if(file.exists()) {// 파일이 존재하면 
			if(file.isDirectory()) {// 파일이 폴더라면 안의 내용물을 모두 지운다. 
				System.out.println("폴더를 지웁니다. ");
					File[] fileList = file.listFiles();
					for(File file2 : fileList) {
						System.out.println(file2.getName());
						file2.delete();
					}
				file.delete();// 내용물을 지운후 폴더도 지운다. 
			} else {
				System.out.println("파일을 지웁니다. ");// 폴더가 아니라 파일이면 바로 지운다. 
				file.delete();
			}
		} else {
			System.out.println("해당 폴더/파일이 없습니다.");
		}
	}

}
