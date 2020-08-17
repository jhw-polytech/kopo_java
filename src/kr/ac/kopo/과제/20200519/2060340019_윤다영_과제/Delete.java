package kr.ac.kopo.assignment.day14;

import java.util.Scanner;
import java.io.File;

public class Delete {
	
	public void delete(File dirObj) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 파일을 삭제하겠습니까 : ");
		String str = sc.nextLine();
		
		File deleteObj = new File(dirObj.getPath()+"\\"+str);
		if(deleteObj.exists()) {
			deleteObj.delete();
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}

}
