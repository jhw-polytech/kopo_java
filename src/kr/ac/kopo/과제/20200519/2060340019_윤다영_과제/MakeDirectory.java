package kr.ac.kopo.assignment.day14;

import java.io.File;
import java.util.Scanner;

public class MakeDirectory {
	
	public void makeDir(File dirObj) {
		
		System.out.println("새로운 디렉토리 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		File file = new File(dirObj.getPath()+"\\"+name);
		file.mkdir();
		
	}

}
