package kr.ac.kopo.assignment.day14;

import java.util.Scanner;
import java.io.File;

public class Move {
	
	public File move(File dirObj) {
		Scanner sc = new Scanner(System.in);
		System.out.println("어느 디렉토리로 이동하시겠습니까  : ");
		String dir = sc.nextLine();
		File moveDir = new File(dirObj.getPath()+"\\" + dir);
		
		return moveDir;
	}
	

}
