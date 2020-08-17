package Homework0519;

import java.io.File;
import java.util.Scanner;

public class CmdCreate {

	Scanner sc=new Scanner(System.in);
	public void createFolder(File mainDir) {
		
		System.out.println("생성할 폴더명은?");
		String file =sc.nextLine();
		File NF = new File("iotest/"+file);
		
		NF.mkdir();
		System.out.println(NF.mkdir() ? "생성 성공":"생성 실패");
		
	}
	
}
