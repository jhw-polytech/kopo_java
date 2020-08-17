package kr.ac.kopo.day13.assignment;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberManagement m = new MemberManagement();
		m.add("aaa", "1111");
		m.add("bbb", "2222");
		m.add("ccc", "3333");
		m.add("ddd", "4444");
		
		m.pwUpdate();
		m.view();
		
	}
}
