package kopo.ac.kr.day02;

import java.io.File;
import java.util.Scanner;

public class Create {
	
	private Scanner sc;

	public Create() {
		sc = new Scanner(System.in);
	}
	
	public void create(String str) {
		System.out.println("생성할 폴더 이름을 입력하세요");
		String foldername = sc.nextLine();
		
		File dirObj = new File(str + "\\" + foldername);
		boolean bl = dirObj.mkdir();
		System.out.println(bl ? "폴더 생성" : "실패");
	}
	

}
