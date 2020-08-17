package Homework0519;

import java.io.File;
import java.util.Scanner;

public class CmdDelete {

	Scanner sc=new Scanner(System.in);
	public void delete(File dirObj) {
		
		System.out.println("삭제할 파일명 은?");
		String F1= sc.nextLine();
		File del = new File("iotest/"+F1);
		boolean bool=del.delete();
		System.out.println(bool ? "삭제 성공":"삭제 실패");
	}
}
