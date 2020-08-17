package hw.hw12.File;

import java.io.File;

public class MoveDown extends FileController {
	public void process(File dirObj) {
		int index = FileView.pwd.lastIndexOf("\\");
		System.out.println(index);
		FileView.pwd = FileView.pwd.substring(1, index);
		System.out.println(FileView.pwd);
	}
}