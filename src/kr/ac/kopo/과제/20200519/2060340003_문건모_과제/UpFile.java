package kopo.ac.kr.day02;

import java.io.File;
import java.util.Scanner;

public class UpFile {
	
	public UpFile() {
		
	}
	
	public void up() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택할 폴더를 입력하세요 : ");
		String choice = sc.nextLine();
		
		File fileObj = new File(choice);
		String move = fileObj.getParent();
		
		fileObj = new File(move);
		System.out.println("위치가 변경되었습니다 : " +  fileObj.getName());
		
		
	}

}
