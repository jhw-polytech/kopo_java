package kr.ac.kopo.day14.assignment;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	Scanner sc;
	
	DeleteFile(){
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("삭제할 폴더 이름을 입력해주세요: ");
		String name = sc.nextLine();
		
		File newDirObj = new File(CMD.currentDirObj + "\\" + name);
		System.out.println(newDirObj.delete()? "삭제성공" : "삭제실패");
		
	}
}
