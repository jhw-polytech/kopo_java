package jaeheehomework;

import java.util.Scanner;

public class ChangePwd {

	//field
	private String yourId;
	private int yourIdx;
	int bool = 0;
	
	Member m = new Member();
	Scanner sc = new Scanner(System.in);
	
	// 아이디 일치 확인
	public void idCorr() {

		while (true) {
			System.out.println("아이디 입력 : ");
			String id = sc.nextLine();
			
			for (int i = 0; i < m.getMemberList().size(); i++) {
				if (m.getMemberList().get(i).getId().equals(id)) {
					yourId = id;     // 가입되어진 멤버들이 있는 리스트에 입력한 id가 존재하면 yourId로 인정
					yourIdx = i;     // 이때의 인덱스를 저장
					bool = 1;
				}
			}
			System.out.println("존재하지 않는 아이디입니다");
		}

	}

	// 비밀번호 일치
	public void pwdCorr() {
		
		System.out.println("비밀번호 입력 : ");
		String pwd = sc.nextLine();
	
		int cnt = 1;
		while(true) {
			if(m.getMemberList().get(yourIdx).getPwd().equals(pwd)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.println("비밀번호를 잘못 입력하셨습니다. 기회 " +( 5 - cnt ) + "번 남았습니다.");
				cnt = cnt + 1;
				if(cnt == 5) {
					System.exit(0);  // 5번 틀리면 종료.
				}
			}
		}
	}
	

	// 로그인
	public void logIn() {

		while (bool == 0) {
			idCorr(); // 존재하는 아이디를 입력할 때 까지 입력해야함
		}
		
		pwdCorr();
	}

	
	// 비밀번호 재설정
	public void changePwd() {
		System.out.println("원하는 비밀번호를 입력하세요");
		String newPwd = sc.nextLine();
		
		m.getMemberList().get(yourIdx).setPwd(newPwd);
		System.out.println("비밀번호가 변경되었습니다.");
	}
	
	
	//전체 id, pwd 조회
	public void printAll() {
		for(int i = 0; i < m.getMemberList().size(); i++) {
			System.out.println("id : " + m.getMemberList().get(i).getId() + 
					           ", pwd : " + m.getMemberList().get(i).getPwd());
		}
	}
	
	
	
	public void open() {
		System.out.println("로그인 하세요");
		logIn();
		
		while (true) {
			System.out.println("1. 비밀번호 재설정     2. 전체ID, PWD 조회     3.종료");
			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				changePwd();
			} else if (num == 2) {
				printAll();
			} else if (num == 3) {
				System.exit(0);
			} else {
				System.out.println("다시 선택하세요");
			}
		}
	}
}






