package Homework0518;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		
		Member m= new Member("aaa","1111");
		Member m2= new Member("bbb","2222");
		Member m3= new Member("ccc","3333");
		
		list.add(m);
		list.add(m2);
		list.add(m3);
		
		//System.out.println(list.get(0).getId()=="aaa");
		
		System.out.println("패스워드 변경 서비스");
		System.out.println("변경할 아이디를 입력하세요 : ");
		
		String id=sc.nextLine();
		int i=0;
		while(i<list.size()) {
		
			if(list.get(i).getId().equals(id)){
				System.out.println("현재 비밀번호를 작성하세요");
				String pw=sc.nextLine();
				if(list.get(i).getPw().equals(pw)) {
					System.out.println("변경할 비밀번호 입력하세요");
					String Npw=sc.nextLine();
					list.get(i).SetPw(Npw);
					
					System.out.println("비밀번호 변경완료");
					break;
				}
				else {
					System.out.println("패스워드 틀렸습니다.");
					System.out.println("시스템 종료할겁니다");
					System.exit(0);
				}
			}
			i++;			
		}
		if(list.get(i).getId().equals(id)==false) {
			System.out.println("입력하신 아이디는 ["+ id+"] 없습니다");
			System.out.println("시스템 종료할겁니다");
			System.exit(0);	
		}
		
		for(Member a : list) {
			System.out.println(a.getId() +"    "+ a.getPw());
		}

	
	}
}
