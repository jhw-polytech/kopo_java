package Homework0519;

import java.io.File;
import java.util.Scanner;

public class CmdRename {

	Scanner sc =new Scanner(System.in);
	public void re(File dirObj) {
		
		
		System.out.println("수정할 파일명 입력해주세요");
		String NF=sc.nextLine();
		System.out.println("수정할 이름");
		String NF2=sc.nextLine();
		
		File f1 =new File("iotest/"+NF);
		File f2 = new File("iotest/"+NF2);
		
		System.out.println(f1.renameTo(f2) ? "파일 변경 성공" : "파일 변경 실패");
	}
}
