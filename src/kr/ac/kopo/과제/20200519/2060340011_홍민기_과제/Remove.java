package kr.ac.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class Remove implements FileUsable {

	public void execute() {
		
		File file = new File(FileCMD.path);
		if(file.list().length==0) {
			System.out.println("비어있는 폴더 입니다.");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 폴더의 이름을 적으시오 : ");
		String name = sc.nextLine();
		File newDirObj = new File(FileCMD.path+"\\"+name);
		
		boolean bool = newDirObj.delete();
		
		if(bool) {
			System.out.println("폴더 삭제 성공");
		}
		else {
			System.out.println("폴더 삭제 실패");
		}
	}
}
