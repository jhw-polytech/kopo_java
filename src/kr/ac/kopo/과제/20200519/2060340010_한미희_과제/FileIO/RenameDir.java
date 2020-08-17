package kr.ac.kopo.day14.assignment;

import java.io.File;
import java.util.Scanner;

public class RenameDir {

	Scanner sc;
	
	RenameDir(){
		sc = new Scanner(System.in);
	}
	
	public void execute() {
	System.out.println("변경할 폴더 이름을 입력해주세요: ");
	String oriName = sc.nextLine();
	File oriDirObj = new File(CMD.currentDirObj + "\\" + oriName);
	
	System.out.println("새로운 폴더 이름을 입력해주세요: ");
	String newName = sc.nextLine();
	System.out.println(oriDirObj.getAbsolutePath());
	File dirObjAbPath = new File(oriDirObj.getAbsolutePath());
	File newDirObj = new File(dirObjAbPath.getParent() + "\\" + newName);

	System.out.println(dirObjAbPath.renameTo(newDirObj)? "이름 수정 성공" : "이름 수정 실패");	
	}
	
}
