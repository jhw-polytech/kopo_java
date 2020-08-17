package kr.ac.kopo.day14.assignment;

import java.io.File;
import java.util.Scanner;

public class DownDirectory {

	Scanner sc;
	
	DownDirectory(){
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("이동할 하위 폴더 이름을 입력해주세요: ");
		String name = sc.nextLine();
		
		CMD.currentDirObj = new File(CMD.currentDirObj + "\\" + name);
	}
}
