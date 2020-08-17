package kopo.ac.kr.day02;

import java.io.File;
import java.util.Scanner;

public class FolderCreate {
	
	private File newFolder = new File(IotestList.path);
	
	
	public FolderCreate() {
		
	}
	
	public void create() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("폴더생성 시작");
		System.out.println("생성할 폴더명을 입력하세요");
		String str = sc.nextLine();
		
		newFolder = new File(IotestList.path +"\\" + str);
		boolean bl = newFolder.mkdir();
		System.out.println(bl ? "폴더생성 성공" : "폴더생성 실패");
		
		
	}
	
}

		
			
			
			
			
