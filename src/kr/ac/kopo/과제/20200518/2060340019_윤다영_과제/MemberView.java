package kr.ac.kopo.assignment.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberView {
	
	private Scanner sc;
	private List<Member> list;
	
	public MemberView() {		
		sc = new Scanner(System.in);
		list = new ArrayList<>();
		
		
	}
	
	
	public void execute() {
		this.userData();
		this.changePassword();
		this.printUserList();		
	}
	
	
	public void userData() {
		
		Member m1 = new Member("aaa", "1111");
		Member m2 = new Member("bbb", "2222");
		Member m3 = new Member("ccc", "3333");
		Member m4 = new Member("ddd", "4444");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
	}
	
	
	
	public void changePassword() {
		System.out.println("패스워드 변경 서비스입니다.");
	    System.out.print("변경할 아이디를 입력하세요  : ");
	    String id = sc.nextLine();
	   
	    int temp = 0;
	    int userNum = 0;
	    while(temp < list.size()) {
	    	if(list.get(temp).getId().equals(id)) {
	    		userNum = temp;
	    		break;
	    	}else { 		    		
	    		temp++;    		
	    	}
	    }
	    
	    if(temp == list.size()) {
	    	System.out.println("입력하신 아이디 [" + id +"]는 존재하지 않습니다.");
            System.out.println("서비스를 종료합니다."); 
            System.exit(0);
	    }
	    
	    System.out.print("현재 패스워드를 입력하세요 : ");
	    String password = sc.nextLine();
	    if(list.get(userNum).getPassword().equals(password)) {
	    	System.out.print("변경할 패스워드를 입력하세요 : ");
	    	String newPassword = sc.nextLine();
	    	list.get(userNum).setPassword(newPassword);	    	
	    }else {
	    	System.out.println("입력하신 패스워드는 존재하지 않습니다.");
            System.out.println("서비스를 종료합니다."); 
            System.exit(0);
	    }
	    
	}
	

	
	public void printUserList() {
		 System.out.println("< 전체 회원 목록 >");
		 
		 for(Member m : list) {
			 System.out.println("id : " + m.getId() + " // password : " + m.getPassword());
		 }
		 
	}

}
	
