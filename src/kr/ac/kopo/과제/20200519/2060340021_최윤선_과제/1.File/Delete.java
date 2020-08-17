package hw.hw12.File;

import java.io.File;

public class Delete extends FileController {
	public void process(File dirObj) {
		System.out.print("삭제하고 싶은 파일 이름 : ");
		String ipt = sc.nextLine();
		File file = new File(FileView.pwd+"\\"+ipt);
		System.out.println(file.delete() ? "디렉토리 생성 성공" : "디렉토리 생성 실패");

		
	}
}
