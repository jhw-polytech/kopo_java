package kr.ac.kopo.assignment.day14;

import java.util.Scanner;
import java.io.File;

public class NameEdit {
	
	
	public void edit(File dirObj) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 파일을 수정하겠습니까 : ");
		String str = sc.nextLine();
		
		File file = new File(dirObj.getPath() +"\\" + str);
		
		if(file.exists()) {
			System.out.print("새로운 파일 이름을 입력하세요 : ");
			String newStr = sc.nextLine();
			File newFile = new File(dirObj.getPath() +"\\" + newStr);
			System.out.println(file.renameTo(newFile)? "성공" : "실패");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}

}
