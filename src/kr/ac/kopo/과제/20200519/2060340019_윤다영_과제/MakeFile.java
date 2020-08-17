package kr.ac.kopo.assignment.day14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MakeFile {
	
	public void makeFile(File dirObj) {

		System.out.println("새로운 파일 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		File file = new File(dirObj.getPath()+"\\"+name);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
}
