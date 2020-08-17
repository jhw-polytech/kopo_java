package kopo.ac.kr.day02;

import java.io.File;

public class MoveUp {
	
	public String moveUp(String str) {
		File fi = new File(str);
		str = fi.getParent();
		System.out.println(str + "로 이동이 성공했습니다");
		return str;
		
	}
	
	

}
