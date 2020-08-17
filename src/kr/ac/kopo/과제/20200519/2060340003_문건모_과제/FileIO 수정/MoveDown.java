package kopo.ac.kr.day02;

import java.util.Scanner;

public class MoveDown {
	
	private Scanner sc;
	
	public MoveDown() {
		sc = new Scanner(System.in);
	}
	
	public String moveDown(String str) {
		System.out.println("이동할 폴더명을 입력하세요");
		String move = sc.nextLine();
		
		str = str + "\\" + move;
		System.out.println(str + "로 이동이 성공했습니다");
		return str;
	}

}
