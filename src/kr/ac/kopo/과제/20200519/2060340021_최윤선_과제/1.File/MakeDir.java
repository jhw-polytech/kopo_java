package hw.hw12.File;

import java.io.File;
import java.util.Scanner;

public class MakeDir extends FileController {
	
	public void process(File dirObj) {
		
		System.out.println("생성하고 싶은 폴더 이름 작성");
		String ipt = sc.nextLine();
		File newDirObj = new File(FileView.pwd+"\\"+ipt);
		System.out.println(newDirObj.mkdir() ? "디렉토리 생성 성공" : "디렉토리 생성 실패");
		
	}
}
