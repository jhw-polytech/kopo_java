package kr.ac.kopo.day14.assignment;

import java.io.File;

public class UpDirectory {

	UpDirectory(){}
	
	public void execute() {
//		String parent = CMD.currentDirObj.getParent();
//		File newDirObj = new File(parent);
//		newDirObj.getName();
		CMD.currentDirObj = new File(CMD.currentDirObj.getParent());
	}
}
