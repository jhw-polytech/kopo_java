package kr.ac.yeongnam.day13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		
		Member m = new Member("aaa", "1111");
		Member m2 = new Member("bbb", "2222");
		Member m3 = new Member("ccc", "3333");
		Member m4 = new Member("ddd", "4444");
		
		list.add(m);
		list.add(m2);
		list.add(m3);
		list.add(m4);
				
		System.out.println("패스워드 변경 서비스입니다.");
		System.out.print("변경할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(id)) {
				System.out.print("현재 패스워드를 입력하세요 : ");
				String password = sc.nextLine();
				
				if(list.get(i).getPassword().equals(password)) {
					System.out.print("변경할 패스워드를 입력하세요 : ");
					String newPassword = sc.nextLine();
					list.get(i).setPassword(newPassword);
					
					System.out.println();
					System.out.println("패스워드를 변경했습니다.");
					System.out.println("<전체 회원 목록>");
					
					for(int j = 0; j < list.size(); j++) {
						System.out.println("name: " + list.get(j).getName() + ", password: " + list.get(j).getPassword());
					}
					
					System.exit(0);
					
				} else {
					System.out.println("패스워드가 올바르지 않습니다.");
					System.out.println("서비스를 종료합니다.");
					System.exit(0);
				}
			} else {
				if(i == list.size()-1) {
					System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
					System.out.println("서비스를 종료합니다.");
					System.exit(0); // 프로그램 종료	
				}
			}
		}
		
	}

}
