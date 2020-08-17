package hw.hw12.File;

import java.io.File;

public class MoveUp extends FileController {
	public void process(File dirObj) {
		System.out.print("이동하고 싶은 폴더 명 입력 : ");
		String ipt = sc.nextLine();
		FileView.pwd+="\\"+ipt;
		ShowList sl = new ShowList();
		
		sl.listall(dirObj);
	}
}
