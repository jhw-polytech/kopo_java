package kr.ac.kopo.day13.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HomeworkMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("aaa", "1111"));
		list.add(new Member("bbb", "2222"));
		list.add(new Member("ccc", "3333"));
		list.add(new Member("ddd", "4444"));
	
		System.out.println("패스워드 변경 서비스입니다.");
		System.out.println("변경할 아이디를 입력하세요 : ");

		String id = sc.nextLine();

		int errCode = -1; 
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getId().equals(id)) {
				
				errCode = 0;
				System.out.print("현재 패스워드를 입력하세요 : ");
				String password = sc.nextLine();

				if(list.get(i).getPassword().equals(password)) {
					System.out.println("변경할 패스워드를 입력하세요 : ");
					String newPassword = sc.nextLine();
					list.get(i).setPassword(newPassword);
					System.out.println("패스워드를 변경하였습니다.");

					System.out.println("<전체 회원 목록>");
					
					Iterator<Member> it = list.iterator();

					while (it.hasNext()) {
						Member e = it.next();
						String str1 = e.getId();
						String str2 = e.getPassword();
						System.out.println("id : " + str1 + ", passwrod : " + str2);
					}
				}
				else
					errCode = -2;
				
				break;
			}	
		}	
		
		/*
			진우씨 하는김에.. .예외처리로 errCode를 적용해보지 그랬어요~~ ^^
		*/
		if(errCode != 0) {
			
			if(errCode == -1) 
				System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
			else if(errCode == -2)
				System.out.println("패스워드가 올바르지 않습니다.");
			
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
	}
}