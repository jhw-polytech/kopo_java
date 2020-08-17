package kopo.ac.kr.day02;

import java.io.File;
import java.util.Scanner;

public class Rename {
	
	private Scanner sc;
	
	public Rename() {
		sc = new Scanner(System.in);
	}
	
	public void Rename(String str) {
		System.out.println("이름을 수정할 파일을 입력하세요");
		String filename = sc.nextLine();
		File fileobj = new File(str + "\\" + filename);
		
		if(!fileobj.exists()) {
			System.out.println("찾는 파일이 없습니다");
		} else {
			
			System.out.println("변경할 이름으로 입력하세요");
			String newfile = sc.nextLine();
			
			fileobj.renameTo(new File(str + "\\" + newfile));
			System.out.println("수정이 완료되었습니다");
		}
		
	}

}
