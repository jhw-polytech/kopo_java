package homework0518;

import java.util.Scanner;

public class PassView {	
	private String UserId;
	private String UserPw;
	private int idx;
	private boolean check=true;
	Scanner sc = new Scanner(System.in);
	PassFactor factor = new PassFactor();
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	public void view() {
		print("비밀번호 변경을 시작합니다.");
		print("로그인");
		Start();
		pwChange();
		print("변경된 계정 최종 확인");
		showIdPw();
	}
	
	public void Start() {
		boolean smallCheck = true;
		while(smallCheck) {
			idCheck();
			break;
		}
		pwCheck();
	}
	
	
	public void idCheck() {
		boolean smallCheck=true;
		while(smallCheck) {
			System.out.println("아이디를 입력하세요 : ");
			String inputId = sc.nextLine();
			for(int i=0; i<factor.getList().size(); i++) {
				if((factor.getList().get(i).getId().equals(inputId))==true) {
					UserId=inputId;
					idx=i;
					this.check=true;
					print("아이디 확인 완료");
					break;
				}else {
					print("존재하지 않는 아이디입니다.");
					this.check=false;
					idCheck();
				}
			}
		}
	}
	public void pwCheck() {
		print("비밀번호를 입력하세요");
		String inputPw=sc.nextLine();
		boolean smallCheck = true;
		while(smallCheck) {
			if(factor.getList().get(idx).getPw().equals(inputPw)) {
				print("비밀번호 확인 완료");
				UserPw=inputPw;
				smallCheck = false;
			}else {
				print("존재하지 않는 계정입니다. 시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}
	public void pwChange() {
		print("변경하실 비밀번호를 입력하세요.");
		String nPw=sc.nextLine();
		factor.getList().get(idx).setPw(nPw);
		print("요청하신 비밀번호("+nPw+")로 변경 완료");
	}
	public void showIdPw() {
		print("id : " + factor.getList().get(idx).getId() + "pw : " + factor.getList().get(idx).getPw());
	}
}
