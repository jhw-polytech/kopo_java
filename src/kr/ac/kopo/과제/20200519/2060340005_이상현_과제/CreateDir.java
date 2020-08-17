package day0519.homework;

import java.io.File;
import java.util.Scanner;

public class CreateDir {
	public void cDir(String path) {	
		System.out.print("생성할 디렉토리 이름 : ");
		Scanner n = new Scanner(System.in);
		String newDir = n.nextLine();
		n.close();
		
		File newDirObj = new File(path + "/" + newDir);
		System.out.println(newDirObj.mkdir()? newDir + "dir 생성 성공" : newDir + "dir 생성 실패");
	}
}
