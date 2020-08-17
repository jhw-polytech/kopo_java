package kr.ac.kopo.day13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController {

	private List<Member> list;
	private Scanner sc;

	MemberController(){
		list = new ArrayList();
		sc = new Scanner(System.in);
	}

	public void start() {
		while(true) {
			System.out.print("메뉴를 선택하세요 :  1.사용자 추가  2.패스워드 변경  3. 전체회원 목록 출력  4.나가기  : ");
			int choice = sc.nextInt();
			sc.nextLine();

			if(choice ==1 ) {
				addUser();
			}
			else if(choice == 2) {
				updatePass();
			}
			else if(choice == 3){
				printAll();
			}
			else {
				break;
			}
		}
	}

	public void printAll() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("사용자를 먼저 추가하세요!");
			return;
		}
		System.out.println("ID\t\tPASSWORD");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getId()+"\t\t"+list.get(i).getPassword());
		}

	}

	public void updatePass() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("사용자를 먼저 추가하세요!");
			return;
		}
		System.out.println("패스워드 변경서비스입니다");
		System.out.print("변경할 아이디를 입력하세요 : ");
		String id = sc.nextLine();

		int exist = isExist(list, id);
		if(exist == -1) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}

		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();

		if(!list.get(exist).getPassword().equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}

		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		list.set(exist, new Member(id,newPassword));
		System.out.println("패스워드를 변경하였습니다");
	}

	public void addUser() {
		// TODO Auto-generated method stub
		System.out.print("ID입력 : ");
		String id = sc.nextLine();

		int exist = isExist(list, id);

		System.out.print("PASS입력 : ");
		String password = sc.nextLine();
		
		if(exist!=-1) {
			list.set(exist, new Member(id,password));	// map처럼 같은 key값이 들어오면 value를 대체하게 했습니다.
			/*
				현택씨.. 어제 머리 터져라 고민한 노력이 보이네요..
				잘하셨어요... set 메소드도 찾아내고요.. ㅎㅎㅎㅎㅎㅎ
			*/

		}
		else {
			list.add(new Member(id,password));
		}

	}
	public int isExist(List<Member> list, String id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
}
