package kopo.ac.kr.list01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member{
	
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void SetId(String id) {
		this.id = id;
	}
	
	public void SetPassword(String password) {
		this.password = password;
	}
}

public class ListMain02 {
	
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		list.add(new Member("aaa","1111"));
		list.add(new Member("bbb","2222"));
		list.add(new Member("ccc","3333"));
		list.add(new Member("ddd","4444"));
		
		int i = 0;
		int idx = 0;
		while(i<list.size()) {
			
			System.out.println("패스워드 변경 서비스 입니다");
			System.out.println("변경할 아이디를 입력하세요 : ");
			String inputid = sc.nextLine();
			
			
			for(int j = 0;j<list.size();j++) {
				if(list.get(j).getId().equals(inputid) == true) {
					idx = j;
					
					System.out.println(idx);
					System.out.println("현재 패스워드를 입력하세요");
					String password = sc.nextLine();
					
					if(!list.get(idx).getPassword().equals(password)) {
						System.out.println("패스워드가 틀렸습니다");
						System.out.println("서비스를 종료합니다");
						System.exit(0);
					
					} else {
						System.out.println("변경할 패스워드를 입력하세요 : ");
						String newPassword = sc.nextLine();
						list.get(i).SetPassword(newPassword);
					}
					
					System.out.println("계속 진행 하시겠습니까? Yes(1) or No(0)");
					int choice = sc.nextInt();
					sc.nextLine();
					
					if(choice == 0) {
						System.out.println("서비스를 종료합니다");
						System.out.println("수정된 결과");
						for(Member m  : list ) {
							System.out.println("ID : " + m.getId() + " ,Password :" + m.getPassword());
						}
						System.exit(0);
						}
						
				} 
						
					
				i++;
				
				
			}
			
			
		}
		
		
	}
	
}
			
		

			
		
			
			
			
		
		
		

