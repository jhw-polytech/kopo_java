package kr.ac.kopo.day13.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	private List<Member> list;
	private Scanner sc;
	
	public void execute() {
		
	    list = new ArrayList<>();
	    sc = new Scanner(System.in);
	    defaultDataSet();
	    
	    view();
	    
		while(true) {
			print(" ======================\r\n"
					+ " 1. 전체회원 조회   \r\n" + 
					" 2. 가입하기   \r\n" + 
					" 3. 비밀번호 변경   \r\n" + 
					" 4. 로그인   \r\n" + 
					" 0. 종료   \n "
					+ "======================");
			switch (getNumber()) {
			case 1:
				print("전체회원 조회를 시작합니다.");
				view();
				break;
			case 2:
				print("가입하기를 시작합니다.");
				registerMember();
				break;
			case 3:
				print("비밀번호 변경 서비스를 시작합니다.");
				modifyPassword();
				break;
			case 4:
				print("로그인을 시작합니다.");
				login();
				break;
			case 0:
				print("프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void print(int msg) {
		System.out.println(msg);
	}
	
	public String getString() {
		return sc.nextLine();
	}
	
	public int getNumber() {
		return Integer.parseInt(sc.nextLine());
	}
	
	public void defaultDataSet() {
		list.add(new Member("tess", "1111"));
		list.add(new Member("rosa", "2222"));
		list.add(new Member("midori", "3333"));
	}
	
	public void view() {
		
		print("\t< 전체 회원 목록 >");
		for (Member member : list) {
			System.out.println("id : " + member.getId() + "\tpassword : "  + member.getPassword());
		}
		print("");
		print("회원수는 총 "+ list.size() +"명 입니다.");
		print("");
	}
	
	public void modifyPassword() {
		print("변경할 아이디를 입력하세요. : ");
		String id = getString();
		print("기존 비밀번호를 입력하세요. : ");
		String originalPassword = getString();
		boolean check = false;
		for (Member member : list) {
			if(member.getId().equals(id) && member.getPassword().equals(originalPassword)) {
				check = true;
				print("성공적으로 로그인 되었습니다.");
				print("변경하고 싶은 비밀번호를 입력하세요. : ");
				String newPassword = getString();
				member.setPassword(newPassword);
				print(member.getId() + " 으로 패스워드가 변경되었습니다. ");
				view();
			}
		}
		if (check) {
			print("좋은 하루 되십시요.");
		} else {
			print("기존 비밀번호가 틀립니다. 처음부터 다시 입력해주세요. ");
			modifyPassword();
		}
	}
	
	public void registerMember() {
		
		boolean check = false;
		String id = null;
		while(!check) {
			print("원하는 아이디를 입력하세요. : ");
			id = getString();
			check = verifyMemberById(id);
		}
		
		print("원하는 비밀번호를 입력하세요. : ");
		String password = getString();
		
		Member member = new Member(id, password);
		list.add(member);
		
		print("회원가입이 완료되었습니다.");
		member.toString();
	}
	
	public boolean verifyMemberById(String id) {
		for (Member member : list) {
			if(member.getId().equals(id)) {
				print("이미 사용된 아이디입니다. 다시 입력하세요.");
				return false;
			} 
		}
		return true;
	}
	
	public boolean verifyExistingMemberById(String id) {
		for (Member member : list) {
			if(member.getId().equals(id)) {
				print("로그인이 가능한 아이디 입니다.");
				return true;
			} 
		}
		print("해당 하는 아이디가 없습니다. 다시 입력하세요.");
		return false;
	}
	
	public boolean login() {
		
		String id = null;
		String originalPassword = null;
		boolean check = false;
		
		while(!check) {
			print("로그인할 아이디를 입력하세요. : ");
			id = getString();
			check = verifyExistingMemberById(id);
		}
		if (check) {
			print("비밀번호를 입력하세요. : ");
			originalPassword = getString();
			for (Member member : list) {
				if(member.getId().equals(id) && member.getPassword().equals(originalPassword)) {
					print("성공적으로 로그인 되었습니다.");
					print("     .∧_∧\r\n" + 
							"\r\n" + 
							"　　(`･ω･´ ) 三\r\n" + 
							"\r\n" + 
							"　     O┳〇 )\r\n" + 
							"\r\n" + 
							"　　◎し◎- 三");
					return true;
				}
			}
			print("비밀번호가 틀립니다. 목록으로 되돌아갑니다.");
			return false;
		}
		print("해당 하는 아이디가 없습니다.");
		return false;
		
	}
	
}
