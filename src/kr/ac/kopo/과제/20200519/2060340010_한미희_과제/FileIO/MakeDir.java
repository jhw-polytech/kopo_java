package kr.ac.kopo.day14.assignment;

import java.io.File;
import java.util.Scanner;

import kr.ac.kopo.day07.assignment.Icecream;

public class MakeDir{

	Scanner sc;
	
	MakeDir(){
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("생성할 폴더 이름을 입력해주세요: ");
		String name = sc.nextLine();
		File newDirObj = new File(CMD.currentDirObj + "\\" + name);
		System.out.println(newDirObj.mkdirs()? "생성 성공" : "생성 실패");	
		
	}
}
