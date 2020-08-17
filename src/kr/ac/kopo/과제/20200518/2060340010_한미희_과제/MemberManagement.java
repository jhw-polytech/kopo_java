package kr.ac.kopo.day13.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManagement {

	Scanner sc;
	List<Member> list;
	
	
	MemberManagement(){
		sc = new Scanner(System.in);
		list= new ArrayList<>() ;
	}
	
	public void add(String id, String password) {
		Member m = new Member(id, password);
		list.add(m);
	}
	
	public void pwUpdate() {
		System.out.println("패스워드 변경서비스입니다");
		String id = getString("변경할 아이디를 입력하세요 : ");

		//입력한 아이디가 존재하면 변경할 패스워드를 입력받고, 그렇지 않으면 서비스 종료
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			Member m = list.get(i);
			if(m.getId().equals(id)) {
				String password = getString("현재 패스워드를 입력하세요 : ");
				
				if(m.getPassword().equals(password)) {
					String newPassword = getString("변경할 패스워드를 입력하세요 : ");
					m.setPassword(newPassword);
					System.out.println("패스워드를 변경하였습니다");
					cnt++;
					break;
				}else {
					System.out.println("패스워드가 올바르지 않습니다");
					System.out.println("서비스를 종료합니다");
					System.exit(0);
					break;
				}
			}
		}
		if(cnt == 0) {		
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
	}
	
	public void view() {
		System.out.println("< 전체 회원 목록 >");
		System.out.println("ID\tPassword\t");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + '\t' + list.get(i).getPassword() + '\t');
		}
	}
	
	public String getString(String str){
		System.out.print(str);
		String inputStr = sc.nextLine();
		return inputStr;
	}
}
