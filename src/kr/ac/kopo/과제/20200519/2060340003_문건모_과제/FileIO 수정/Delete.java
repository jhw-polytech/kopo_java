package kopo.ac.kr.day02;

import java.io.File;
import java.util.Scanner;

public class Delete {
	
	private Scanner sc;
	
	public Delete() {
		sc = new Scanner(System.in);
	}
	
	public void Delete(String str) {
		System.out.println("삭제할 이름을 입력하세요");
		String deleteio = sc.nextLine();
		
		File fi = new File(str + "\\" + deleteio);
		boolean bl = fi.delete();
		System.out.println(bl ? "삭제성공" : "삭제실패");
		
	}

}
