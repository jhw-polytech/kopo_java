package kr.ac.kopo.day13.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		Member m = new Member("aaa", "111");
		Member m2 = new Member("bbb", "222");
		Member m3 = new Member("ccc", "333");
		
		list.add(m);
		list.add(m2);
		list.add(m3);
		
		System.out.println("패스워드 변경 서비스 입니다.");
		System.out.println("변경할 ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getId().equals(id)) {
				
			
				System.out.println("현재 패스워드 다시 입력하세요.");
				String password = sc.nextLine();
				
				if (list.get(i).getPassword().equals(password)) {
					
					System.out.println("새로운 패스워드를 입력하세요.");
					String newpassword = sc.nextLine();
					list.get(i).setPassword(newpassword);
					System.out.println("성공적으로 변경되었습니다.");
					
				} else {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
				}
			
				if (i == list.size() ){
					System.out.println("입력하신 ID는 존재하지 않습니다.");
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
				}
			}
		}
		
		Iterator<Member> iter = list.iterator();
		while(iter.hasNext()) {
			Member myInfo = iter.next();
			String mid = myInfo.getId();
			String pwd = myInfo.getPassword();
			System.out.println("[ id : " + mid + " ] , [pwd : " + pwd +" ]");
		}
	}		
}
