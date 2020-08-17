package kr.ac.kopo.day14.homework;

import java.io.File;

public class MoveUp implements FileUsable {

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		/* split...
		String curPath = FileCMD.path;
		String[] str = curPath.split("\\\\");
		String newPath ="";
		for(int i=0;i<str.length-1;i++) {
			newPath+=str[i]+"\\";
		}
		System.out.println(newPath);
		FileCMD.path = newPath;
		*/
		
		String curPath = FileCMD.path;
		File curFile = new File(curPath);
		
		FileCMD.path = curFile.getParentFile().getAbsolutePath();
	}

}
