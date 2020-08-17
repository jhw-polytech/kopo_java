package kr.ac.jinwoo.day12.homework.BoardHomework;

import java.util.Scanner;

// 유저 기능
public class UserUtil {

	private UserDB userDB = null;
	private boolean bConnect = false;
	private Scanner sc = new Scanner(System.in);
	
	UserUtil() {
		connect();
	}
	
	// 디비에 접속
	public boolean connect() {
		
		userDB = new UserDB();
		bConnect = true;
		return true;
	}
	
	public User login() {
		// user db에 있는지 확인
		
		User retUser = null;
		
		if(!bConnect) 
			return retUser;
		
		boolean ret = false;
		
		while(true) {
			System.out.println("로그인 화면");
			String id = inputString("ID를 입력하세요 (0 입력 시 전 단계로 돌아감.): ");
			if(id.equals("0")) {
				break;
			}
			String pw = inputString("비밀번호를 입력하세요 : ");
			
			User user = new User(id, pw);
			
			ret =  userDB.selectDataToDB(user);
			
			if(ret) {
				System.out.println("\n로그인 되었습니다.\n");
				retUser = user;
				break;
			}
			else {
				System.out.println("\n잘못 입력하셨습니다. 다시 입력해주세요.\n");
			}
		}

		return retUser;
	}
	
	public User logout(User user) {
		
		User retUser = null;
		
		while(true) {
			
			String cmd = inputString("로그아웃 하시겠습니까? (Y 로그아웃  N 취소): ");
			if(!(cmd.equals("Y") || cmd.equals("y")) || (cmd.equals("N") || cmd.equals("n"))) {
				System.out.println("다시 입력해주세요.");
			}
			
			if(cmd.equals("Y") || cmd.equals("y")) {
				System.out.println("로그아웃 되었습니다.");
				retUser = null;
				break;
			}
			else if(cmd.equals("N") || cmd.equals("n")){
				retUser = user;
				break;
			}
		}
		
		return retUser;
	}
	
	public boolean signup(){
		
		if(!bConnect) 
			return false;
		
		boolean ret = true;
		boolean success = false;
		
		if(!userDB.chkServerCapacity()) {
			System.out.println("서버의 인원 수용량이 가득찼습니다.");
			ret = false;
		}
		
		while(true) {
			
			if(ret) {
				System.out.println("회원가입 화면");
				String id = inputString("원하는 ID를 입력하세요 (최소 6자리 이상)(0 입력 시 전 단계로 돌아감.): ");
				if(id.equals("0")) {
					break;
				}
				
				if(chkIDCondition(id)) {
					
					while(true) {
						String pw = inputString("원하는 비밀번호를 입력하세요 (최소 8자리 이상)(영문자 + 숫자 조합)(0 입력 시 전 단계로 돌아감): ");
						if(pw.equals("0")) {
							break;
						}
						if(chkPwCondition(pw)) {
							System.out.println("\n회원가입이 완료되었습니다.\n");
							User user = new User(id, pw);
							
							userDB.insertDataToDB(user);
							success = true;
							break;
						}
						else {
							System.out.println("잘못 입력하셨습니다. 다시 업력해주세요");
						}
					}
				}
				else {
					System.out.println("아이디가 6자리가 안되거나 이미 존재하는 아이디입니다. 다시 입력해주세요");
				}
			}
			
			if(!ret) 
				break;
			if(success)
				break;
			
		}
		return ret;
	}
	
	// 탈퇴
	public User secession(User user) {
		
		User retUser = null;
		
		boolean comp = false;
		
		while(true) {
			
			String cmd = inputString("정말 탈퇴 하시겠습니까? (Y 탈퇴  N 취소): ");
			if(!(cmd.equals("Y") || cmd.equals("y")) || (cmd.equals("N") || cmd.equals("n"))) {
				System.out.println("다시 입력해주세요.");
			}
			
			System.out.println();
			if(cmd.equals("Y") || cmd.equals("y")) {
				
				System.out.println("유저 id : " + user.getId());
				
				while(true) {
					String pw = inputString("비밀번호를  입력해주세요. (0 입력 시 전 화면으로 돌아가기.): ");
					
					if(pw.equals("0"))
						break;
					
					user.setPassword(pw);
					
					boolean isCheck = userDB.selectDataToDB(user);
					
					if(isCheck) {
						isCheck = userDB.deleteDataToDB(user);		
					}
					else {
						System.out.println("비밀번호가 다릅니다.");
					}
					if(isCheck) {
						System.out.println("탈퇴가 완료되었습니다.\n");
						retUser = null;
						comp = true;
						break;
					}
				}
				if(comp) 
					break;
				
			}
			else if(cmd.equals("N") || cmd.equals("n")){
				retUser = user;
				break;
			}
		}
		
		return retUser;
	}
	
	public String inputString(String msg) {
		
		System.out.print(msg);
		return sc.nextLine();
	}
	
	public boolean chkIDCondition(String id) {
		
		boolean sameFlag = userDB.selectDataToDB(id) ? true : false;
		boolean lengthFlag = (id.length() >= 6) ? true : false;
		
		return !sameFlag && lengthFlag;
	}
	
	public boolean chkPwCondition(String pw) {
		
		boolean charFlag = false, numFlag = false;
		boolean lengthFlag = (pw.length() >= 8) ? true : false;
		
		for(int i = 0; i < pw.length(); i++) {
			
			if(charFlag && numFlag) break;
			if('A' <= pw.charAt(i) && pw.charAt(i) <= 'Z') {
				charFlag = true;
			} else if('a' <= pw.charAt(i) && pw.charAt(i) <= 'z') {
				charFlag = true;
			}
			
			if('0' <= pw.charAt(i) && pw.charAt(i) <= '9') {
				numFlag = true;
			}
		}
		
		return lengthFlag && charFlag && numFlag;
	}
}
